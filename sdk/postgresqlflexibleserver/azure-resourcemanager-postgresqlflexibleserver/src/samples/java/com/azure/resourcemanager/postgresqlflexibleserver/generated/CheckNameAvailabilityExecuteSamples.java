// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityRequest;

/**
 * Samples for CheckNameAvailability Execute.
 */
public final class CheckNameAvailabilityExecuteSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * CheckNameAvailability.json
     */
    /**
     * Sample code: NameAvailability.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void nameAvailability(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.checkNameAvailabilities()
            .executeWithResponse(new CheckNameAvailabilityRequest().withName("name1")
                .withType("Microsoft.DBforPostgreSQL/flexibleServers"), com.azure.core.util.Context.NONE);
    }
}
