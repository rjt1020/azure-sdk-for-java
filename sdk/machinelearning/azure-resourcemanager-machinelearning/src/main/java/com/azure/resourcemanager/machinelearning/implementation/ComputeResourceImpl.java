// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeResourceInner;
import com.azure.resourcemanager.machinelearning.models.AmlComputeNodeInformation;
import com.azure.resourcemanager.machinelearning.models.ClusterUpdateParameters;
import com.azure.resourcemanager.machinelearning.models.Compute;
import com.azure.resourcemanager.machinelearning.models.ComputeResource;
import com.azure.resourcemanager.machinelearning.models.ComputeSecrets;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ScaleSettingsInformation;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class ComputeResourceImpl implements ComputeResource, ComputeResource.Definition, ComputeResource.Update {
    private ComputeResourceInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Compute properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ComputeResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String computeName;

    private ClusterUpdateParameters updateParameters;

    public ComputeResourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public ComputeResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .createOrUpdate(resourceGroupName, workspaceName, computeName, this.innerModel(), Context.NONE);
        return this;
    }

    public ComputeResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .createOrUpdate(resourceGroupName, workspaceName, computeName, this.innerModel(), context);
        return this;
    }

    ComputeResourceImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new ComputeResourceInner();
        this.serviceManager = serviceManager;
        this.computeName = name;
    }

    public ComputeResourceImpl update() {
        this.updateParameters = new ClusterUpdateParameters();
        return this;
    }

    public ComputeResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .update(resourceGroupName, workspaceName, computeName, updateParameters, Context.NONE);
        return this;
    }

    public ComputeResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .update(resourceGroupName, workspaceName, computeName, updateParameters, context);
        return this;
    }

    ComputeResourceImpl(
        ComputeResourceInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.computeName = Utils.getValueFromIdByName(innerObject.id(), "computes");
    }

    public ComputeResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .getWithResponse(resourceGroupName, workspaceName, computeName, Context.NONE)
                .getValue();
        return this;
    }

    public ComputeResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputes()
                .getWithResponse(resourceGroupName, workspaceName, computeName, context)
                .getValue();
        return this;
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes() {
        return serviceManager.computes().listNodes(resourceGroupName, workspaceName, computeName);
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes(Context context) {
        return serviceManager.computes().listNodes(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeSecrets listKeys() {
        return serviceManager.computes().listKeys(resourceGroupName, workspaceName, computeName);
    }

    public Response<ComputeSecrets> listKeysWithResponse(Context context) {
        return serviceManager.computes().listKeysWithResponse(resourceGroupName, workspaceName, computeName, context);
    }

    public void start() {
        serviceManager.computes().start(resourceGroupName, workspaceName, computeName);
    }

    public void start(Context context) {
        serviceManager.computes().start(resourceGroupName, workspaceName, computeName, context);
    }

    public void stop() {
        serviceManager.computes().stop(resourceGroupName, workspaceName, computeName);
    }

    public void stop(Context context) {
        serviceManager.computes().stop(resourceGroupName, workspaceName, computeName, context);
    }

    public void restart() {
        serviceManager.computes().restart(resourceGroupName, workspaceName, computeName);
    }

    public void restart(Context context) {
        serviceManager.computes().restart(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ComputeResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ComputeResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ComputeResourceImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ComputeResourceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ComputeResourceImpl withProperties(Compute properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ComputeResourceImpl withProperties(ScaleSettingsInformation properties) {
        this.updateParameters.withProperties(properties);
        return this;
    }
}