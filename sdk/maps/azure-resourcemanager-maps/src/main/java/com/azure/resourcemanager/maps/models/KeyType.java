// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether the operation refers to the primary or secondary key.
 */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /**
     * Static value primary for KeyType.
     */
    public static final KeyType PRIMARY = fromString("primary");

    /**
     * Static value secondary for KeyType.
     */
    public static final KeyType SECONDARY = fromString("secondary");

    /**
     * Creates a new instance of KeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyType() {
    }

    /**
     * Creates or finds a KeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyType.
     */
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /**
     * Gets known KeyType values.
     * 
     * @return known KeyType values.
     */
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}
