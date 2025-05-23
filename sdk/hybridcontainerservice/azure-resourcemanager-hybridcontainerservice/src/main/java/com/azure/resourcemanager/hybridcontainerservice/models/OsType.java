// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The particular KubernetesVersion Image OS Type (Linux, Windows).
 */
public final class OsType extends ExpandableStringEnum<OsType> {
    /**
     * Static value Windows for OsType.
     */
    public static final OsType WINDOWS = fromString("Windows");

    /**
     * Static value Linux for OsType.
     */
    public static final OsType LINUX = fromString("Linux");

    /**
     * Creates a new instance of OsType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OsType() {
    }

    /**
     * Creates or finds a OsType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OsType.
     */
    public static OsType fromString(String name) {
        return fromString(name, OsType.class);
    }

    /**
     * Gets known OsType values.
     * 
     * @return known OsType values.
     */
    public static Collection<OsType> values() {
        return values(OsType.class);
    }
}
