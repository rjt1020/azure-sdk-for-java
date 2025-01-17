// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingFabricSpecificSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class NetworkMappingInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkMappingInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"state\":\"obpxjmflbvvn\",\"primaryNetworkFriendlyName\":\"rkcciwwzjuqk\",\"primaryNetworkId\":\"sa\",\"primaryFabricFriendlyName\":\"wkuofoskghsauu\",\"recoveryNetworkFriendlyName\":\"jmvxie\",\"recoveryNetworkId\":\"ugidyjrr\",\"recoveryFabricArmId\":\"y\",\"recoveryFabricFriendlyName\":\"svexcsonpclhoco\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"kevle\",\"id\":\"gz\",\"name\":\"buhfmvfaxkffeiit\",\"type\":\"lvmezyvshxmzsbbz\"}")
                .toObject(NetworkMappingInner.class);
        Assertions.assertEquals("obpxjmflbvvn", model.properties().state());
        Assertions.assertEquals("rkcciwwzjuqk", model.properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("sa", model.properties().primaryNetworkId());
        Assertions.assertEquals("wkuofoskghsauu", model.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("jmvxie", model.properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("ugidyjrr", model.properties().recoveryNetworkId());
        Assertions.assertEquals("y", model.properties().recoveryFabricArmId());
        Assertions.assertEquals("svexcsonpclhoco", model.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("kevle", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkMappingInner model =
            new NetworkMappingInner()
                .withProperties(
                    new NetworkMappingProperties()
                        .withState("obpxjmflbvvn")
                        .withPrimaryNetworkFriendlyName("rkcciwwzjuqk")
                        .withPrimaryNetworkId("sa")
                        .withPrimaryFabricFriendlyName("wkuofoskghsauu")
                        .withRecoveryNetworkFriendlyName("jmvxie")
                        .withRecoveryNetworkId("ugidyjrr")
                        .withRecoveryFabricArmId("y")
                        .withRecoveryFabricFriendlyName("svexcsonpclhoco")
                        .withFabricSpecificSettings(new NetworkMappingFabricSpecificSettings()))
                .withLocation("kevle");
        model = BinaryData.fromObject(model).toObject(NetworkMappingInner.class);
        Assertions.assertEquals("obpxjmflbvvn", model.properties().state());
        Assertions.assertEquals("rkcciwwzjuqk", model.properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("sa", model.properties().primaryNetworkId());
        Assertions.assertEquals("wkuofoskghsauu", model.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("jmvxie", model.properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("ugidyjrr", model.properties().recoveryNetworkId());
        Assertions.assertEquals("y", model.properties().recoveryFabricArmId());
        Assertions.assertEquals("svexcsonpclhoco", model.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("kevle", model.location());
    }
}
