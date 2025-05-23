// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logz.LogzManager;
import com.azure.resourcemanager.logz.models.LogzMonitorResource;
import com.azure.resourcemanager.logz.models.LogzMonitorResourceUpdateParameters;
import com.azure.resourcemanager.logz.models.ManagedIdentityTypes;
import com.azure.resourcemanager.logz.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.logz.models.MonitorUpdateProperties;
import com.azure.resourcemanager.logz.models.MonitoringStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubAccountsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"NotSpecified\",\"monitoringStatus\":\"Enabled\",\"marketplaceSubscriptionStatus\":\"Suspended\",\"logzOrganizationProperties\":{\"companyName\":\"jzkzi\",\"id\":\"vvcnayr\",\"enterpriseAppId\":\"rnxxmueed\",\"singleSignOnUrl\":\"rdvstkwqqtch\"},\"userInfo\":{\"firstName\":\"mfmtdaaygdvw\",\"lastName\":\"piohgwxrtfu\",\"emailAddress\":\"epxgyqagvr\",\"phoneNumber\":\"npkukghimdblx\"},\"planData\":{\"usageType\":\"mfnjh\",\"billingCycle\":\"xw\",\"planDetails\":\"zk\",\"effectiveDate\":\"2021-08-02T13:39:17Z\"},\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":1563203885},\"identity\":{\"principalId\":\"zi\",\"tenantId\":\"jawneaiv\",\"type\":\"UserAssigned\"},\"location\":\"zel\",\"tags\":{\"lsfeaenwabfatkld\":\"r\",\"oulpjrv\":\"xbjhwuaanozjosph\"},\"id\":\"ag\",\"name\":\"rvimjwosytxitcsk\",\"type\":\"cktqumiekkezzi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogzManager manager = LogzManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        LogzMonitorResource response = manager.subAccounts()
            .updateWithResponse("dtlwwrlkd", "tncvokot", "lxdy",
                new LogzMonitorResourceUpdateParameters()
                    .withProperties(new MonitorUpdateProperties().withMonitoringStatus(MonitoringStatus.ENABLED))
                    .withTags(mapOf("ocrkvcikh", "ogjltdtbnnhad", "qgxqquezikyw", "vpa", "lla", "gxk")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zel", response.location());
        Assertions.assertEquals("r", response.tags().get("lsfeaenwabfatkld"));
        Assertions.assertEquals(MonitoringStatus.ENABLED, response.properties().monitoringStatus());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.SUSPENDED,
            response.properties().marketplaceSubscriptionStatus());
        Assertions.assertEquals("jzkzi", response.properties().logzOrganizationProperties().companyName());
        Assertions.assertEquals("rnxxmueed", response.properties().logzOrganizationProperties().enterpriseAppId());
        Assertions.assertEquals("rdvstkwqqtch", response.properties().logzOrganizationProperties().singleSignOnUrl());
        Assertions.assertEquals("mfmtdaaygdvw", response.properties().userInfo().firstName());
        Assertions.assertEquals("piohgwxrtfu", response.properties().userInfo().lastName());
        Assertions.assertEquals("epxgyqagvr", response.properties().userInfo().emailAddress());
        Assertions.assertEquals("npkukghimdblx", response.properties().userInfo().phoneNumber());
        Assertions.assertEquals("mfnjh", response.properties().planData().usageType());
        Assertions.assertEquals("xw", response.properties().planData().billingCycle());
        Assertions.assertEquals("zk", response.properties().planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T13:39:17Z"),
            response.properties().planData().effectiveDate());
        Assertions.assertEquals(ManagedIdentityTypes.USER_ASSIGNED, response.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
