// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

/**
 * <p>Defines fields exposing the well known authority hosts for the Azure Public Cloud and sovereign clouds.</p>
 *
 * <p>Users looking to target a specific cloud instance of Azure, can pass an instance of Azure Authority Hosts
 * as a parameter to the {@link AadCredentialBuilderBase#authorityHost(String)}. The authentication requests
 * will be routed accordingly to the specified target authority host.</p>
 *
 * @see AadCredentialBuilderBase
 */
public final class AzureAuthorityHosts {

    private AzureAuthorityHosts() {
    }

    /**
     * The host of the Microsoft Entra authority for tenants in the Azure Public Cloud.
     */
    public static final String AZURE_PUBLIC_CLOUD = "https://login.microsoftonline.com/";

    /**
     * The host of the Microsoft Entra authority for tenants in the Azure China Cloud.
     */
    public static final String AZURE_CHINA = "https://login.chinacloudapi.cn/";

    /**
     * The host of the Microsoft Entra authority for tenants in the Azure German Cloud.
     *
     * @deprecated Microsoft Cloud Germany was closed on October 29th, 2021.
     */
    @Deprecated
    public static final String AZURE_GERMANY = "https://login.microsoftonline.de/";

    /**
     * The host of the Microsoft Entra authority for tenants in the Azure US Government Cloud.
     */
    public static final String AZURE_GOVERNMENT = "https://login.microsoftonline.us/";

    static String getDefaultScope(String authorityHost) {
        switch (authorityHost) {
            case AZURE_PUBLIC_CLOUD:
                return "https://management.core.windows.net//.default";

            case AZURE_CHINA:
                return "https://management.core.chinacloudapi.cn//.default";

            case AZURE_GERMANY:
                return "https://management.core.cloudapi.de//.default";

            case AZURE_GOVERNMENT:
                return "https://management.core.usgovcloudapi.net//.default";

            default:
                return null;
        }
    }
}
