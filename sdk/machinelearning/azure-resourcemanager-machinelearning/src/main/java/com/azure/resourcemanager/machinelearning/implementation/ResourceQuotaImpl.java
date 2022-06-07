// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.ResourceQuotaInner;
import com.azure.resourcemanager.machinelearning.models.QuotaUnit;
import com.azure.resourcemanager.machinelearning.models.ResourceName;
import com.azure.resourcemanager.machinelearning.models.ResourceQuota;

public final class ResourceQuotaImpl implements ResourceQuota {
    private ResourceQuotaInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    ResourceQuotaImpl(
        ResourceQuotaInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String amlWorkspaceLocation() {
        return this.innerModel().amlWorkspaceLocation();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ResourceName name() {
        return this.innerModel().name();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public QuotaUnit unit() {
        return this.innerModel().unit();
    }

    public ResourceQuotaInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}