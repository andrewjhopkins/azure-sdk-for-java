// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logz.LogzManager;
import com.azure.resourcemanager.logz.models.LogzMonitorResource;
import com.azure.resourcemanager.logz.models.ManagedIdentityTypes;
import com.azure.resourcemanager.logz.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.logz.models.MonitoringStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MonitorsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Active\",\"logzOrganizationProperties\":{\"companyName\":\"xuconu\",\"id\":\"zf\",\"enterpriseAppId\":\"eyp\",\"singleSignOnUrl\":\"rmjmwvvjektc\"},\"userInfo\":{\"firstName\":\"nhwlrsffrzpwvl\",\"lastName\":\"q\",\"emailAddress\":\"iqylihkaetck\",\"phoneNumber\":\"fcivfsnkym\"},\"planData\":{\"usageType\":\"qhjfbebr\",\"billingCycle\":\"xerf\",\"planDetails\":\"utttxfvjrbirp\",\"effectiveDate\":\"2020-12-31T13:56:03Z\"},\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":1103023268},\"identity\":{\"principalId\":\"fnljky\",\"tenantId\":\"j\",\"type\":\"SystemAssigned\"},\"location\":\"j\",\"tags\":{\"yoxgvcltbgsnc\":\"dokgjl\",\"htxfvgxbfsmxnehm\":\"hkjeszzhbi\"},\"id\":\"vecxgodebfqkk\",\"name\":\"bmpukgriwflz\",\"type\":\"fbxzpuzycisp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogzManager manager = LogzManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<LogzMonitorResource> response
            = manager.monitors().listByResourceGroup("gyxzk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("j", response.iterator().next().location());
        Assertions.assertEquals("dokgjl", response.iterator().next().tags().get("yoxgvcltbgsnc"));
        Assertions.assertEquals(MonitoringStatus.DISABLED, response.iterator().next().properties().monitoringStatus());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.ACTIVE,
            response.iterator().next().properties().marketplaceSubscriptionStatus());
        Assertions.assertEquals("xuconu",
            response.iterator().next().properties().logzOrganizationProperties().companyName());
        Assertions.assertEquals("eyp",
            response.iterator().next().properties().logzOrganizationProperties().enterpriseAppId());
        Assertions.assertEquals("rmjmwvvjektc",
            response.iterator().next().properties().logzOrganizationProperties().singleSignOnUrl());
        Assertions.assertEquals("nhwlrsffrzpwvl", response.iterator().next().properties().userInfo().firstName());
        Assertions.assertEquals("q", response.iterator().next().properties().userInfo().lastName());
        Assertions.assertEquals("iqylihkaetck", response.iterator().next().properties().userInfo().emailAddress());
        Assertions.assertEquals("fcivfsnkym", response.iterator().next().properties().userInfo().phoneNumber());
        Assertions.assertEquals("qhjfbebr", response.iterator().next().properties().planData().usageType());
        Assertions.assertEquals("xerf", response.iterator().next().properties().planData().billingCycle());
        Assertions.assertEquals("utttxfvjrbirp", response.iterator().next().properties().planData().planDetails());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-31T13:56:03Z"),
            response.iterator().next().properties().planData().effectiveDate());
        Assertions.assertEquals(ManagedIdentityTypes.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
    }
}
