// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerThreatProtectionSettingsModel;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ThreatProtectionName;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ThreatProtectionState;

/**
 * Samples for ServerThreatProtectionSettings CreateOrUpdate.
 */
public final class ServerThreatProtectionSettingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerThreatProtectionSettingsCreateOrUpdate.json
     */
    /**
     * Sample code: Update a server's Threat Protection settings.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void updateAServerSThreatProtectionSettings(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        ServerThreatProtectionSettingsModel resource = manager.serverThreatProtectionSettings()
            .getWithResponse("threatprotection-4799", "threatprotection-6440", ThreatProtectionName.DEFAULT,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withState(ThreatProtectionState.ENABLED).apply();
    }
}
