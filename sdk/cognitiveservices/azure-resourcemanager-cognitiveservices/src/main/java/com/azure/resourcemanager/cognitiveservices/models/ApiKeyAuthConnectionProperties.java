// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * This connection type covers the generic ApiKey auth connection categories, for examples:
 * AzureOpenAI:
 * Category:= AzureOpenAI
 * AuthType:= ApiKey (as type discriminator)
 * Credentials:= {ApiKey} as .ApiKey
 * Target:= {ApiBase}
 * 
 * CognitiveService:
 * Category:= CognitiveService
 * AuthType:= ApiKey (as type discriminator)
 * Credentials:= {SubscriptionKey} as ApiKey
 * Target:= ServiceRegion={serviceRegion}
 * 
 * CognitiveSearch:
 * Category:= CognitiveSearch
 * AuthType:= ApiKey (as type discriminator)
 * Credentials:= {Key} as ApiKey
 * Target:= {Endpoint}
 * 
 * Use Metadata property bag for ApiType, ApiVersion, Kind and other metadata fields.
 */
@Fluent
public final class ApiKeyAuthConnectionProperties extends ConnectionPropertiesV2 {
    /*
     * Authentication type of the connection target
     */
    private ConnectionAuthType authType = ConnectionAuthType.API_KEY;

    /*
     * Api key object for connection credential.
     */
    private ConnectionApiKey credentials;

    /**
     * Creates an instance of ApiKeyAuthConnectionProperties class.
     */
    public ApiKeyAuthConnectionProperties() {
    }

    /**
     * Get the authType property: Authentication type of the connection target.
     * 
     * @return the authType value.
     */
    @Override
    public ConnectionAuthType authType() {
        return this.authType;
    }

    /**
     * Get the credentials property: Api key object for connection credential.
     * 
     * @return the credentials value.
     */
    public ConnectionApiKey credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Api key object for connection credential.
     * 
     * @param credentials the credentials value to set.
     * @return the ApiKeyAuthConnectionProperties object itself.
     */
    public ApiKeyAuthConnectionProperties withCredentials(ConnectionApiKey credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withCategory(ConnectionCategory category) {
        super.withCategory(category);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withError(String error) {
        super.withError(error);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withExpiryTime(OffsetDateTime expiryTime) {
        super.withExpiryTime(expiryTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withIsSharedToAll(Boolean isSharedToAll) {
        super.withIsSharedToAll(isSharedToAll);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withMetadata(Map<String, String> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withPeRequirement(ManagedPERequirement peRequirement) {
        super.withPeRequirement(peRequirement);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withPeStatus(ManagedPEStatus peStatus) {
        super.withPeStatus(peStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withSharedUserList(List<String> sharedUserList) {
        super.withSharedUserList(sharedUserList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withTarget(String target) {
        super.withTarget(target);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiKeyAuthConnectionProperties withUseWorkspaceManagedIdentity(Boolean useWorkspaceManagedIdentity) {
        super.withUseWorkspaceManagedIdentity(useWorkspaceManagedIdentity);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", category() == null ? null : category().toString());
        jsonWriter.writeStringField("error", error());
        jsonWriter.writeStringField("expiryTime",
            expiryTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(expiryTime()));
        jsonWriter.writeBooleanField("isSharedToAll", isSharedToAll());
        jsonWriter.writeMapField("metadata", metadata(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("peRequirement", peRequirement() == null ? null : peRequirement().toString());
        jsonWriter.writeStringField("peStatus", peStatus() == null ? null : peStatus().toString());
        jsonWriter.writeArrayField("sharedUserList", sharedUserList(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("target", target());
        jsonWriter.writeBooleanField("useWorkspaceManagedIdentity", useWorkspaceManagedIdentity());
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeJsonField("credentials", this.credentials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiKeyAuthConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiKeyAuthConnectionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiKeyAuthConnectionProperties.
     */
    public static ApiKeyAuthConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiKeyAuthConnectionProperties deserializedApiKeyAuthConnectionProperties
                = new ApiKeyAuthConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withCategory(ConnectionCategory.fromString(reader.getString()));
                } else if ("createdByWorkspaceArmId".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.withCreatedByWorkspaceArmId(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.withError(reader.getString());
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.withExpiryTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("group".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withGroup(ConnectionGroup.fromString(reader.getString()));
                } else if ("isSharedToAll".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withIsSharedToAll(reader.getNullable(JsonReader::getBoolean));
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedApiKeyAuthConnectionProperties.withMetadata(metadata);
                } else if ("peRequirement".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withPeRequirement(ManagedPERequirement.fromString(reader.getString()));
                } else if ("peStatus".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withPeStatus(ManagedPEStatus.fromString(reader.getString()));
                } else if ("sharedUserList".equals(fieldName)) {
                    List<String> sharedUserList = reader.readArray(reader1 -> reader1.getString());
                    deserializedApiKeyAuthConnectionProperties.withSharedUserList(sharedUserList);
                } else if ("target".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.withTarget(reader.getString());
                } else if ("useWorkspaceManagedIdentity".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties
                        .withUseWorkspaceManagedIdentity(reader.getNullable(JsonReader::getBoolean));
                } else if ("authType".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.authType
                        = ConnectionAuthType.fromString(reader.getString());
                } else if ("credentials".equals(fieldName)) {
                    deserializedApiKeyAuthConnectionProperties.credentials = ConnectionApiKey.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiKeyAuthConnectionProperties;
        });
    }
}
