// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedEnvironmentsStorages List.
 */
public final class ManagedEnvironmentsStoragesListSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2025-01-01/examples/ManagedEnvironmentsStorages_List.json
     */
    /**
     * Sample code: List environments storages by subscription.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listEnvironmentsStoragesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages()
            .listWithResponse("examplerg", "managedEnv", com.azure.core.util.Context.NONE);
    }
}
