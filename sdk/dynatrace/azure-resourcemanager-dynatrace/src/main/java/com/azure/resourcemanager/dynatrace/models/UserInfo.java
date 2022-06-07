// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User info. */
@Fluent
public final class UserInfo {
    /*
     * First Name of the user
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Last Name of the user
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /*
     * Email of the user used by Dynatrace for contacting them if needed
     */
    @JsonProperty(value = "emailAddress")
    private String emailAddress;

    /*
     * Phone number of the user used by Dynatrace for contacting them if needed
     */
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    /*
     * Country of the user
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * Get the firstName property: First Name of the user.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First Name of the user.
     *
     * @param firstName the firstName value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last Name of the user.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last Name of the user.
     *
     * @param lastName the lastName value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the emailAddress property: Email of the user used by Dynatrace for contacting them if needed.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: Email of the user used by Dynatrace for contacting them if needed.
     *
     * @param emailAddress the emailAddress value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the phoneNumber property: Phone number of the user used by Dynatrace for contacting them if needed.
     *
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: Phone number of the user used by Dynatrace for contacting them if needed.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the country property: Country of the user.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country of the user.
     *
     * @param country the country value to set.
     * @return the UserInfo object itself.
     */
    public UserInfo withCountry(String country) {
        this.country = country;
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