// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.identity.implementation;

import com.azure.communication.identity.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.identity.implementation.models.CommunicationIdentityAccessToken;
import com.azure.communication.identity.implementation.models.CommunicationIdentityAccessTokenRequest;
import com.azure.communication.identity.implementation.models.CommunicationIdentityAccessTokenResult;
import com.azure.communication.identity.implementation.models.CommunicationIdentityCreateRequest;
import com.azure.communication.identity.models.GetTokenForTeamsUserOptions;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunicationIdentities. */
public final class CommunicationIdentitiesImpl {
    /** The proxy service used to perform REST calls. */
    private final CommunicationIdentitiesService service;

    /** The service client containing this operation class. */
    private final CommunicationIdentityClientImpl client;

    /**
     * Initializes an instance of CommunicationIdentitiesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunicationIdentitiesImpl(CommunicationIdentityClientImpl client) {
        this.service =
                RestProxy.create(
                        CommunicationIdentitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CommunicationIdentityClientCommunicationIdentities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "CommunicationIdentit")
    public interface CommunicationIdentitiesService {
        @Post("/identities")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CommunicationIdentityAccessTokenResult>> create(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CommunicationIdentityCreateRequest body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/identities/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/identities/{id}/:revokeAccessTokens")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> revokeAccessTokens(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/teamsUser/:exchangeAccessToken")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CommunicationIdentityAccessToken>> exchangeTeamsUserAccessToken(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") GetTokenForTeamsUserOptions body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/identities/{id}/:issueAccessToken")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CommunicationIdentityAccessToken>> issueAccessToken(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CommunicationIdentityAccessTokenRequest body,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessTokenResult>> createWithResponseAsync(
            CommunicationIdentityCreateRequest body) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.create(this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context));
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessTokenResult>> createWithResponseAsync(
            CommunicationIdentityCreateRequest body, Context context) {
        final String accept = "application/json";
        return service.create(this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessTokenResult> createAsync(CommunicationIdentityCreateRequest body) {
        return createWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessTokenResult> createAsync(
            CommunicationIdentityCreateRequest body, Context context) {
        return createWithResponseAsync(body, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentityAccessTokenResult create(CommunicationIdentityCreateRequest body) {
        return createAsync(body).block();
    }

    /**
     * Create a new identity, and optionally, an access token.
     *
     * @param body If specified, creates also a Communication Identity access token associated with the identity and
     *     containing the requested scopes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity with access token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationIdentityAccessTokenResult> createWithResponse(
            CommunicationIdentityCreateRequest body, Context context) {
        return createWithResponseAsync(body, context).block();
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.delete(this.client.getEndpoint(), id, this.client.getApiVersion(), accept, context));
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id, Context context) {
        final String accept = "application/json";
        return service.delete(this.client.getEndpoint(), id, this.client.getApiVersion(), accept, context);
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String id) {
        return deleteWithResponseAsync(id).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String id, Context context) {
        return deleteWithResponseAsync(id, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String id) {
        deleteAsync(id).block();
    }

    /**
     * Delete the identity, revoke all tokens for the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String id, Context context) {
        return deleteWithResponseAsync(id, context).block();
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokeAccessTokensWithResponseAsync(String id) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.revokeAccessTokens(
                                this.client.getEndpoint(), id, this.client.getApiVersion(), accept, context));
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokeAccessTokensWithResponseAsync(String id, Context context) {
        final String accept = "application/json";
        return service.revokeAccessTokens(this.client.getEndpoint(), id, this.client.getApiVersion(), accept, context);
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> revokeAccessTokensAsync(String id) {
        return revokeAccessTokensWithResponseAsync(id).flatMap(ignored -> Mono.empty());
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> revokeAccessTokensAsync(String id, Context context) {
        return revokeAccessTokensWithResponseAsync(id, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void revokeAccessTokens(String id) {
        revokeAccessTokensAsync(id).block();
    }

    /**
     * Revoke all access tokens for the specific identity.
     *
     * @param id Identifier of the identity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> revokeAccessTokensWithResponse(String id, Context context) {
        return revokeAccessTokensWithResponseAsync(id, context).block();
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessToken>> exchangeTeamsUserAccessTokenWithResponseAsync(
            GetTokenForTeamsUserOptions body) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.exchangeTeamsUserAccessToken(
                                this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context));
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessToken>> exchangeTeamsUserAccessTokenWithResponseAsync(
            GetTokenForTeamsUserOptions body, Context context) {
        final String accept = "application/json";
        return service.exchangeTeamsUserAccessToken(
                this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessToken> exchangeTeamsUserAccessTokenAsync(GetTokenForTeamsUserOptions body) {
        return exchangeTeamsUserAccessTokenWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessToken> exchangeTeamsUserAccessTokenAsync(
            GetTokenForTeamsUserOptions body, Context context) {
        return exchangeTeamsUserAccessTokenWithResponseAsync(body, context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentityAccessToken exchangeTeamsUserAccessToken(GetTokenForTeamsUserOptions body) {
        return exchangeTeamsUserAccessTokenAsync(body).block();
    }

    /**
     * Exchange an Azure Active Directory (Azure AD) access token of a Teams user for a new Communication Identity
     * access token with a matching expiration time.
     *
     * @param body Request payload for the token exchange.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationIdentityAccessToken> exchangeTeamsUserAccessTokenWithResponse(
            GetTokenForTeamsUserOptions body, Context context) {
        return exchangeTeamsUserAccessTokenWithResponseAsync(body, context).block();
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessToken>> issueAccessTokenWithResponseAsync(
            String id, CommunicationIdentityAccessTokenRequest body) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.issueAccessToken(
                                this.client.getEndpoint(), id, this.client.getApiVersion(), body, accept, context));
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityAccessToken>> issueAccessTokenWithResponseAsync(
            String id, CommunicationIdentityAccessTokenRequest body, Context context) {
        final String accept = "application/json";
        return service.issueAccessToken(
                this.client.getEndpoint(), id, this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessToken> issueAccessTokenAsync(
            String id, CommunicationIdentityAccessTokenRequest body) {
        return issueAccessTokenWithResponseAsync(id, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityAccessToken> issueAccessTokenAsync(
            String id, CommunicationIdentityAccessTokenRequest body, Context context) {
        return issueAccessTokenWithResponseAsync(id, body, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentityAccessToken issueAccessToken(String id, CommunicationIdentityAccessTokenRequest body) {
        return issueAccessTokenAsync(id, body).block();
    }

    /**
     * Issue a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requested scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an access token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationIdentityAccessToken> issueAccessTokenWithResponse(
            String id, CommunicationIdentityAccessTokenRequest body, Context context) {
        return issueAccessTokenWithResponseAsync(id, body, context).block();
    }
}