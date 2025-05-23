// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeyParameterNamesContract;
import org.junit.jupiter.api.Assertions;

public final class SubscriptionKeyParameterNamesContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriptionKeyParameterNamesContract model
            = BinaryData.fromString("{\"header\":\"hpdjpjumasxa\",\"query\":\"pqyegualhbxxh\"}")
                .toObject(SubscriptionKeyParameterNamesContract.class);
        Assertions.assertEquals("hpdjpjumasxa", model.headerProperty());
        Assertions.assertEquals("pqyegualhbxxh", model.query());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriptionKeyParameterNamesContract model
            = new SubscriptionKeyParameterNamesContract().withHeaderProperty("hpdjpjumasxa").withQuery("pqyegualhbxxh");
        model = BinaryData.fromObject(model).toObject(SubscriptionKeyParameterNamesContract.class);
        Assertions.assertEquals("hpdjpjumasxa", model.headerProperty());
        Assertions.assertEquals("pqyegualhbxxh", model.query());
    }
}
