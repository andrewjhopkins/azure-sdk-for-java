// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.CreateLinkedIntegrationRuntimeRequest;

/**
 * Samples for IntegrationRuntimes CreateLinkedIntegrationRuntimeSync.
 */
public final class IntegrationRuntimesCreateLinkedIntegrationRuntimeSyncSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * IntegrationRuntimes_CreateLinkedIntegrationRuntime.json
     */
    /**
     * Sample code: IntegrationRuntimes_CreateLinkedIntegrationRuntime.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesCreateLinkedIntegrationRuntime(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.integrationRuntimes()
            .createLinkedIntegrationRuntimeWithResponse("exampleResourceGroup", "exampleFactoryName",
                "exampleIntegrationRuntime",
                new CreateLinkedIntegrationRuntimeRequest().withName("bfa92911-9fb6-4fbe-8f23-beae87bc1c83")
                    .withSubscriptionId("061774c7-4b5a-4159-a55b-365581830283")
                    .withDataFactoryName("e9955d6d-56ea-4be3-841c-52a12c1a9981")
                    .withDataFactoryLocation("West US"),
                com.azure.core.util.Context.NONE);
    }
}
