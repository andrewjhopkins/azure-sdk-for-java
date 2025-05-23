// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the firmware of the machine.
 */
@Immutable
public final class FirmwareProfile implements JsonSerializable<FirmwareProfile> {
    /*
     * The serial number of the firmware
     */
    private String serialNumber;

    /*
     * The type of the firmware
     */
    private String type;

    /**
     * Creates an instance of FirmwareProfile class.
     */
    public FirmwareProfile() {
    }

    /**
     * Get the serialNumber property: The serial number of the firmware.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the type property: The type of the firmware.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirmwareProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirmwareProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirmwareProfile.
     */
    public static FirmwareProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirmwareProfile deserializedFirmwareProfile = new FirmwareProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serialNumber".equals(fieldName)) {
                    deserializedFirmwareProfile.serialNumber = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFirmwareProfile.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirmwareProfile;
        });
    }
}
