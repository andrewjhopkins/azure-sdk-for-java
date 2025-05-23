// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridnetwork.HybridNetworkManager;
import com.azure.resourcemanager.hybridnetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hybridnetwork.models.SiteNetworkService;
import com.azure.resourcemanager.hybridnetwork.models.SkuName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SiteNetworkServicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"managedResourceGroupConfiguration\":{\"name\":\"k\",\"location\":\"rhtssr\"},\"siteReference\":{\"id\":\"mdvhazcvjy\"},\"publisherName\":\"qswbqerzwx\",\"publisherScope\":\"Unknown\",\"networkServiceDesignGroupName\":\"tdgukvlbp\",\"networkServiceDesignVersionName\":\"gdstyouam\",\"networkServiceDesignVersionOfferingLocation\":\"wreswmowegm\",\"networkServiceDesignVersionResourceReference\":{\"idType\":\"DeploymentResourceIdReference\"},\"desiredStateConfigurationGroupValueReferences\":{\"qigijiitnspxlzde\":{\"id\":\"xeyg\"},\"ueqfrojsyd\":{\"id\":\"grijwaiufanrayb\"},\"dkygywezski\":{\"id\":\"h\"}},\"lastStateNetworkServiceDesignVersionName\":\"afygzmxieqvds\",\"lastStateConfigurationGroupValueReferences\":{\"ijpodtblxpkkwj\":{\"id\":\"ixqcahyhxalybxaw\"},\"ncn\":{\"id\":\"odqhyk\"},\"oqodkadpp\":{\"id\":\"mehllizhceu\"},\"hydt\":{\"id\":\"bngqladywrx\"}}},\"identity\":{\"principalId\":\"4b0a1663-7ed3-4a86-8f0a-4ead65b15628\",\"tenantId\":\"3fb86f10-c312-4978-aefc-3318a623ed1f\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"snuyemlowuowhl\":{\"principalId\":\"14e67d61-c515-44bf-a203-73bd1dc985cf\",\"clientId\":\"c9b29ab8-ac67-475a-9ecb-c5bb27024ce8\"},\"wyrmouv\":{\"principalId\":\"829359ea-b936-4d50-a441-e418a3a51dc0\",\"clientId\":\"9c5dd388-4473-415e-961c-adb1ba81bcd0\"},\"mo\":{\"principalId\":\"cf05a4ae-7166-47db-ae41-91290b63c3dc\",\"clientId\":\"5df12bc0-54a9-47e5-8ea8-b2558dc8ec25\"},\"ltrfowtdvrf\":{\"principalId\":\"61d2e39c-7cf2-48eb-be8c-954153736894\",\"clientId\":\"6eac2dd1-8741-4d49-8dd3-3bf2d3e31ac9\"}}},\"sku\":{\"name\":\"Standard\",\"tier\":\"Basic\"},\"location\":\"vjdrqcrjidhftuk\",\"tags\":{\"fqz\":\"xlwyoj\",\"xmbjroum\":\"kfnjyixhafrat\",\"l\":\"znv\"},\"id\":\"jrhuzgf\",\"name\":\"on\",\"type\":\"tpusllywp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridNetworkManager manager = HybridNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SiteNetworkService response = manager.siteNetworkServices()
            .getByResourceGroupWithResponse("clid", "tujwjju", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vjdrqcrjidhftuk", response.location());
        Assertions.assertEquals("xlwyoj", response.tags().get("fqz"));
        Assertions.assertEquals("k", response.properties().managedResourceGroupConfiguration().name());
        Assertions.assertEquals("rhtssr", response.properties().managedResourceGroupConfiguration().location());
        Assertions.assertEquals("mdvhazcvjy", response.properties().siteReference().id());
        Assertions.assertEquals("xeyg",
            response.properties().desiredStateConfigurationGroupValueReferences().get("qigijiitnspxlzde").id());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(SkuName.STANDARD, response.sku().name());
    }
}
