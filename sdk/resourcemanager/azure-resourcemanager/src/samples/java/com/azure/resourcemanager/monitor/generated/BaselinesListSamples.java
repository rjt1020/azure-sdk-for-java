// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;
import java.time.Duration;

/** Samples for Baselines List. */
public final class BaselinesListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2019-03-01/examples/metricBaselines.json
     */
    /**
     * Sample code: Get metric baselines.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getMetricBaselines(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getBaselines()
            .list(
                "subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1",
                null,
                null,
                "2019-03-12T11:00:00.000Z/2019-03-12T12:00:00.000Z",
                Duration.parse("PT1H"),
                "average",
                "Low,Medium",
                null,
                null,
                Context.NONE);
    }
}
