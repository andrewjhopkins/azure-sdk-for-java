// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkProperties;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import com.azure.resourcemanager.networkcloud.models.EndpointDependency;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudServicesNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudServicesNetworkProperties model = BinaryData.fromString(
            "{\"additionalEgressEndpoints\":[{\"category\":\"vgyuguos\",\"endpoints\":[{\"domainName\":\"kfssxqukkf\",\"port\":4186813659074842761},{\"domainName\":\"gsxnkjzkdeslpv\",\"port\":6216827827800062431},{\"domainName\":\"i\",\"port\":7595800404721280957},{\"domainName\":\"xpkd\",\"port\":4555004603900701815}]},{\"category\":\"iuebbaumny\",\"endpoints\":[{\"domainName\":\"ped\",\"port\":2245881351334058994},{\"domainName\":\"a\",\"port\":4279977584762450949},{\"domainName\":\"smtxpsieb\",\"port\":4922743900723589322},{\"domainName\":\"pesapskrdqmhjj\",\"port\":3744961131672427134}]},{\"category\":\"dwkyzxuu\",\"endpoints\":[{\"domainName\":\"ncwscwsvlxoto\",\"port\":8759230338879353208}]}],\"associatedResourceIds\":[\"qsx\",\"nmic\",\"kvceoveilovnotyf\"],\"clusterId\":\"cnjbkcnxdhbt\",\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"ywpnvjt\",\"enableDefaultEgressEndpoints\":\"True\",\"enabledEgressEndpoints\":[{\"category\":\"mclfplphoxuscr\",\"endpoints\":[{\"domainName\":\"bgyepsbj\",\"port\":1292231161047660234}]},{\"category\":\"ugxywpmueef\",\"endpoints\":[{\"domainName\":\"wfqkquj\",\"port\":4933297733628720564},{\"domainName\":\"yonobgl\",\"port\":2037860481850907584},{\"domainName\":\"xtccmg\",\"port\":4531156159452032810},{\"domainName\":\"ytlmoyrxvwfud\",\"port\":7047535531175801519}]},{\"category\":\"txhdzh\",\"endpoints\":[{\"domainName\":\"qj\",\"port\":1196903059215633177},{\"domainName\":\"frlh\",\"port\":6356911616351908297},{\"domainName\":\"kyv\",\"port\":1245497822937083948}]}],\"hybridAksClustersAssociatedIds\":[\"z\",\"p\",\"kafkuwbcrnwbm\"],\"interfaceName\":\"hseyvju\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[\"hspkdeemao\",\"mx\"]}")
            .toObject(CloudServicesNetworkProperties.class);
        Assertions.assertEquals("vgyuguos", model.additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("kfssxqukkf", model.additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions.assertEquals(4186813659074842761L,
            model.additionalEgressEndpoints().get(0).endpoints().get(0).port());
        Assertions.assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE,
            model.enableDefaultEgressEndpoints());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudServicesNetworkProperties model
            = new CloudServicesNetworkProperties()
                .withAdditionalEgressEndpoints(
                    Arrays.asList(
                        new EgressEndpoint().withCategory("vgyuguos")
                            .withEndpoints(Arrays.asList(
                                new EndpointDependency().withDomainName("kfssxqukkf").withPort(4186813659074842761L),
                                new EndpointDependency().withDomainName("gsxnkjzkdeslpv")
                                    .withPort(6216827827800062431L),
                                new EndpointDependency().withDomainName("i").withPort(7595800404721280957L),
                                new EndpointDependency().withDomainName("xpkd").withPort(4555004603900701815L))),
                        new EgressEndpoint().withCategory("iuebbaumny")
                            .withEndpoints(Arrays.asList(
                                new EndpointDependency().withDomainName("ped").withPort(2245881351334058994L),
                                new EndpointDependency().withDomainName("a").withPort(4279977584762450949L),
                                new EndpointDependency().withDomainName("smtxpsieb").withPort(4922743900723589322L),
                                new EndpointDependency().withDomainName("pesapskrdqmhjj")
                                    .withPort(3744961131672427134L))),
                        new EgressEndpoint().withCategory("dwkyzxuu")
                            .withEndpoints(Arrays.asList(new EndpointDependency().withDomainName("ncwscwsvlxoto")
                                .withPort(8759230338879353208L)))))
                .withEnableDefaultEgressEndpoints(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE);
        model = BinaryData.fromObject(model).toObject(CloudServicesNetworkProperties.class);
        Assertions.assertEquals("vgyuguos", model.additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("kfssxqukkf", model.additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions.assertEquals(4186813659074842761L,
            model.additionalEgressEndpoints().get(0).endpoints().get(0).port());
        Assertions.assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE,
            model.enableDefaultEgressEndpoints());
    }
}
