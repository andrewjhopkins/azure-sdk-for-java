// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPatchPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import java.io.IOException;

/**
 * External Network Patch properties.
 */
@Fluent
public final class ExternalNetworkPatchProperties extends AnnotationResource {
    /*
     * Peering option list.
     */
    private PeeringOption peeringOption;

    /*
     * option B properties object
     */
    private L3OptionBProperties optionBProperties;

    /*
     * option A properties object
     */
    private ExternalNetworkPatchPropertiesOptionAProperties optionAProperties;

    /*
     * ARM Resource ID of the networkToNetworkInterconnectId of the ExternalNetwork resource.
     */
    private String networkToNetworkInterconnectId;

    /*
     * ARM Resource ID of the RoutePolicy. This is used for the backward compatibility.
     */
    private String importRoutePolicyId;

    /*
     * ARM Resource ID of the RoutePolicy. This is used for the backward compatibility.
     */
    private String exportRoutePolicyId;

    /*
     * Import Route Policy either IPv4 or IPv6.
     */
    private ImportRoutePolicy importRoutePolicy;

    /*
     * Export Route Policy either IPv4 or IPv6.
     */
    private ExportRoutePolicy exportRoutePolicy;

    /**
     * Creates an instance of ExternalNetworkPatchProperties class.
     */
    public ExternalNetworkPatchProperties() {
    }

    /**
     * Get the peeringOption property: Peering option list.
     * 
     * @return the peeringOption value.
     */
    public PeeringOption peeringOption() {
        return this.peeringOption;
    }

    /**
     * Set the peeringOption property: Peering option list.
     * 
     * @param peeringOption the peeringOption value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withPeeringOption(PeeringOption peeringOption) {
        this.peeringOption = peeringOption;
        return this;
    }

    /**
     * Get the optionBProperties property: option B properties object.
     * 
     * @return the optionBProperties value.
     */
    public L3OptionBProperties optionBProperties() {
        return this.optionBProperties;
    }

    /**
     * Set the optionBProperties property: option B properties object.
     * 
     * @param optionBProperties the optionBProperties value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withOptionBProperties(L3OptionBProperties optionBProperties) {
        this.optionBProperties = optionBProperties;
        return this;
    }

    /**
     * Get the optionAProperties property: option A properties object.
     * 
     * @return the optionAProperties value.
     */
    public ExternalNetworkPatchPropertiesOptionAProperties optionAProperties() {
        return this.optionAProperties;
    }

    /**
     * Set the optionAProperties property: option A properties object.
     * 
     * @param optionAProperties the optionAProperties value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties
        withOptionAProperties(ExternalNetworkPatchPropertiesOptionAProperties optionAProperties) {
        this.optionAProperties = optionAProperties;
        return this;
    }

    /**
     * Get the networkToNetworkInterconnectId property: ARM Resource ID of the networkToNetworkInterconnectId of the
     * ExternalNetwork resource.
     * 
     * @return the networkToNetworkInterconnectId value.
     */
    public String networkToNetworkInterconnectId() {
        return this.networkToNetworkInterconnectId;
    }

    /**
     * Set the networkToNetworkInterconnectId property: ARM Resource ID of the networkToNetworkInterconnectId of the
     * ExternalNetwork resource.
     * 
     * @param networkToNetworkInterconnectId the networkToNetworkInterconnectId value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withNetworkToNetworkInterconnectId(String networkToNetworkInterconnectId) {
        this.networkToNetworkInterconnectId = networkToNetworkInterconnectId;
        return this;
    }

    /**
     * Get the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     * 
     * @return the importRoutePolicyId value.
     */
    public String importRoutePolicyId() {
        return this.importRoutePolicyId;
    }

    /**
     * Set the importRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     * 
     * @param importRoutePolicyId the importRoutePolicyId value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withImportRoutePolicyId(String importRoutePolicyId) {
        this.importRoutePolicyId = importRoutePolicyId;
        return this;
    }

    /**
     * Get the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     * 
     * @return the exportRoutePolicyId value.
     */
    public String exportRoutePolicyId() {
        return this.exportRoutePolicyId;
    }

