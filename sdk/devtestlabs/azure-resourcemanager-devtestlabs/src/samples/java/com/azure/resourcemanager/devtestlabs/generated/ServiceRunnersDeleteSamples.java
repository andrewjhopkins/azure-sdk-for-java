// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/**
 * Samples for ServiceRunners Delete.
 */
public final class ServiceRunnersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/ServiceRunners_Delete.
     * json
     */
    /**
     * Sample code: ServiceRunners_Delete.
     * 
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void serviceRunnersDelete(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.serviceRunners()
            .deleteWithResponse("resourceGroupName", "{devtestlabName}", "{servicerunnerName}",
                com.azure.core.util.Context.NONE);
    }
}
