// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionInner;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolutionList;
import com.azure.resourcemanager.security.models.SecurityFamily;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiscoveredSecuritySolutionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoveredSecuritySolutionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"securityFamily\":\"Ngfw\",\"offer\":\"akufgmjz\",\"publisher\":\"wr\",\"sku\":\"grtwae\"},\"location\":\"uzkopbminrfd\",\"id\":\"oyuhhziui\",\"name\":\"fozbhdmsmlmzqhof\",\"type\":\"rmaequ\"}],\"nextLink\":\"hxicslfaoqz\"}")
            .toObject(DiscoveredSecuritySolutionList.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("akufgmjz", model.value().get(0).offer());
        Assertions.assertEquals("wr", model.value().get(0).publisher());
        Assertions.assertEquals("grtwae", model.value().get(0).sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoveredSecuritySolutionList model = new DiscoveredSecuritySolutionList()
            .withValue(Arrays.asList(new DiscoveredSecuritySolutionInner().withSecurityFamily(SecurityFamily.NGFW)
                .withOffer("akufgmjz")
                .withPublisher("wr")
                .withSku("grtwae")));
        model = BinaryData.fromObject(model).toObject(DiscoveredSecuritySolutionList.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("akufgmjz", model.value().get(0).offer());
        Assertions.assertEquals("wr", model.value().get(0).publisher());
        Assertions.assertEquals("grtwae", model.value().get(0).sku());
    }
}
