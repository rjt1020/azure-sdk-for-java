// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of IoTSecuritySolutionModel. */
public interface IoTSecuritySolutionModel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the workspace property: Workspace resource ID.
     *
     * @return the workspace value.
     */
    String workspace();

    /**
     * Gets the displayName property: Resource display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the status property: Status of the IoT Security solution.
     *
     * @return the status value.
     */
    SecuritySolutionStatus status();

    /**
     * Gets the export property: List of additional options for exporting to workspace data.
     *
     * @return the export value.
     */
    List<ExportData> export();

    /**
     * Gets the disabledDataSources property: Disabled data sources. Disabling these data sources compromises the
     * system.
     *
     * @return the disabledDataSources value.
     */
    List<DataSource> disabledDataSources();

    /**
     * Gets the iotHubs property: IoT Hub resource IDs.
     *
     * @return the iotHubs value.
     */
    List<String> iotHubs();

    /**
     * Gets the userDefinedResources property: Properties of the IoT Security solution's user defined resources.
     *
     * @return the userDefinedResources value.
     */
    UserDefinedResourcesProperties userDefinedResources();

    /**
     * Gets the autoDiscoveredResources property: List of resources that were automatically discovered as relevant to
     * the security solution.
     *
     * @return the autoDiscoveredResources value.
     */
    List<String> autoDiscoveredResources();

    /**
     * Gets the recommendationsConfiguration property: List of the configuration status for each recommendation type.
     *
     * @return the recommendationsConfiguration value.
     */
    List<RecommendationConfigurationProperties> recommendationsConfiguration();

    /**
     * Gets the unmaskedIpLoggingStatus property: Unmasked IP address logging status.
     *
     * @return the unmaskedIpLoggingStatus value.
     */
    UnmaskedIpLoggingStatus unmaskedIpLoggingStatus();

    /**
     * Gets the additionalWorkspaces property: List of additional workspaces.
     *
     * @return the additionalWorkspaces value.
     */
    List<AdditionalWorkspacesProperties> additionalWorkspaces();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner object.
     *
     * @return the inner object.
     */
    IoTSecuritySolutionModelInner innerModel();

    /** The entirety of the IoTSecuritySolutionModel definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The IoTSecuritySolutionModel definition stages. */
    interface DefinitionStages {
        /** The first stage of the IoTSecuritySolutionModel definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the IoTSecuritySolutionModel definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithWorkspace,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithStatus,
                DefinitionStages.WithExport,
                DefinitionStages.WithDisabledDataSources,
                DefinitionStages.WithIotHubs,
                DefinitionStages.WithUserDefinedResources,
                DefinitionStages.WithRecommendationsConfiguration,
                DefinitionStages.WithUnmaskedIpLoggingStatus,
                DefinitionStages.WithAdditionalWorkspaces {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IoTSecuritySolutionModel create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IoTSecuritySolutionModel create(Context context);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The resource location.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The resource location.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify workspace. */
        interface WithWorkspace {
            /**
             * Specifies the workspace property: Workspace resource ID.
             *
             * @param workspace Workspace resource ID.
             * @return the next definition stage.
             */
            WithCreate withWorkspace(String workspace);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Resource display name..
             *
             * @param displayName Resource display name.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: Status of the IoT Security solution..
             *
             * @param status Status of the IoT Security solution.
             * @return the next definition stage.
             */
            WithCreate withStatus(SecuritySolutionStatus status);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify export. */
        interface WithExport {
            /**
             * Specifies the export property: List of additional options for exporting to workspace data..
             *
             * @param export List of additional options for exporting to workspace data.
             * @return the next definition stage.
             */
            WithCreate withExport(List<ExportData> export);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify disabledDataSources. */
        interface WithDisabledDataSources {
            /**
             * Specifies the disabledDataSources property: Disabled data sources. Disabling these data sources
             * compromises the system..
             *
             * @param disabledDataSources Disabled data sources. Disabling these data sources compromises the system.
             * @return the next definition stage.
             */
            WithCreate withDisabledDataSources(List<DataSource> disabledDataSources);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify iotHubs. */
        interface WithIotHubs {
            /**
             * Specifies the iotHubs property: IoT Hub resource IDs.
             *
             * @param iotHubs IoT Hub resource IDs.
             * @return the next definition stage.
             */
            WithCreate withIotHubs(List<String> iotHubs);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify userDefinedResources. */
        interface WithUserDefinedResources {
            /**
             * Specifies the userDefinedResources property: Properties of the IoT Security solution's user defined
             * resources..
             *
             * @param userDefinedResources Properties of the IoT Security solution's user defined resources.
             * @return the next definition stage.
             */
            WithCreate withUserDefinedResources(UserDefinedResourcesProperties userDefinedResources);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify recommendationsConfiguration. */
        interface WithRecommendationsConfiguration {
            /**
             * Specifies the recommendationsConfiguration property: List of the configuration status for each
             * recommendation type..
             *
             * @param recommendationsConfiguration List of the configuration status for each recommendation type.
             * @return the next definition stage.
             */
            WithCreate withRecommendationsConfiguration(
                List<RecommendationConfigurationProperties> recommendationsConfiguration);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify unmaskedIpLoggingStatus. */
        interface WithUnmaskedIpLoggingStatus {
            /**
             * Specifies the unmaskedIpLoggingStatus property: Unmasked IP address logging status.
             *
             * @param unmaskedIpLoggingStatus Unmasked IP address logging status.
             * @return the next definition stage.
             */
            WithCreate withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus unmaskedIpLoggingStatus);
        }
        /** The stage of the IoTSecuritySolutionModel definition allowing to specify additionalWorkspaces. */
        interface WithAdditionalWorkspaces {
            /**
             * Specifies the additionalWorkspaces property: List of additional workspaces.
             *
             * @param additionalWorkspaces List of additional workspaces.
             * @return the next definition stage.
             */
            WithCreate withAdditionalWorkspaces(List<AdditionalWorkspacesProperties> additionalWorkspaces);
        }
    }
    /**
     * Begins update for the IoTSecuritySolutionModel resource.
     *
     * @return the stage of resource update.
     */
    IoTSecuritySolutionModel.Update update();

    /** The template for IoTSecuritySolutionModel update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithUserDefinedResources,
            UpdateStages.WithRecommendationsConfiguration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IoTSecuritySolutionModel apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IoTSecuritySolutionModel apply(Context context);
    }
    /** The IoTSecuritySolutionModel update stages. */
    interface UpdateStages {
        /** The stage of the IoTSecuritySolutionModel update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the IoTSecuritySolutionModel update allowing to specify userDefinedResources. */
        interface WithUserDefinedResources {
            /**
             * Specifies the userDefinedResources property: Properties of the IoT Security solution's user defined
             * resources..
             *
             * @param userDefinedResources Properties of the IoT Security solution's user defined resources.
             * @return the next definition stage.
             */
            Update withUserDefinedResources(UserDefinedResourcesProperties userDefinedResources);
        }
        /** The stage of the IoTSecuritySolutionModel update allowing to specify recommendationsConfiguration. */
        interface WithRecommendationsConfiguration {
            /**
             * Specifies the recommendationsConfiguration property: List of the configuration status for each
             * recommendation type..
             *
             * @param recommendationsConfiguration List of the configuration status for each recommendation type.
             * @return the next definition stage.
             */
            Update withRecommendationsConfiguration(
                List<RecommendationConfigurationProperties> recommendationsConfiguration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IoTSecuritySolutionModel refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IoTSecuritySolutionModel refresh(Context context);
}
