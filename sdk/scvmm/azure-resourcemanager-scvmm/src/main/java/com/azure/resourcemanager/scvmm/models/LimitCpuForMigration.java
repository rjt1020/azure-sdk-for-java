// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LimitCpuForMigration. */
public final class LimitCpuForMigration extends ExpandableStringEnum<LimitCpuForMigration> {
    /** Static value false for LimitCpuForMigration. */
    public static final LimitCpuForMigration FALSE = fromString("false");

    /** Static value true for LimitCpuForMigration. */
    public static final LimitCpuForMigration TRUE = fromString("true");

    /**
     * Creates or finds a LimitCpuForMigration from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LimitCpuForMigration.
     */
    @JsonCreator
    public static LimitCpuForMigration fromString(String name) {
        return fromString(name, LimitCpuForMigration.class);
    }

    /**
     * Gets known LimitCpuForMigration values.
     *
     * @return known LimitCpuForMigration values.
     */
    public static Collection<LimitCpuForMigration> values() {
        return values(LimitCpuForMigration.class);
    }
}