// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.generated;

import com.azure.ai.documentintelligence.DocumentIntelligenceAdministrationClient;
import com.azure.ai.documentintelligence.DocumentIntelligenceAdministrationClientBuilder;
import com.azure.ai.documentintelligence.models.ClassifierCopyAuthorization;
import com.azure.ai.documentintelligence.models.DocumentClassifierCopyToOperationDetails;
import com.azure.ai.documentintelligence.models.DocumentClassifierDetails;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;

public class CopyDocumentClassifierTo {
    public static void main(String[] args) {
        DocumentIntelligenceAdministrationClient documentIntelligenceAdministrationClient
            = new DocumentIntelligenceAdministrationClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://myendpoint.cognitiveservices.azure.com")
                .buildClient();
        // BEGIN:com.azure.ai.documentintelligence.generated.copy-classifier-to.copy-document-classifier-to
        SyncPoller<DocumentClassifierCopyToOperationDetails, DocumentClassifierDetails> response
            = documentIntelligenceAdministrationClient.beginCopyClassifierTo("sourceClassifier",
                new ClassifierCopyAuthorization(
                    "/subscriptions/targetSub/resourceGroups/targetRG/providers/Microsoft.CognitiveServices/accounts/targetService",
                    "targetResourceRegion", "targetClassifier",
                    "https://targetEndpoint.cognitiveservices.azure.com/documentintelligence/documentClassifiers/targetClassifier",
                    "fakeTokenPlaceholder", OffsetDateTime.parse("2021-09-23T09:12:54.552Z")));
        // END:com.azure.ai.documentintelligence.generated.copy-classifier-to.copy-document-classifier-to
    }
}
