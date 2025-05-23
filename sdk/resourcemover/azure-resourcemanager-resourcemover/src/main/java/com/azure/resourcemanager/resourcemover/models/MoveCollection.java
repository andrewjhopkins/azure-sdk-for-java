// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveCollectionInner;
import java.util.Map;

/**
 * An immutable client-side representation of MoveCollection.
 */
public interface MoveCollection {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: The etag of the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: Defines the MSI properties of the Move Collection.
     * 
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the properties property: Defines the move collection properties.
     * 
     * @return the properties value.
     */
    MoveCollectionProperties properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.resourcemover.fluent.models.MoveCollectionInner object.
     * 
     * @return the inner object.
     */
    MoveCollectionInner innerModel();

    /**
     * The entirety of the MoveCollection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The MoveCollection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MoveCollection definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the MoveCollection definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the MoveCollection definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The Resource Group Name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the MoveCollection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MoveCollection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MoveCollection create(Context context);
        }

        /**
         * The stage of the MoveCollection definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MoveCollection definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Defines the MSI properties of the Move Collection..
             * 
             * @param identity Defines the MSI properties of the Move Collection.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the MoveCollection definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Defines the move collection properties..
             * 
             * @param properties Defines the move collection properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(MoveCollectionProperties properties);
        }
    }

    /**
     * Begins update for the MoveCollection resource.
     * 
     * @return the stage of resource update.
     */
    MoveCollection.Update update();

    /**
     * The template for MoveCollection update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MoveCollection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MoveCollection apply(Context context);
    }

    /**
     * The MoveCollection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MoveCollection update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the Resource tags..
             * 
             * @param tags Gets or sets the Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MoveCollection update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Defines the MSI properties of the Move Collection..
             * 
             * @param identity Defines the MSI properties of the Move Collection.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MoveCollection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MoveCollection refresh(Context context);

    /**
     * Initiates prepare for the set of resources included in the request body. The prepare operation is on the
     * moveResources that are in the moveState 'PreparePending' or 'PrepareFailed', on a successful completion the
     * moveResource moveState do a transition to MovePending. To aid the user to prerequisite the operation the client
     * can call operation with validateOnly property set to true.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus prepare();

    /**
     * Initiates prepare for the set of resources included in the request body. The prepare operation is on the
     * moveResources that are in the moveState 'PreparePending' or 'PrepareFailed', on a successful completion the
     * moveResource moveState do a transition to MovePending. To aid the user to prerequisite the operation the client
     * can call operation with validateOnly property set to true.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus prepare(PrepareRequest body, Context context);

    /**
     * Moves the set of resources included in the request body. The move operation is triggered after the moveResources
     * are in the moveState 'MovePending' or 'MoveFailed', on a successful completion the moveResource moveState do a
     * transition to CommitPending. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus initiateMove();

    /**
     * Moves the set of resources included in the request body. The move operation is triggered after the moveResources
     * are in the moveState 'MovePending' or 'MoveFailed', on a successful completion the moveResource moveState do a
     * transition to CommitPending. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus initiateMove(ResourceMoveRequest body, Context context);

    /**
     * Commits the set of resources included in the request body. The commit operation is triggered on the moveResources
     * in the moveState 'CommitPending' or 'CommitFailed', on a successful completion the moveResource moveState do a
     * transition to Committed. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus commit();

    /**
     * Commits the set of resources included in the request body. The commit operation is triggered on the moveResources
     * in the moveState 'CommitPending' or 'CommitFailed', on a successful completion the moveResource moveState do a
     * transition to Committed. To aid the user to prerequisite the operation the client can call operation with
     * validateOnly property set to true.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus commit(CommitRequest body, Context context);

    /**
     * Discards the set of resources included in the request body. The discard operation is triggered on the
     * moveResources in the moveState 'CommitPending' or 'DiscardFailed', on a successful completion the moveResource
     * moveState do a transition to MovePending. To aid the user to prerequisite the operation the client can call
     * operation with validateOnly property set to true.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus discard();

    /**
     * Discards the set of resources included in the request body. The discard operation is triggered on the
     * moveResources in the moveState 'CommitPending' or 'DiscardFailed', on a successful completion the moveResource
     * moveState do a transition to MovePending. To aid the user to prerequisite the operation the client can call
     * operation with validateOnly property set to true.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus discard(DiscardRequest body, Context context);

    /**
     * Computes, resolves and validate the dependencies of the moveResources in the move collection.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus resolveDependencies();

    /**
     * Computes, resolves and validate the dependencies of the moveResources in the move collection.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus resolveDependencies(Context context);

    /**
     * Removes the set of move resources included in the request body from move collection. The orchestration is done by
     * service. To aid the user to prerequisite the operation the client can call operation with validateOnly property
     * set to true.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus bulkRemove();

    /**
     * Removes the set of move resources included in the request body from move collection. The orchestration is done by
     * service. To aid the user to prerequisite the operation the client can call operation with validateOnly property
     * set to true.
     * 
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status REST resource.
     */
    OperationStatus bulkRemove(BulkRemoveRequest body, Context context);
}
