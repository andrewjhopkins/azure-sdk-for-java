// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

/**
 * Defines values for PolicyScopeContract.
 */
public enum PolicyScopeContract {
    /**
     * Enum value Tenant.
     */
    TENANT("Tenant"),

    /**
     * Enum value Product.
     */
    PRODUCT("Product"),

    /**
     * Enum value Api.
     */
    API("Api"),

    /**
     * Enum value Operation.
     */
    OPERATION("Operation"),

    /**
     * Enum value All.
     */
    ALL("All");

    /**
     * The actual serialized value for a PolicyScopeContract instance.
     */
    private final String value;

    PolicyScopeContract(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PolicyScopeContract instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PolicyScopeContract object, or null if unable to parse.
     */
    public static PolicyScopeContract fromString(String value) {
        if (value == null) {
            return null;
        }
        PolicyScopeContract[] items = PolicyScopeContract.values();
        for (PolicyScopeContract item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
