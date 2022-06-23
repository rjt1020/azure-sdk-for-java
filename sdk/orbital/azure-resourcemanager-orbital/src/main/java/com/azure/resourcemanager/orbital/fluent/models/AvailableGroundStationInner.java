// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Ground Stations available to schedule Contacts. */
@Fluent
public final class AvailableGroundStationInner {
    /*
     * ID of groundStation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the ground station.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Azure region.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The properties bag for this resource.
     */
    @JsonProperty(value = "properties")
    private AvailableGroundStationProperties innerProperties;

    /**
     * Get the id property: ID of groundStation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the ground station.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the location property: Azure region.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure region.
     *
     * @param location the location value to set.
     * @return the AvailableGroundStationInner object itself.
     */
    public AvailableGroundStationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties bag for this resource.
     *
     * @return the innerProperties value.
     */
    private AvailableGroundStationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}