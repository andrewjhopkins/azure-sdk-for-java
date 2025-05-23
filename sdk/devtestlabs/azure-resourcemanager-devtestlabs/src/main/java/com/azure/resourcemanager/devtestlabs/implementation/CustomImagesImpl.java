// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.CustomImagesClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.CustomImageInner;
import com.azure.resourcemanager.devtestlabs.models.CustomImage;
import com.azure.resourcemanager.devtestlabs.models.CustomImages;

public final class CustomImagesImpl implements CustomImages {
    private static final ClientLogger LOGGER = new ClientLogger(CustomImagesImpl.class);

    private final CustomImagesClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public CustomImagesImpl(CustomImagesClient innerClient,
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CustomImage> list(String resourceGroupName, String labName) {
        PagedIterable<CustomImageInner> inner = this.serviceClient().list(resourceGroupName, labName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomImageImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomImage> list(String resourceGroupName, String labName, String expand, String filter,
        Integer top, String orderby, Context context) {
        PagedIterable<CustomImageInner> inner
            = this.serviceClient().list(resourceGroupName, labName, expand, filter, top, orderby, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomImageImpl(inner1, this.manager()));
    }

    public Response<CustomImage> getWithResponse(String resourceGroupName, String labName, String name, String expand,
        Context context) {
        Response<CustomImageInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, labName, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CustomImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CustomImage get(String resourceGroupName, String labName, String name) {
        CustomImageInner inner = this.serviceClient().get(resourceGroupName, labName, name);
        if (inner != null) {
            return new CustomImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String name) {
        this.serviceClient().delete(resourceGroupName, labName, name);
    }

    public void delete(String resourceGroupName, String labName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, name, context);
    }

    public CustomImage getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = ResourceManagerUtils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "customimages");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'customimages'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE).getValue();
    }

    public Response<CustomImage> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = ResourceManagerUtils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "customimages");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'customimages'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = ResourceManagerUtils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "customimages");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'customimages'.", id)));
        }
        this.delete(resourceGroupName, labName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = ResourceManagerUtils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "customimages");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'customimages'.", id)));
        }
        this.delete(resourceGroupName, labName, name, context);
    }

    private CustomImagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public CustomImageImpl define(String name) {
        return new CustomImageImpl(name, this.manager());
    }
}
