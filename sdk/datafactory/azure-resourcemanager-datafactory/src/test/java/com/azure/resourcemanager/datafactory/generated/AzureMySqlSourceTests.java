// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureMySqlSource;

public final class AzureMySqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMySqlSource model = BinaryData.fromString(
            "{\"type\":\"AzureMySqlSource\",\"query\":\"dataqyoyjptkyfrk\",\"queryTimeout\":\"datatxwyqkkdumxd\",\"additionalColumns\":\"dataimsioffyboo\",\"sourceRetryCount\":\"dataovfundk\",\"sourceRetryWait\":\"datamyxmsbtq\",\"maxConcurrentConnections\":\"datagn\",\"disableMetricsCollection\":\"datacbjxgjudgbwr\",\"\":{\"mgsm\":\"datauzlfqhzihlzljqc\",\"ybdz\":\"dataujunqwkjfmt\"}}")
            .toObject(AzureMySqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMySqlSource model = new AzureMySqlSource().withSourceRetryCount("dataovfundk")
            .withSourceRetryWait("datamyxmsbtq").withMaxConcurrentConnections("datagn")
            .withDisableMetricsCollection("datacbjxgjudgbwr").withQueryTimeout("datatxwyqkkdumxd")
            .withAdditionalColumns("dataimsioffyboo").withQuery("dataqyoyjptkyfrk");
        model = BinaryData.fromObject(model).toObject(AzureMySqlSource.class);
    }
}
