// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.AssociationProperties;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import org.junit.jupiter.api.Assertions;

public final class AssociationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssociationProperties model = BinaryData
            .fromString(
                "{\"associationType\":\"subnets\",\"subnet\":{\"id\":\"izhwlrxy\"},\"provisioningState\":\"Accepted\"}")
            .toObject(AssociationProperties.class);
        Assertions.assertEquals(AssociationType.SUBNETS, model.associationType());
        Assertions.assertEquals("izhwlrxy", model.subnet().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssociationProperties model = new AssociationProperties().withAssociationType(AssociationType.SUBNETS)
            .withSubnet(new AssociationSubnet().withId("izhwlrxy"));
        model = BinaryData.fromObject(model).toObject(AssociationProperties.class);
        Assertions.assertEquals(AssociationType.SUBNETS, model.associationType());
        Assertions.assertEquals("izhwlrxy", model.subnet().id());
    }
}
