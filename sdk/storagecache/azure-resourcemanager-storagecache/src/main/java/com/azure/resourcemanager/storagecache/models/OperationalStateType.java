// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Storage target operational state.
 */
public final class OperationalStateType extends ExpandableStringEnum<OperationalStateType> {
    /**
     * Static value Ready for OperationalStateType.
     */
    public static final OperationalStateType READY = fromString("Ready");

    /**
     * Static value Busy for OperationalStateType.
     */
    public static final OperationalStateType BUSY = fromString("Busy");

    /**
     * Static value Suspended for OperationalStateType.
     */
    public static final OperationalStateType SUSPENDED = fromString("Suspended");

    /**
     * Static value Flushing for OperationalStateType.
     */
    public static final OperationalStateType FLUSHING = fromString("Flushing");

    /**
     * Creates a new instance of OperationalStateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationalStateType() {
    }

    /**
     * Creates or finds a OperationalStateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationalStateType.
     */
    public static OperationalStateType fromString(String name) {
        return fromString(name, OperationalStateType.class);
    }

    /**
     * Gets known OperationalStateType values.
     * 
     * @return known OperationalStateType values.
     */
    public static Collection<OperationalStateType> values() {
        return values(OperationalStateType.class);
    }
}
