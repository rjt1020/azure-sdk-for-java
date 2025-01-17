// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * The DataSourceCredential model.
 */
@Fluent
public class DataSourceCredential implements JsonSerializable<DataSourceCredential> {
    /*
     * Unique id of data source credential
     */
    private UUID dataSourceCredentialId;

    /*
     * Name of data source credential
     */
    private String dataSourceCredentialName;

    /*
     * Description of data source credential
     */
    private String dataSourceCredentialDescription;

    /**
     * Creates an instance of DataSourceCredential class.
     */
    public DataSourceCredential() {
    }

    /**
     * Get the dataSourceCredentialId property: Unique id of data source credential.
     * 
     * @return the dataSourceCredentialId value.
     */
    public UUID getDataSourceCredentialId() {
        return this.dataSourceCredentialId;
    }

    /**
     * Set the dataSourceCredentialId property: Unique id of data source credential.
     * 
     * @param dataSourceCredentialId the dataSourceCredentialId value to set.
     * @return the DataSourceCredential object itself.
     */
    DataSourceCredential setDataSourceCredentialId(UUID dataSourceCredentialId) {
        this.dataSourceCredentialId = dataSourceCredentialId;
        return this;
    }

    /**
     * Get the dataSourceCredentialName property: Name of data source credential.
     * 
     * @return the dataSourceCredentialName value.
     */
    public String getDataSourceCredentialName() {
        return this.dataSourceCredentialName;
    }

    /**
     * Set the dataSourceCredentialName property: Name of data source credential.
     * 
     * @param dataSourceCredentialName the dataSourceCredentialName value to set.
     * @return the DataSourceCredential object itself.
     */
    public DataSourceCredential setDataSourceCredentialName(String dataSourceCredentialName) {
        this.dataSourceCredentialName = dataSourceCredentialName;
        return this;
    }

    /**
     * Get the dataSourceCredentialDescription property: Description of data source credential.
     * 
     * @return the dataSourceCredentialDescription value.
     */
    public String getDataSourceCredentialDescription() {
        return this.dataSourceCredentialDescription;
    }

    /**
     * Set the dataSourceCredentialDescription property: Description of data source credential.
     * 
     * @param dataSourceCredentialDescription the dataSourceCredentialDescription value to set.
     * @return the DataSourceCredential object itself.
     */
    public DataSourceCredential setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        this.dataSourceCredentialDescription = dataSourceCredentialDescription;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceCredentialName", this.dataSourceCredentialName);
        jsonWriter.writeStringField("dataSourceCredentialDescription", this.dataSourceCredentialDescription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataSourceCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataSourceCredential if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DataSourceCredential.
     */
    public static DataSourceCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("dataSourceCredentialType".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }

            if (discriminatorValue != null) {
                readerToUse = readerToUse.reset();
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("AzureSQLConnectionString".equals(discriminatorValue)) {
                return AzureSQLConnectionStringCredential.fromJson(readerToUse);
            } else if ("DataLakeGen2SharedKey".equals(discriminatorValue)) {
                return DataLakeGen2SharedKeyCredential.fromJson(readerToUse);
            } else if ("ServicePrincipal".equals(discriminatorValue)) {
                return ServicePrincipalCredential.fromJson(readerToUse);
            } else if ("ServicePrincipalInKV".equals(discriminatorValue)) {
                return ServicePrincipalInKVCredential.fromJson(readerToUse);
            } else {
                throw new IllegalStateException(
                    "Discriminator field 'dataSourceCredentialType' didn't match one of the expected values 'AzureSQLConnectionString', 'DataLakeGen2SharedKey', 'ServicePrincipal', or 'ServicePrincipalInKV'. It was: '"
                        + discriminatorValue + "'.");
            }
        });
    }
}
