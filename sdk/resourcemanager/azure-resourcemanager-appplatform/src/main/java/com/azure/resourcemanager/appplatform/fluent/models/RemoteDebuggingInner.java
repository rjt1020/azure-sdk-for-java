// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Remote debugging config. */
@Fluent
public final class RemoteDebuggingInner {
    /*
     * Application debugging port
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * Indicate if remote debugging is enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the port property: Application debugging port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Application debugging port.
     *
     * @param port the port value to set.
     * @return the RemoteDebuggingInner object itself.
     */
    public RemoteDebuggingInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the enabled property: Indicate if remote debugging is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicate if remote debugging is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the RemoteDebuggingInner object itself.
     */
    public RemoteDebuggingInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
