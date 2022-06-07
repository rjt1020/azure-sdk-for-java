// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Managed service identity (system assigned and/or user assigned identities). */
@Fluent
public class ManagedServiceIdentity {
    /*
     * The service principal ID of the system assigned identity. This property
     * will only be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The tenant ID of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * Type of managed service identity (where both SystemAssigned and
     * UserAssigned types are allowed).
     */
    @JsonProperty(value = "type", required = true)
    private ManagedServiceIdentityType type;

    /*
     * The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Get the principalId property: The service principal ID of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of the system assigned identity. This property will only be provided for
     * a system assigned identity.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     *
     * @return the type value.
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     *
     * @param type the type value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ManagedServiceIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedServiceIdentity.class);
}