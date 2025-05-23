// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The memory profile settings of the Broker.
 */
public final class BrokerMemoryProfile extends ExpandableStringEnum<BrokerMemoryProfile> {
    /**
     * Tiny memory profile.
     */
    public static final BrokerMemoryProfile TINY = fromString("Tiny");

    /**
     * Low memory profile.
     */
    public static final BrokerMemoryProfile LOW = fromString("Low");

    /**
     * Medium memory profile.
     */
    public static final BrokerMemoryProfile MEDIUM = fromString("Medium");

    /**
     * High memory profile.
     */
    public static final BrokerMemoryProfile HIGH = fromString("High");

    /**
     * Creates a new instance of BrokerMemoryProfile value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BrokerMemoryProfile() {
    }

    /**
     * Creates or finds a BrokerMemoryProfile from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BrokerMemoryProfile.
     */
    public static BrokerMemoryProfile fromString(String name) {
        return fromString(name, BrokerMemoryProfile.class);
    }

    /**
     * Gets known BrokerMemoryProfile values.
     * 
     * @return known BrokerMemoryProfile values.
     */
    public static Collection<BrokerMemoryProfile> values() {
        return values(BrokerMemoryProfile.class);
    }
}
