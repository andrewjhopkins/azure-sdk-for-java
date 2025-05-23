// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;

/**
 * Samples for ExposureControl GetFeatureValueSync.
 */
public final class ExposureControlGetFeatureValueSyncSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * ExposureControl_GetFeatureValue.json
     */
    /**
     * Sample code: ExposureControl_GetFeatureValue.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void
        exposureControlGetFeatureValue(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.exposureControls()
            .getFeatureValueWithResponse("WestEurope",
                new ExposureControlRequest().withFeatureName("ADFIntegrationRuntimeSharingRbac")
                    .withFeatureType("Feature"),
                com.azure.core.util.Context.NONE);
    }
}
