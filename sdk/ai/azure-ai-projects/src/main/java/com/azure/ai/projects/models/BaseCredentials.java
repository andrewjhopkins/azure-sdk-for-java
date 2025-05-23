// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.projects.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A base class for connection credentials.
 */
@Immutable
public class BaseCredentials implements JsonSerializable<BaseCredentials> {

    /*
     * The type of credential used by the connection
     */
    @Generated
    private CredentialType type = CredentialType.fromString("BaseCredentials");

    /**
     * Creates an instance of BaseCredentials class.
     */
    @Generated
    protected BaseCredentials() {
    }

    /**
     * Get the type property: The type of credential used by the connection.
     *
     * @return the type value.
     */
    @Generated
    public CredentialType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BaseCredentials from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BaseCredentials if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BaseCredentials.
     */
    @Generated
    public static BaseCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ApiKey".equals(discriminatorValue)) {
                    return ApiKeyCredentials.fromJson(readerToUse.reset());
                } else if ("AAD".equals(discriminatorValue)) {
                    return EntraIDCredentials.fromJson(readerToUse.reset());
                } else if ("CustomKeys".equals(discriminatorValue)) {
                    return CustomCredential.fromJson(readerToUse.reset());
                } else if ("SAS".equals(discriminatorValue)) {
                    return SasCredentials.fromJson(readerToUse.reset());
                } else if ("None".equals(discriminatorValue)) {
                    return NoAuthenticationCredentials.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static BaseCredentials fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BaseCredentials deserializedBaseCredentials = new BaseCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedBaseCredentials.type = CredentialType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBaseCredentials;
        });
    }
}
