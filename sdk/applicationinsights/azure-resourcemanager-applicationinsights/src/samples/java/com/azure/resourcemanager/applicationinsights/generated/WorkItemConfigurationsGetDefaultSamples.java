// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for WorkItemConfigurations GetDefault.
 */
public final class WorkItemConfigurationsGetDefaultSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/
     * WorkItemConfigDefaultGet.json
     */
    /**
     * Sample code: WorkItemConfigurationsGetDefault.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workItemConfigurationsGetDefault(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workItemConfigurations()
            .getDefaultWithResponse("my-resource-group", "my-component", com.azure.core.util.Context.NONE);
    }
}
