// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HDInsightSchema model. */
@Fluent
public class HDInsightSchema {
    /*
     * HDInsight compute properties
     */
    @JsonProperty(value = "properties")
    private HDInsightProperties properties;

    /**
     * Get the properties property: HDInsight compute properties.
     *
     * @return the properties value.
     */
    public HDInsightProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: HDInsight compute properties.
     *
     * @param properties the properties value to set.
     * @return the HDInsightSchema object itself.
     */
    public HDInsightSchema withProperties(HDInsightProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}