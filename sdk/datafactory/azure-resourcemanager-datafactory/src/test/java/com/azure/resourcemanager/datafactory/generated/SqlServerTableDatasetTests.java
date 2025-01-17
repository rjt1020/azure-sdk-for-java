// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SqlServerTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SqlServerTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlServerTableDataset model = BinaryData.fromString(
            "{\"type\":\"SqlServerTable\",\"typeProperties\":{\"tableName\":\"datazcq\",\"schema\":\"datavnkyakck\",\"table\":\"datah\"},\"description\":\"nsddjkkd\",\"structure\":\"dataesu\",\"schema\":\"dataogfcnxcxgxum\",\"linkedServiceName\":{\"referenceName\":\"cqxmyvkxixy\",\"parameters\":{\"g\":\"dataifjc\"}},\"parameters\":{\"chmxczbyfkoc\":{\"type\":\"Bool\",\"defaultValue\":\"datauw\"}},\"annotations\":[\"datadctsnlwscrngt\"],\"folder\":{\"name\":\"rolwv\"},\"\":{\"cucti\":\"datasdksut\",\"ux\":\"dataavishbvjhxvpmqqu\",\"lexoweorocr\":\"dataphngr\",\"gbq\":\"dataicgym\"}}")
            .toObject(SqlServerTableDataset.class);
        Assertions.assertEquals("nsddjkkd", model.description());
        Assertions.assertEquals("cqxmyvkxixy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("chmxczbyfkoc").type());
        Assertions.assertEquals("rolwv", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlServerTableDataset model = new SqlServerTableDataset().withDescription("nsddjkkd").withStructure("dataesu")
            .withSchema("dataogfcnxcxgxum")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("cqxmyvkxixy").withParameters(mapOf("g", "dataifjc")))
            .withParameters(mapOf("chmxczbyfkoc",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datauw")))
            .withAnnotations(Arrays.asList("datadctsnlwscrngt")).withFolder(new DatasetFolder().withName("rolwv"))
            .withTableName("datazcq").withSchemaTypePropertiesSchema("datavnkyakck").withTable("datah");
        model = BinaryData.fromObject(model).toObject(SqlServerTableDataset.class);
        Assertions.assertEquals("nsddjkkd", model.description());
        Assertions.assertEquals("cqxmyvkxixy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("chmxczbyfkoc").type());
        Assertions.assertEquals("rolwv", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
