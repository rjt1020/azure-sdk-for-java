// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.education.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.education.models.RedeemRequest;
import com.azure.resourcemanager.education.models.ResourceProviders;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.education.EducationManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient, com.azure.resourcemanager.education.EducationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void redeemInvitationCode(RedeemRequest parameters) {
        this.serviceClient().redeemInvitationCode(parameters);
    }

    public Response<Void> redeemInvitationCodeWithResponse(RedeemRequest parameters, Context context) {
        return this.serviceClient().redeemInvitationCodeWithResponse(parameters, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.education.EducationManager manager() {
        return this.serviceManager;
    }
}