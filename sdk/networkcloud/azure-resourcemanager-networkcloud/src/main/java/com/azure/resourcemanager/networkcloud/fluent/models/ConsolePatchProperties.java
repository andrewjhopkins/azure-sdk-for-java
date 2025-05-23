// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.networkcloud.models.ConsoleEnabled;
import com.azure.resourcemanager.networkcloud.models.SshPublicKey;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ConsolePatchProperties represents the properties of the virtual machine console that can be patched.
 */
@Fluent
public final class ConsolePatchProperties implements JsonSerializable<ConsolePatchProperties> {
    /*
     * The indicator of whether the console access is enabled.
     */
    private ConsoleEnabled enabled;

    /*
     * The date and time after which the key will be disallowed access.
     */
    private OffsetDateTime expiration;

    /*
     * The SSH public key that will be provisioned for user access. The user is expected to have the corresponding SSH
     * private key for logging in.
     */
    private SshPublicKey sshPublicKey;

    /**
     * Creates an instance of ConsolePatchProperties class.
     */
    public ConsolePatchProperties() {
    }

    /**
     * Get the enabled property: The indicator of whether the console access is enabled.
     * 
     * @return the enabled value.
     */
    public ConsoleEnabled enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The indicator of whether the console access is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the ConsolePatchProperties object itself.
     */
    public ConsolePatchProperties withEnabled(ConsoleEnabled enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the expiration property: The date and time after which the key will be disallowed access.
     * 
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: The date and time after which the key will be disallowed access.
     * 
     * @param expiration the expiration value to set.
     * @return the ConsolePatchProperties object itself.
     */
    public ConsolePatchProperties withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get the sshPublicKey property: The SSH public key that will be provisioned for user access. The user is expected
     * to have the corresponding SSH private key for logging in.
     * 
     * @return the sshPublicKey value.
     */
    public SshPublicKey sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: The SSH public key that will be provisioned for user access. The user is expected
     * to have the corresponding SSH private key for logging in.
     * 
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the ConsolePatchProperties object itself.
     */
    public ConsolePatchProperties withSshPublicKey(SshPublicKey sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sshPublicKey() != null) {
            sshPublicKey().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("enabled", this.enabled == null ? null : this.enabled.toString());
        jsonWriter.writeStringField("expiration",
            this.expiration == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiration));
        jsonWriter.writeJsonField("sshPublicKey", this.sshPublicKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConsolePatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConsolePatchProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConsolePatchProperties.
     */
    public static ConsolePatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConsolePatchProperties deserializedConsolePatchProperties = new ConsolePatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedConsolePatchProperties.enabled = ConsoleEnabled.fromString(reader.getString());
                } else if ("expiration".equals(fieldName)) {
                    deserializedConsolePatchProperties.expiration = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sshPublicKey".equals(fieldName)) {
                    deserializedConsolePatchProperties.sshPublicKey = SshPublicKey.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConsolePatchProperties;
        });
    }
}
