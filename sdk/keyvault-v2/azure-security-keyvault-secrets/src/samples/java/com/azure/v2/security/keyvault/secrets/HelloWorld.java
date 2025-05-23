// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.secrets;

import com.azure.v2.core.http.polling.PollResponse;
import com.azure.v2.core.http.polling.Poller;
import com.azure.v2.identity.DefaultAzureCredentialBuilder;
import com.azure.v2.security.keyvault.secrets.models.DeletedSecret;
import com.azure.v2.security.keyvault.secrets.models.KeyVaultSecret;
import com.azure.v2.security.keyvault.secrets.models.SecretProperties;

import java.time.OffsetDateTime;

/**
 * Sample demonstrates how to set, get, update and delete a secret.
 */
public class HelloWorld {
    /**
     * Authenticates with the key vault and shows how to set, get, update and delete a secret in the key vault.
     *
     * @param args Unused. Arguments to the program.
     * @throws IllegalArgumentException when invalid key vault endpoint is passed.
     * @throws InterruptedException when the thread is interrupted in sleep mode.
     */
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {
        /* Instantiate a SecretClient that will be used to call the service. Notice that the client is using default
        Azure credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault. See the README
        (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-secrets/README.md)
        for links and instructions. */
        SecretClient secretClient = new SecretClientBuilder()
            .endpoint("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        // Let's create a secret holding bank account credentials valid for 1 year. If the secret already exists in the
        // key vault, then a new version of the secret is created.
        secretClient.setSecret(new KeyVaultSecret("BankAccountPassword", "<a-secure-password>")
            .setProperties(new SecretProperties()
                .setExpiresOn(OffsetDateTime.now().plusYears(1))));

        // Let's get the bank secret from the key vault.
        KeyVaultSecret bankSecret = secretClient.getSecret("BankAccountPassword");

        System.out.printf("Secret is returned with name %s and value %s \n", bankSecret.getName(), bankSecret.getValue());

        // After one year, the bank account is still active, we need to update the expiry time of the secret.
        // The update method can be used to update the expiry attribute of the secret. It cannot be used to update the
        // value of the secret.
        bankSecret.getProperties()
            .setExpiresOn(OffsetDateTime.now().plusYears(1));
        SecretProperties updatedSecret = secretClient.updateSecretProperties(bankSecret.getProperties());

        System.out.printf("Secret's updated expiry time %s \n", updatedSecret.getExpiresOn());

        // Bank forced a password update for security purposes. Let's change the value of the secret in the key vault.
        // To achieve this, we need to create a new version of the secret in the key vault. The update operation cannot
        // change the value of the secret.
        secretClient.setSecret(new KeyVaultSecret("BankAccountPassword", "<a-different-secure-password>")
            .setProperties(new SecretProperties()
                .setExpiresOn(OffsetDateTime.now().plusYears(1))));

        // The bank account was closed, need to delete its credentials from the key vault.
        Poller<DeletedSecret, Void> deletedBankSecretPoller = secretClient.beginDeleteSecret("BankAccountPassword");
        PollResponse<DeletedSecret> deletedBankSecretPollResponse = deletedBankSecretPoller.poll();

        System.out.println("Deleted Date %s" + deletedBankSecretPollResponse.getValue().getDeletedOn().toString());
        System.out.printf("Deleted Secret's Recovery Id %s", deletedBankSecretPollResponse.getValue().getRecoveryId());

        // Secret is being deleted on the server.
        deletedBankSecretPoller.waitForCompletion();

        // If the key vault is soft-delete enabled, then deleted secrets need to be purged for permanent deletion.
        secretClient.purgeDeletedSecret("BankAccountPassword");
    }
}
