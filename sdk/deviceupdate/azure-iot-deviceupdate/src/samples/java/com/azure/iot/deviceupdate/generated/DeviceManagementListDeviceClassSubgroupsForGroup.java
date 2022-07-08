// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceManagementClientBuilder;

public class DeviceManagementListDeviceClassSubgroupsForGroup {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        // BEGIN:com.azure.iot.deviceupdate.generated.devicemanagementlistdeviceclasssubgroupsforgroup.devicemanagementlistdeviceclasssubgroupsforgroup
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response =
                deviceManagementClient.listDeviceClassSubgroupsForGroup("group1", requestOptions);
        // END:com.azure.iot.deviceupdate.generated.devicemanagementlistdeviceclasssubgroupsforgroup.devicemanagementlistdeviceclasssubgroupsforgroup
    }
}