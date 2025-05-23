// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AzureReservedInstance.
 */
public final class AzureReservedInstance extends ExpandableStringEnum<AzureReservedInstance> {
    /**
     * Static value None for AzureReservedInstance.
     */
    public static final AzureReservedInstance NONE = fromString("None");

    /**
     * Static value RI1Year for AzureReservedInstance.
     */
    public static final AzureReservedInstance RI1YEAR = fromString("RI1Year");

    /**
     * Static value RI3Year for AzureReservedInstance.
     */
    public static final AzureReservedInstance RI3YEAR = fromString("RI3Year");

    /**
     * Creates a new instance of AzureReservedInstance value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureReservedInstance() {
    }

    /**
     * Creates or finds a AzureReservedInstance from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureReservedInstance.
     */
    public static AzureReservedInstance fromString(String name) {
        return fromString(name, AzureReservedInstance.class);
    }

    /**
     * Gets known AzureReservedInstance values.
     * 
     * @return known AzureReservedInstance values.
     */
    public static Collection<AzureReservedInstance> values() {
        return values(AzureReservedInstance.class);
    }
}
