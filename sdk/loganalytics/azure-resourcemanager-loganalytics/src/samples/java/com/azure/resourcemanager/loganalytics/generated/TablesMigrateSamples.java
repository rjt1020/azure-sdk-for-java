// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for Tables Migrate. */
public final class TablesMigrateSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/preview/2021-12-01-preview/examples/TablesMigrate.json
     */
    /**
     * Sample code: TablesGet.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void tablesGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.tables().migrateWithResponse("oiautorest6685", "oiautorest6685", "table1_CL", Context.NONE);
    }
}