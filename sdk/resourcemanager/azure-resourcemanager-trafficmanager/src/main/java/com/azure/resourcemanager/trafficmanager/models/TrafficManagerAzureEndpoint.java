// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.trafficmanager.models;

/** An immutable client-side representation of an Azure traffic manager profile Azure endpoint. */
public interface TrafficManagerAzureEndpoint extends TrafficManagerEndpoint {
    /**
     * Gets the resource id of the target Azure resource.
     *
     * @return the resource id of the target Azure resource.
     */
    String targetAzureResourceId();

    /**
     * Gets the type of the target Azure resource.
     *
     * @return the type of the target Azure resource.
     */
    TargetAzureResourceType targetResourceType();
}