    /**
     * Set the exportRoutePolicyId property: ARM Resource ID of the RoutePolicy. This is used for the backward
     * compatibility.
     * 
     * @param exportRoutePolicyId the exportRoutePolicyId value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withExportRoutePolicyId(String exportRoutePolicyId) {
        this.exportRoutePolicyId = exportRoutePolicyId;
        return this;
    }

    /**
     * Get the importRoutePolicy property: Import Route Policy either IPv4 or IPv6.
     * 
     * @return the importRoutePolicy value.
     */
    public ImportRoutePolicy importRoutePolicy() {
        return this.importRoutePolicy;
    }

    /**
     * Set the importRoutePolicy property: Import Route Policy either IPv4 or IPv6.
     * 
     * @param importRoutePolicy the importRoutePolicy value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withImportRoutePolicy(ImportRoutePolicy importRoutePolicy) {
        this.importRoutePolicy = importRoutePolicy;
        return this;
    }

    /**
     * Get the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6.
     * 
     * @return the exportRoutePolicy value.
     */
    public ExportRoutePolicy exportRoutePolicy() {
        return this.exportRoutePolicy;
    }

    /**
     * Set the exportRoutePolicy property: Export Route Policy either IPv4 or IPv6.
     * 
     * @param exportRoutePolicy the exportRoutePolicy value to set.
     * @return the ExternalNetworkPatchProperties object itself.
     */
    public ExternalNetworkPatchProperties withExportRoutePolicy(ExportRoutePolicy exportRoutePolicy) {
        this.exportRoutePolicy = exportRoutePolicy;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalNetworkPatchProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (optionBProperties() != null) {
            optionBProperties().validate();
        }
        if (optionAProperties() != null) {
            optionAProperties().validate();
        }
        if (importRoutePolicy() != null) {
            importRoutePolicy().validate();
        }
        if (exportRoutePolicy() != null) {
            exportRoutePolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("annotation", annotation());
        jsonWriter.writeStringField("peeringOption", this.peeringOption == null ? null : this.peeringOption.toString());
        jsonWriter.writeJsonField("optionBProperties", this.optionBProperties);
        jsonWriter.writeJsonField("optionAProperties", this.optionAProperties);
        jsonWriter.writeStringField("networkToNetworkInterconnectId", this.networkToNetworkInterconnectId);
        jsonWriter.writeStringField("importRoutePolicyId", this.importRoutePolicyId);
        jsonWriter.writeStringField("exportRoutePolicyId", this.exportRoutePolicyId);
        jsonWriter.writeJsonField("importRoutePolicy", this.importRoutePolicy);
        jsonWriter.writeJsonField("exportRoutePolicy", this.exportRoutePolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExternalNetworkPatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExternalNetworkPatchProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExternalNetworkPatchProperties.
     */
    public static ExternalNetworkPatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExternalNetworkPatchProperties deserializedExternalNetworkPatchProperties
                = new ExternalNetworkPatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("annotation".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.withAnnotation(reader.getString());
                } else if ("peeringOption".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.peeringOption
                        = PeeringOption.fromString(reader.getString());
                } else if ("optionBProperties".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.optionBProperties = L3OptionBProperties.fromJson(reader);
                } else if ("optionAProperties".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.optionAProperties
                        = ExternalNetworkPatchPropertiesOptionAProperties.fromJson(reader);
                } else if ("networkToNetworkInterconnectId".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.networkToNetworkInterconnectId = reader.getString();
                } else if ("importRoutePolicyId".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.importRoutePolicyId = reader.getString();
                } else if ("exportRoutePolicyId".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.exportRoutePolicyId = reader.getString();
                } else if ("importRoutePolicy".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.importRoutePolicy = ImportRoutePolicy.fromJson(reader);
                } else if ("exportRoutePolicy".equals(fieldName)) {
                    deserializedExternalNetworkPatchProperties.exportRoutePolicy = ExportRoutePolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExternalNetworkPatchProperties;
        });
    }
}
