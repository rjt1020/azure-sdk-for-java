// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoadBalancerBackendAddressAdminState. */
public final class LoadBalancerBackendAddressAdminState
    extends ExpandableStringEnum<LoadBalancerBackendAddressAdminState> {
    /** Static value None for LoadBalancerBackendAddressAdminState. */
    public static final LoadBalancerBackendAddressAdminState NONE = fromString("None");

    /** Static value Up for LoadBalancerBackendAddressAdminState. */
    public static final LoadBalancerBackendAddressAdminState UP = fromString("Up");

    /** Static value Down for LoadBalancerBackendAddressAdminState. */
    public static final LoadBalancerBackendAddressAdminState DOWN = fromString("Down");

    /** Static value Drain for LoadBalancerBackendAddressAdminState. */
    public static final LoadBalancerBackendAddressAdminState DRAIN = fromString("Drain");

    /**
     * Creates or finds a LoadBalancerBackendAddressAdminState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerBackendAddressAdminState.
     */
    @JsonCreator
    public static LoadBalancerBackendAddressAdminState fromString(String name) {
        return fromString(name, LoadBalancerBackendAddressAdminState.class);
    }

    /**
     * Gets known LoadBalancerBackendAddressAdminState values.
     *
     * @return known LoadBalancerBackendAddressAdminState values.
     */
    public static Collection<LoadBalancerBackendAddressAdminState> values() {
        return values(LoadBalancerBackendAddressAdminState.class);
    }
}