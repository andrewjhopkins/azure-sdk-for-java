// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for IntegrationRuntimes GetConnectionInfoSync.
 */
public final class IntegrationRuntimesGetConnectionInfoSyncSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * IntegrationRuntimes_GetConnectionInfo.json
     */
    /**
     * Sample code: IntegrationRuntimes_GetConnectionInfo.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void
        integrationRuntimesGetConnectionInfo(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.integrationRuntimes()
            .getConnectionInfoWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime",
                com.azure.core.util.Context.NONE);
    }
}
