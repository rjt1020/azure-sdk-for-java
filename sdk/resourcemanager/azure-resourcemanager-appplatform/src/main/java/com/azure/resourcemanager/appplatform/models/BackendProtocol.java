// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackendProtocol. */
public final class BackendProtocol extends ExpandableStringEnum<BackendProtocol> {
    /** Static value GRPC for BackendProtocol. */
    public static final BackendProtocol GRPC = fromString("GRPC");

    /** Static value Default for BackendProtocol. */
    public static final BackendProtocol DEFAULT = fromString("Default");

    /**
     * Creates or finds a BackendProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackendProtocol.
     */
    @JsonCreator
    public static BackendProtocol fromString(String name) {
        return fromString(name, BackendProtocol.class);
    }

    /**
     * Gets known BackendProtocol values.
     *
     * @return known BackendProtocol values.
     */
    public static Collection<BackendProtocol> values() {
        return values(BackendProtocol.class);
    }
}
