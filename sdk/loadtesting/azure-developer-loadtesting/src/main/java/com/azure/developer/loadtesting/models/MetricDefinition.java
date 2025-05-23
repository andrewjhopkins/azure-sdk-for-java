// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Metric definition.
 */
@Immutable
public final class MetricDefinition implements JsonSerializable<MetricDefinition> {

    /*
     * List of dimensions
     */
    @Generated
    private List<NameAndDescription> dimensions;

    /*
     * The metric description
     */
    @Generated
    private String description;

    /*
     * The metric name
     */
    @Generated
    private String name;

    /*
     * The namespace the metric belongs to.
     */
    @Generated
    private String namespace;

    /*
     * The primary aggregation type value defining how to use the values for display.
     */
    @Generated
    private AggregationType primaryAggregationType;

    /*
     * The collection of what all aggregation types are supported.
     */
    @Generated
    private List<String> supportedAggregationTypes;

    /*
     * The unit of the metric.
     */
    @Generated
    private MetricUnit unit;

    /*
     * Metric availability specifies the time grain (aggregation interval or
     * frequency).
     */
    @Generated
    private List<MetricAvailability> metricAvailabilities;

    /**
     * Creates an instance of MetricDefinition class.
     */
    @Generated
    private MetricDefinition() {
    }

    /**
     * Get the dimensions property: List of dimensions.
     *
     * @return the dimensions value.
     */
    @Generated
    public List<NameAndDescription> getDimensions() {
        return this.dimensions;
    }

    /**
     * Get the description property: The metric description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the name property: The metric name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the namespace property: The namespace the metric belongs to.
     *
     * @return the namespace value.
     */
    @Generated
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Get the primaryAggregationType property: The primary aggregation type value defining how to use the values for
     * display.
     *
     * @return the primaryAggregationType value.
     */
    @Generated
    public AggregationType getPrimaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get the supportedAggregationTypes property: The collection of what all aggregation types are supported.
     *
     * @return the supportedAggregationTypes value.
     */
    @Generated
    public List<String> getSupportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Get the unit property: The unit of the metric.
     *
     * @return the unit value.
     */
    @Generated
    public MetricUnit getUnit() {
        return this.unit;
    }

    /**
     * Get the metricAvailabilities property: Metric availability specifies the time grain (aggregation interval or
     * frequency).
     *
     * @return the metricAvailabilities value.
     */
    @Generated
    public List<MetricAvailability> getMetricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("dimensions", this.dimensions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("namespace", this.namespace);
        jsonWriter.writeStringField("primaryAggregationType",
            this.primaryAggregationType == null ? null : this.primaryAggregationType.toString());
        jsonWriter.writeArrayField("supportedAggregationTypes", this.supportedAggregationTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("unit", this.unit == null ? null : this.unit.toString());
        jsonWriter.writeArrayField("metricAvailabilities", this.metricAvailabilities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricDefinition.
     */
    @Generated
    public static MetricDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricDefinition deserializedMetricDefinition = new MetricDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("dimensions".equals(fieldName)) {
                    List<NameAndDescription> dimensions
                        = reader.readArray(reader1 -> NameAndDescription.fromJson(reader1));
                    deserializedMetricDefinition.dimensions = dimensions;
                } else if ("description".equals(fieldName)) {
                    deserializedMetricDefinition.description = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMetricDefinition.name = reader.getString();
                } else if ("namespace".equals(fieldName)) {
                    deserializedMetricDefinition.namespace = reader.getString();
                } else if ("primaryAggregationType".equals(fieldName)) {
                    deserializedMetricDefinition.primaryAggregationType
                        = AggregationType.fromString(reader.getString());
                } else if ("supportedAggregationTypes".equals(fieldName)) {
                    List<String> supportedAggregationTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedMetricDefinition.supportedAggregationTypes = supportedAggregationTypes;
                } else if ("unit".equals(fieldName)) {
                    deserializedMetricDefinition.unit = MetricUnit.fromString(reader.getString());
                } else if ("metricAvailabilities".equals(fieldName)) {
                    List<MetricAvailability> metricAvailabilities
                        = reader.readArray(reader1 -> MetricAvailability.fromJson(reader1));
                    deserializedMetricDefinition.metricAvailabilities = metricAvailabilities;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMetricDefinition;
        });
    }
}
