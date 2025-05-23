// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CancelEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbServerMetadata;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogicalReplicationOnSourceDbEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrateRolesEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationOption;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationSecretParameters;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.OverwriteDbsInTargetEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.SourceType;
import com.azure.resourcemanager.postgresqlflexibleserver.models.SslMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StartDataMigrationEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TriggerCutoverEnum;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Represents a migration resource.
 */
@Fluent
public final class MigrationResourceInner extends Resource {
    /*
     * Migration resource properties.
     */
    private MigrationResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of MigrationResourceInner class.
     */
    public MigrationResourceInner() {
    }

    /**
     * Get the innerProperties property: Migration resource properties.
     * 
     * @return the innerProperties value.
     */
    private MigrationResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MigrationResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MigrationResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the migrationId property: ID for migration, a GUID.
     * 
     * @return the migrationId value.
     */
    public String migrationId() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationId();
    }

    /**
     * Get the currentStatus property: Current status of migration.
     * 
     * @return the currentStatus value.
     */
    public MigrationStatus currentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().currentStatus();
    }

    /**
     * Get the migrationInstanceResourceId property: ResourceId of the private endpoint migration instance.
     * 
     * @return the migrationInstanceResourceId value.
     */
    public String migrationInstanceResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationInstanceResourceId();
    }

    /**
     * Set the migrationInstanceResourceId property: ResourceId of the private endpoint migration instance.
     * 
     * @param migrationInstanceResourceId the migrationInstanceResourceId value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrationInstanceResourceId(String migrationInstanceResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrationInstanceResourceId(migrationInstanceResourceId);
        return this;
    }

    /**
     * Get the migrationMode property: There are two types of migration modes Online and Offline.
     * 
     * @return the migrationMode value.
     */
    public MigrationMode migrationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationMode();
    }

    /**
     * Set the migrationMode property: There are two types of migration modes Online and Offline.
     * 
     * @param migrationMode the migrationMode value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrationMode(MigrationMode migrationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrationMode(migrationMode);
        return this;
    }

    /**
     * Get the migrationOption property: This indicates the supported Migration option for the migration.
     * 
     * @return the migrationOption value.
     */
    public MigrationOption migrationOption() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationOption();
    }

    /**
     * Set the migrationOption property: This indicates the supported Migration option for the migration.
     * 
     * @param migrationOption the migrationOption value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrationOption(MigrationOption migrationOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrationOption(migrationOption);
        return this;
    }

    /**
     * Get the sourceType property: migration source server type : OnPremises, AWS, GCP, AzureVM,
     * PostgreSQLSingleServer, AWS_RDS, AWS_AURORA, AWS_EC2, GCP_CloudSQL, GCP_AlloyDB, GCP_Compute, EDB,
     * EDB_Oracle_Server, EDB_PostgreSQL, PostgreSQLFlexibleServer, PostgreSQLCosmosDB, Huawei_RDS, Huawei_Compute,
     * Heroku_PostgreSQL, Crunchy_PostgreSQL, ApsaraDB_RDS, Digital_Ocean_Droplets, Digital_Ocean_PostgreSQL, or
     * Supabase_PostgreSQL.
     * 
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceType();
    }

    /**
     * Set the sourceType property: migration source server type : OnPremises, AWS, GCP, AzureVM,
     * PostgreSQLSingleServer, AWS_RDS, AWS_AURORA, AWS_EC2, GCP_CloudSQL, GCP_AlloyDB, GCP_Compute, EDB,
     * EDB_Oracle_Server, EDB_PostgreSQL, PostgreSQLFlexibleServer, PostgreSQLCosmosDB, Huawei_RDS, Huawei_Compute,
     * Heroku_PostgreSQL, Crunchy_PostgreSQL, ApsaraDB_RDS, Digital_Ocean_Droplets, Digital_Ocean_PostgreSQL, or
     * Supabase_PostgreSQL.
     * 
     * @param sourceType the sourceType value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withSourceType(SourceType sourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSourceType(sourceType);
        return this;
    }

    /**
     * Get the sslMode property: SSL modes for migration. Default SSL mode for PostgreSQLSingleServer is VerifyFull and
     * Prefer for other source types.
     * 
     * @return the sslMode value.
     */
    public SslMode sslMode() {
        return this.innerProperties() == null ? null : this.innerProperties().sslMode();
    }

    /**
     * Set the sslMode property: SSL modes for migration. Default SSL mode for PostgreSQLSingleServer is VerifyFull and
     * Prefer for other source types.
     * 
     * @param sslMode the sslMode value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withSslMode(SslMode sslMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSslMode(sslMode);
        return this;
    }

    /**
     * Get the sourceDbServerMetadata property: Metadata of the source database server.
     * 
     * @return the sourceDbServerMetadata value.
     */
    public DbServerMetadata sourceDbServerMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDbServerMetadata();
    }

    /**
     * Get the targetDbServerMetadata property: Metadata of the target database server.
     * 
     * @return the targetDbServerMetadata value.
     */
    public DbServerMetadata targetDbServerMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDbServerMetadata();
    }

    /**
     * Get the sourceDbServerResourceId property: ResourceId of the source database server in case the sourceType is
     * PostgreSQLSingleServer. For other source types this should be ipaddress:port&#064;username or
     * hostname:port&#064;username.
     * 
     * @return the sourceDbServerResourceId value.
     */
    public String sourceDbServerResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDbServerResourceId();
    }

    /**
     * Set the sourceDbServerResourceId property: ResourceId of the source database server in case the sourceType is
     * PostgreSQLSingleServer. For other source types this should be ipaddress:port&#064;username or
     * hostname:port&#064;username.
     * 
     * @param sourceDbServerResourceId the sourceDbServerResourceId value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withSourceDbServerResourceId(String sourceDbServerResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSourceDbServerResourceId(sourceDbServerResourceId);
        return this;
    }

    /**
     * Get the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name (FQDN) or IP
     * address. It is a optional value, if customer provide it, migration service will always use it for connection.
     * 
     * @return the sourceDbServerFullyQualifiedDomainName value.
     */
    public String sourceDbServerFullyQualifiedDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDbServerFullyQualifiedDomainName();
    }

    /**
     * Set the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name (FQDN) or IP
     * address. It is a optional value, if customer provide it, migration service will always use it for connection.
     * 
     * @param sourceDbServerFullyQualifiedDomainName the sourceDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner
        withSourceDbServerFullyQualifiedDomainName(String sourceDbServerFullyQualifiedDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSourceDbServerFullyQualifiedDomainName(sourceDbServerFullyQualifiedDomainName);
        return this;
    }

    /**
     * Get the targetDbServerResourceId property: ResourceId of the source database server.
     * 
     * @return the targetDbServerResourceId value.
     */
    public String targetDbServerResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDbServerResourceId();
    }

    /**
     * Get the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name (FQDN) or IP
     * address. It is a optional value, if customer provide it, migration service will always use it for connection.
     * 
     * @return the targetDbServerFullyQualifiedDomainName value.
     */
    public String targetDbServerFullyQualifiedDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDbServerFullyQualifiedDomainName();
    }

    /**
     * Set the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name (FQDN) or IP
     * address. It is a optional value, if customer provide it, migration service will always use it for connection.
     * 
     * @param targetDbServerFullyQualifiedDomainName the targetDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner
        withTargetDbServerFullyQualifiedDomainName(String targetDbServerFullyQualifiedDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withTargetDbServerFullyQualifiedDomainName(targetDbServerFullyQualifiedDomainName);
        return this;
    }

    /**
     * Get the secretParameters property: Migration secret parameters.
     * 
     * @return the secretParameters value.
     */
    public MigrationSecretParameters secretParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().secretParameters();
    }

    /**
     * Set the secretParameters property: Migration secret parameters.
     * 
     * @param secretParameters the secretParameters value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withSecretParameters(MigrationSecretParameters secretParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSecretParameters(secretParameters);
        return this;
    }

    /**
     * Get the dbsToMigrate property: Number of databases to migrate.
     * 
     * @return the dbsToMigrate value.
     */
    public List<String> dbsToMigrate() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToMigrate();
    }

    /**
     * Set the dbsToMigrate property: Number of databases to migrate.
     * 
     * @param dbsToMigrate the dbsToMigrate value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withDbsToMigrate(List<String> dbsToMigrate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withDbsToMigrate(dbsToMigrate);
        return this;
    }

    /**
     * Get the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     * 
     * @return the setupLogicalReplicationOnSourceDbIfNeeded value.
     */
    public LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().setupLogicalReplicationOnSourceDbIfNeeded();
    }

    /**
     * Set the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     * 
     * @param setupLogicalReplicationOnSourceDbIfNeeded the setupLogicalReplicationOnSourceDbIfNeeded value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withSetupLogicalReplicationOnSourceDbIfNeeded(
        LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withSetupLogicalReplicationOnSourceDbIfNeeded(setupLogicalReplicationOnSourceDbIfNeeded);
        return this;
    }

    /**
     * Get the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     * 
     * @return the overwriteDbsInTarget value.
     */
    public OverwriteDbsInTargetEnum overwriteDbsInTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().overwriteDbsInTarget();
    }

    /**
     * Set the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     * 
     * @param overwriteDbsInTarget the overwriteDbsInTarget value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withOverwriteDbsInTarget(OverwriteDbsInTargetEnum overwriteDbsInTarget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withOverwriteDbsInTarget(overwriteDbsInTarget);
        return this;
    }

    /**
     * Get the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     * 
     * @return the migrationWindowStartTimeInUtc value.
     */
    public OffsetDateTime migrationWindowStartTimeInUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationWindowStartTimeInUtc();
    }

    /**
     * Set the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     * 
     * @param migrationWindowStartTimeInUtc the migrationWindowStartTimeInUtc value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrationWindowStartTimeInUtc(OffsetDateTime migrationWindowStartTimeInUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrationWindowStartTimeInUtc(migrationWindowStartTimeInUtc);
        return this;
    }

    /**
     * Get the migrationWindowEndTimeInUtc property: End time in UTC for migration window.
     * 
     * @return the migrationWindowEndTimeInUtc value.
     */
    public OffsetDateTime migrationWindowEndTimeInUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationWindowEndTimeInUtc();
    }

    /**
     * Set the migrationWindowEndTimeInUtc property: End time in UTC for migration window.
     * 
     * @param migrationWindowEndTimeInUtc the migrationWindowEndTimeInUtc value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrationWindowEndTimeInUtc(OffsetDateTime migrationWindowEndTimeInUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrationWindowEndTimeInUtc(migrationWindowEndTimeInUtc);
        return this;
    }

    /**
     * Get the migrateRoles property: To migrate roles and permissions we need to send this flag as True.
     * 
     * @return the migrateRoles value.
     */
    public MigrateRolesEnum migrateRoles() {
        return this.innerProperties() == null ? null : this.innerProperties().migrateRoles();
    }

    /**
     * Set the migrateRoles property: To migrate roles and permissions we need to send this flag as True.
     * 
     * @param migrateRoles the migrateRoles value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withMigrateRoles(MigrateRolesEnum migrateRoles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withMigrateRoles(migrateRoles);
        return this;
    }

    /**
     * Get the startDataMigration property: Indicates whether the data migration should start right away.
     * 
     * @return the startDataMigration value.
     */
    public StartDataMigrationEnum startDataMigration() {
        return this.innerProperties() == null ? null : this.innerProperties().startDataMigration();
    }

    /**
     * Set the startDataMigration property: Indicates whether the data migration should start right away.
     * 
     * @param startDataMigration the startDataMigration value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withStartDataMigration(StartDataMigrationEnum startDataMigration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withStartDataMigration(startDataMigration);
        return this;
    }

    /**
     * Get the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     * 
     * @return the triggerCutover value.
     */
    public TriggerCutoverEnum triggerCutover() {
        return this.innerProperties() == null ? null : this.innerProperties().triggerCutover();
    }

    /**
     * Set the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     * 
     * @param triggerCutover the triggerCutover value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withTriggerCutover(TriggerCutoverEnum triggerCutover) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withTriggerCutover(triggerCutover);
        return this;
    }

    /**
     * Get the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     * 
     * @return the dbsToTriggerCutoverOn value.
     */
    public List<String> dbsToTriggerCutoverOn() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToTriggerCutoverOn();
    }

    /**
     * Set the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     * 
     * @param dbsToTriggerCutoverOn the dbsToTriggerCutoverOn value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withDbsToTriggerCutoverOn(List<String> dbsToTriggerCutoverOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withDbsToTriggerCutoverOn(dbsToTriggerCutoverOn);
        return this;
    }

    /**
     * Get the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     * 
     * @return the cancel value.
     */
    public CancelEnum cancel() {
        return this.innerProperties() == null ? null : this.innerProperties().cancel();
    }

    /**
     * Set the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     * 
     * @param cancel the cancel value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withCancel(CancelEnum cancel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withCancel(cancel);
        return this;
    }

    /**
     * Get the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     * 
     * @return the dbsToCancelMigrationOn value.
     */
    public List<String> dbsToCancelMigrationOn() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToCancelMigrationOn();
    }

    /**
     * Set the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     * 
     * @param dbsToCancelMigrationOn the dbsToCancelMigrationOn value to set.
     * @return the MigrationResourceInner object itself.
     */
    public MigrationResourceInner withDbsToCancelMigrationOn(List<String> dbsToCancelMigrationOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourceProperties();
        }
        this.innerProperties().withDbsToCancelMigrationOn(dbsToCancelMigrationOn);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MigrationResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MigrationResourceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MigrationResourceInner.
     */
    public static MigrationResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MigrationResourceInner deserializedMigrationResourceInner = new MigrationResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMigrationResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMigrationResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMigrationResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedMigrationResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedMigrationResourceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedMigrationResourceInner.innerProperties = MigrationResourceProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedMigrationResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMigrationResourceInner;
        });
    }
}
