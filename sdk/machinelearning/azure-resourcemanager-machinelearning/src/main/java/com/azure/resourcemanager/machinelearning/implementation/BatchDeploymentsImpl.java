// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.BatchDeploymentsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentDataInner;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentData;
import com.azure.resourcemanager.machinelearning.models.BatchDeployments;

public final class BatchDeploymentsImpl implements BatchDeployments {
    private static final ClientLogger LOGGER = new ClientLogger(BatchDeploymentsImpl.class);

    private final BatchDeploymentsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public BatchDeploymentsImpl(
        BatchDeploymentsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BatchDeploymentData> list(
        String resourceGroupName, String workspaceName, String endpointName) {
        PagedIterable<BatchDeploymentDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, endpointName);
        return Utils.mapPage(inner, inner1 -> new BatchDeploymentDataImpl(inner1, this.manager()));
    }

    public PagedIterable<BatchDeploymentData> list(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String orderBy,
        Integer top,
        String skip,
        Context context) {
        PagedIterable<BatchDeploymentDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, endpointName, orderBy, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new BatchDeploymentDataImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, deploymentName);
    }

    public void delete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    public BatchDeploymentData get(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName) {
        BatchDeploymentDataInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, endpointName, deploymentName);
        if (inner != null) {
            return new BatchDeploymentDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BatchDeploymentData> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context) {
        Response<BatchDeploymentDataInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BatchDeploymentDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchDeploymentData getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, Context.NONE)
            .getValue();
    }

    public Response<BatchDeploymentData> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, deploymentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "batchEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'batchEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    private BatchDeploymentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public BatchDeploymentDataImpl define(String name) {
        return new BatchDeploymentDataImpl(name, this.manager());
    }
}