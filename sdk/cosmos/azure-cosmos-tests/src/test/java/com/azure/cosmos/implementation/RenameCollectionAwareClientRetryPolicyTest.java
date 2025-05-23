// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.implementation.caches.RxClientCollectionCache;
import com.azure.cosmos.implementation.perPartitionCircuitBreaker.GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker;
import com.azure.cosmos.implementation.directconnectivity.WFConstants;
import com.azure.cosmos.implementation.routing.RegionalRoutingContext;
import com.azure.cosmos.implementation.perPartitionAutomaticFailover.GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover;
import io.netty.handler.timeout.ReadTimeoutException;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;

import static com.azure.cosmos.implementation.ClientRetryPolicyTest.validateSuccess;
import static com.azure.cosmos.implementation.TestUtils.mockDiagnosticsClientContext;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;

public class RenameCollectionAwareClientRetryPolicyTest {

    private final static int TIMEOUT = 10000;

    @Test(groups = "unit", timeOut = TIMEOUT)
    public void onBeforeSendRequestNotInvoked() {
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker globalPartitionEndpointManagerForPerPartitionCircuitBreaker
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker.class);
        GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover globalPartitionEndpointManagerForPerPartitionAutomaticFailover
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover.class);
        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(eq(null), eq(false));

        IRetryPolicyFactory retryPolicyFactory = new RetryPolicy(mockDiagnosticsClientContext(), endpointManager, ConnectionPolicy.getDefaultPolicy(), globalPartitionEndpointManagerForPerPartitionCircuitBreaker, globalPartitionEndpointManagerForPerPartitionAutomaticFailover);
        RxClientCollectionCache rxClientCollectionCache = Mockito.mock(RxClientCollectionCache.class);

        ISessionContainer sessionContainer = Mockito.mock(ISessionContainer.class);
        RenameCollectionAwareClientRetryPolicy renameCollectionAwareClientRetryPolicy = new RenameCollectionAwareClientRetryPolicy(sessionContainer
                , rxClientCollectionCache
                , retryPolicyFactory.getRequestPolicy(null));

        Exception exception = ReadTimeoutException.INSTANCE;

        RxDocumentServiceRequest dsr = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        dsr.requestContext = new DocumentServiceRequestContext();

        Mono<ShouldRetryResult> shouldRetry =
                renameCollectionAwareClientRetryPolicy.shouldRetry(exception);
        validateSuccess(shouldRetry, ShouldRetryValidator.builder()
                .withException(exception)
                .shouldRetry(false)
                .build());

        Mockito.verifyNoInteractions(endpointManager);
    }

    @Test(groups = "unit", timeOut = TIMEOUT)
    public void shouldRetryWithNotFoundStatusCode() throws URISyntaxException {
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker globalPartitionEndpointManagerForPerPartitionCircuitBreaker
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker.class);
        GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover globalPartitionEndpointManagerForPerPartitionAutomaticFailover
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover.class);

        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(eq(null), eq(false));

        URI locationEndToRoute = new URI("https://location1.documents.com");
        RegionalRoutingContext regionalRoutingContext = new RegionalRoutingContext(locationEndToRoute);

        Mockito.when(endpointManager.resolveServiceEndpoint(Mockito.any())).thenReturn(regionalRoutingContext);

        IRetryPolicyFactory retryPolicyFactory = new RetryPolicy(mockDiagnosticsClientContext(), endpointManager, ConnectionPolicy.getDefaultPolicy(), globalPartitionEndpointManagerForPerPartitionCircuitBreaker, globalPartitionEndpointManagerForPerPartitionAutomaticFailover);
        RxClientCollectionCache rxClientCollectionCache = Mockito.mock(RxClientCollectionCache.class);

        ISessionContainer sessionContainer = Mockito.mock(ISessionContainer.class);
        RenameCollectionAwareClientRetryPolicy renameCollectionAwareClientRetryPolicy = new RenameCollectionAwareClientRetryPolicy(sessionContainer
                , rxClientCollectionCache
                , retryPolicyFactory.getRequestPolicy(null));
        RxDocumentServiceRequest request = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        request.requestContext = new DocumentServiceRequestContext();
        renameCollectionAwareClientRetryPolicy.onBeforeSendRequest(request);

        NotFoundException notFoundException = new NotFoundException();

        Mono<ShouldRetryResult> singleShouldRetry = renameCollectionAwareClientRetryPolicy
                .shouldRetry(notFoundException);
        validateSuccess(singleShouldRetry, ShouldRetryValidator.builder()
                .withException(notFoundException)
                .shouldRetry(false)
                .build());
    }

    @Test(groups = "unit", timeOut = TIMEOUT)
    public void shouldRetryWithNotFoundStatusCodeAndReadSessionNotAvailableSubStatusCode() throws URISyntaxException {
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker globalPartitionEndpointManagerForPerPartitionCircuitBreaker
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker.class);
        GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover globalPartitionEndpointManagerForPerPartitionAutomaticFailover
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover.class);

        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(eq(null), eq(false));

        URI locationEndToRoute = new URI("https://location1.documents.com");
        RegionalRoutingContext regionalRoutingContext = new RegionalRoutingContext(locationEndToRoute);

        Mockito.when(endpointManager.resolveServiceEndpoint(Mockito.any())).thenReturn(regionalRoutingContext);

        IRetryPolicyFactory retryPolicyFactory = new RetryPolicy(mockDiagnosticsClientContext(), endpointManager, ConnectionPolicy.getDefaultPolicy(), globalPartitionEndpointManagerForPerPartitionCircuitBreaker, globalPartitionEndpointManagerForPerPartitionAutomaticFailover);
        RxClientCollectionCache rxClientCollectionCache = Mockito.mock(RxClientCollectionCache.class);

        ISessionContainer sessionContainer = Mockito.mock(ISessionContainer.class);
        RenameCollectionAwareClientRetryPolicy renameCollectionAwareClientRetryPolicy = new RenameCollectionAwareClientRetryPolicy(sessionContainer
                , rxClientCollectionCache
                , retryPolicyFactory.getRequestPolicy(null));
        RxDocumentServiceRequest request = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        request.requestContext = new DocumentServiceRequestContext();
        request.requestContext.resolvedCollectionRid = "rid_0";
        renameCollectionAwareClientRetryPolicy.onBeforeSendRequest(request);

        NotFoundException notFoundException = new NotFoundException();
        notFoundException.getResponseHeaders().put(WFConstants.BackendHeaders.SUB_STATUS,
                Integer.toString(HttpConstants.SubStatusCodes.READ_SESSION_NOT_AVAILABLE));

        DocumentCollection documentCollection = new DocumentCollection();
        documentCollection.setResourceId("rid_1");

        Mockito.when(rxClientCollectionCache.resolveCollectionAsync(BridgeInternal.getMetaDataDiagnosticContext(request.requestContext.cosmosDiagnostics), request)).thenReturn(Mono.just(new Utils.ValueHolder<>(documentCollection)));

        Mono<ShouldRetryResult> singleShouldRetry = renameCollectionAwareClientRetryPolicy
                .shouldRetry(notFoundException);
        validateSuccess(singleShouldRetry, ShouldRetryValidator.builder()
                .nullException()
                .shouldRetry(true)
                .build());
    }

    /**
     * No retry on bad request exception
     */
    @Test(groups = "unit", timeOut = TIMEOUT)
    public void shouldRetryWithGenericException() throws URISyntaxException {
        GlobalEndpointManager endpointManager = Mockito.mock(GlobalEndpointManager.class);
        GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker globalPartitionEndpointManagerForPerPartitionCircuitBreaker = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionCircuitBreaker.class);
        GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover globalPartitionEndpointManagerForPerPartitionAutomaticFailover
            = Mockito.mock(GlobalPartitionEndpointManagerForPerPartitionAutomaticFailover.class);

        URI locationEndToRoute = new URI("https://location1.documents.com");
        RegionalRoutingContext regionalRoutingContext = new RegionalRoutingContext(locationEndToRoute);

        Mockito.when(endpointManager.resolveServiceEndpoint(Mockito.any())).thenReturn(regionalRoutingContext);

        Mockito.doReturn(Mono.empty()).when(endpointManager).refreshLocationAsync(eq(null), eq(false));

        IRetryPolicyFactory retryPolicyFactory = new RetryPolicy(
            mockDiagnosticsClientContext(),
            endpointManager,
            ConnectionPolicy.getDefaultPolicy(),
            globalPartitionEndpointManagerForPerPartitionCircuitBreaker,
            globalPartitionEndpointManagerForPerPartitionAutomaticFailover);

        RxClientCollectionCache rxClientCollectionCache = Mockito.mock(RxClientCollectionCache.class);

        ISessionContainer sessionContainer = Mockito.mock(ISessionContainer.class);
        RenameCollectionAwareClientRetryPolicy renameCollectionAwareClientRetryPolicy = new RenameCollectionAwareClientRetryPolicy(sessionContainer
                , rxClientCollectionCache
                , retryPolicyFactory.getRequestPolicy(null));
        RxDocumentServiceRequest request = RxDocumentServiceRequest.createFromName(mockDiagnosticsClientContext(),
                OperationType.Create, "/dbs/db/colls/col/docs/docId", ResourceType.Document);
        request.requestContext = new DocumentServiceRequestContext();
        renameCollectionAwareClientRetryPolicy.onBeforeSendRequest(request);

        Mono<ShouldRetryResult> singleShouldRetry = renameCollectionAwareClientRetryPolicy
                .shouldRetry(new BadRequestException());
        ShouldRetryResult shouldRetryResult = singleShouldRetry.block();

        assertThat(shouldRetryResult).isNotNull();
        assertThat(shouldRetryResult.shouldRetry).isFalse();
    }
}
