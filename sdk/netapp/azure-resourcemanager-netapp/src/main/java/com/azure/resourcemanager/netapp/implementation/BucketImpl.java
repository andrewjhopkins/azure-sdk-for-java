// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BucketInner;
import com.azure.resourcemanager.netapp.models.Bucket;
import com.azure.resourcemanager.netapp.models.BucketCredentialsExpiry;
import com.azure.resourcemanager.netapp.models.BucketGenerateCredentials;
import com.azure.resourcemanager.netapp.models.BucketPatch;
import com.azure.resourcemanager.netapp.models.BucketServerPatchProperties;
import com.azure.resourcemanager.netapp.models.BucketServerProperties;
import com.azure.resourcemanager.netapp.models.CredentialsStatus;
import com.azure.resourcemanager.netapp.models.FileSystemUser;
import com.azure.resourcemanager.netapp.models.NetappProvisioningState;

public final class BucketImpl implements Bucket, Bucket.Definition, Bucket.Update {
    private BucketInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String path() {
        return this.innerModel().path();
    }

    public FileSystemUser fileSystemUser() {
        return this.innerModel().fileSystemUser();
    }

    public NetappProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public CredentialsStatus status() {
        return this.innerModel().status();
    }

    public BucketServerProperties server() {
        return this.innerModel().server();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BucketInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String poolName;

    private String volumeName;

    private String bucketName;

    private BucketPatch updateBody;

    public BucketImpl withExistingVolume(String resourceGroupName, String accountName, String poolName,
        String volumeName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        this.volumeName = volumeName;
        return this;
    }

    public Bucket create() {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .createOrUpdate(resourceGroupName, accountName, poolName, volumeName, bucketName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public Bucket create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .createOrUpdate(resourceGroupName, accountName, poolName, volumeName, bucketName, this.innerModel(),
                context);
        return this;
    }

    BucketImpl(String name, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = new BucketInner();
        this.serviceManager = serviceManager;
        this.bucketName = name;
    }

    public BucketImpl update() {
        this.updateBody = new BucketPatch();
        return this;
    }

    public Bucket apply() {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .update(resourceGroupName, accountName, poolName, volumeName, bucketName, updateBody, Context.NONE);
        return this;
    }

    public Bucket apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .update(resourceGroupName, accountName, poolName, volumeName, bucketName, updateBody, context);
        return this;
    }

    BucketImpl(BucketInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.poolName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "capacityPools");
        this.volumeName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "volumes");
        this.bucketName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "buckets");
    }

    public Bucket refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, bucketName, Context.NONE)
            .getValue();
        return this;
    }

    public Bucket refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBuckets()
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, bucketName, context)
            .getValue();
        return this;
    }

    public Response<BucketGenerateCredentials> generateCredentialsWithResponse(BucketCredentialsExpiry body,
        Context context) {
        return serviceManager.buckets()
            .generateCredentialsWithResponse(resourceGroupName, accountName, poolName, volumeName, bucketName, body,
                context);
    }

    public BucketGenerateCredentials generateCredentials(BucketCredentialsExpiry body) {
        return serviceManager.buckets()
            .generateCredentials(resourceGroupName, accountName, poolName, volumeName, bucketName, body);
    }

    public BucketImpl withPath(String path) {
        if (isInCreateMode()) {
            this.innerModel().withPath(path);
            return this;
        } else {
            this.updateBody.withPath(path);
            return this;
        }
    }

    public BucketImpl withFileSystemUser(FileSystemUser fileSystemUser) {
        if (isInCreateMode()) {
            this.innerModel().withFileSystemUser(fileSystemUser);
            return this;
        } else {
            this.updateBody.withFileSystemUser(fileSystemUser);
            return this;
        }
    }

    public BucketImpl withServer(BucketServerProperties server) {
        this.innerModel().withServer(server);
        return this;
    }

    public BucketImpl withServer(BucketServerPatchProperties server) {
        this.updateBody.withServer(server);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
