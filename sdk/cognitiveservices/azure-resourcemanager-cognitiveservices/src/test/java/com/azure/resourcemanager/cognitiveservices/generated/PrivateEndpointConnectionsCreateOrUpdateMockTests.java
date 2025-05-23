// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpoint;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkServiceConnectionState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"qztw\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"upgxyjtcdxabbujf\",\"actionsRequired\":\"benbbkl\"},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"cafeddw\",\"nlzafwxudgnh\"]},\"location\":\"krtalvn\",\"etag\":\"gpbemeluclvdjju\",\"id\":\"yrdnqod\",\"name\":\"ahhxhqfaqnvzoqg\",\"type\":\"ipemchgavscz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PrivateEndpointConnection response
            = manager.privateEndpointConnections()
                .define("pqinf")
                .withExistingAccount("rl", "h")
                .withRegion("s")
                .withProperties(new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("alcxpjbyy")
                        .withActionsRequired("joqcjenkyhfqzvsq"))
                    .withGroupIds(Arrays.asList("l", "cmpzqjhhhqx", "w", "vcacoyv")))
                .create();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("upgxyjtcdxabbujf",
            response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("benbbkl", response.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("cafeddw", response.properties().groupIds().get(0));
        Assertions.assertEquals("krtalvn", response.location());
    }
}
