// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Additional attributes specific to Neon Resources.
 */
@Fluent
public final class Attributes implements JsonSerializable<Attributes> {
    /*
     * Name of the attribute
     */
    private String name;

    /*
     * Value of the attribute
     */
    private String value;

    /**
     * Creates an instance of Attributes class.
     */
    public Attributes() {
    }

    /**
     * Get the name property: Name of the attribute.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the attribute.
     * 
     * @param name the name value to set.
     * @return the Attributes object itself.
     */
    public Attributes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the attribute.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the attribute.
     * 
     * @param value the value value to set.
     * @return the Attributes object itself.
     */
    public Attributes withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model Attributes"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model Attributes"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Attributes.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Attributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Attributes if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Attributes.
     */
    public static Attributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Attributes deserializedAttributes = new Attributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAttributes.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedAttributes.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAttributes;
        });
    }
}
