// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.PostgreSqlManagementClient;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.AdministratorsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.BackupsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.CheckNameAvailabilitiesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.CheckNameAvailabilityWithLocationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ConfigurationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.DatabasesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.FirewallRulesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.FlexibleServersImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.GetPrivateDnsZoneSuffixesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.LocationBasedCapabilitiesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.LogFilesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.LtrBackupOperationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.MigrationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.OperationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.PostgreSqlManagementClientBuilder;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.PrivateEndpointConnectionOperationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.QuotaUsagesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ReplicasImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ServerCapabilitiesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ServerThreatProtectionSettingsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ServersImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.TuningConfigurationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.TuningIndexesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.TuningOptionsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.VirtualEndpointsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.VirtualNetworkSubnetUsagesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Administrators;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backups;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilities;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityWithLocations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Configurations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Databases;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FirewallRules;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServers;
import com.azure.resourcemanager.postgresqlflexibleserver.models.GetPrivateDnsZoneSuffixes;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LocationBasedCapabilities;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogFiles;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupOperations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Migrations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateEndpointConnectionOperations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateEndpointConnections;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrivateLinkResources;
import com.azure.resourcemanager.postgresqlflexibleserver.models.QuotaUsages;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Replicas;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ResourceProviders;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerCapabilities;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerThreatProtectionSettings;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Servers;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TuningConfigurations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TuningIndexes;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TuningOptions;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualEndpoints;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualNetworkSubnetUsages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to PostgreSqlManager.
 * The Microsoft Azure management API provides create, read, update, and delete functionality for Azure PostgreSQL
 * resources including servers, databases, firewall rules, VNET rules, security alert policies, log files and
 * configurations with new business model.
 */
public final class PostgreSqlManager {
    private Administrators administrators;

    private Backups backups;

    private LocationBasedCapabilities locationBasedCapabilities;

    private ServerCapabilities serverCapabilities;

    private CheckNameAvailabilities checkNameAvailabilities;

    private CheckNameAvailabilityWithLocations checkNameAvailabilityWithLocations;

    private Configurations configurations;

    private Databases databases;

    private FirewallRules firewallRules;

    private Servers servers;

    private FlexibleServers flexibleServers;

    private LtrBackupOperations ltrBackupOperations;

    private Migrations migrations;

    private ResourceProviders resourceProviders;

    private Operations operations;

    private GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateEndpointConnectionOperations privateEndpointConnectionOperations;

    private PrivateLinkResources privateLinkResources;

    private QuotaUsages quotaUsages;

    private Replicas replicas;

    private LogFiles logFiles;

    private ServerThreatProtectionSettings serverThreatProtectionSettings;

    private TuningOptions tuningOptions;

    private TuningIndexes tuningIndexes;

    private TuningConfigurations tuningConfigurations;

    private VirtualEndpoints virtualEndpoints;

    private VirtualNetworkSubnetUsages virtualNetworkSubnetUsages;

    private final PostgreSqlManagementClient clientObject;

    private PostgreSqlManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new PostgreSqlManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of PostgreSql service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the PostgreSql service API instance.
     */
    public static PostgreSqlManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of PostgreSql service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the PostgreSql service API instance.
     */
    public static PostgreSqlManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new PostgreSqlManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create PostgreSqlManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new PostgreSqlManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);
        private static final String SDK_VERSION = "version";
        private static final Map<String, String> PROPERTIES
            = CoreUtils.getProperties("azure-resourcemanager-postgresqlflexibleserver.properties");

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of PostgreSql service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the PostgreSql service API instance.
         */
        public PostgreSqlManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.postgresqlflexibleserver")
                .append("/")
                .append(clientVersion);
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new BearerTokenAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new PostgreSqlManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Administrators. It manages ActiveDirectoryAdministrator.
     * 
     * @return Resource collection API of Administrators.
     */
    public Administrators administrators() {
        if (this.administrators == null) {
            this.administrators = new AdministratorsImpl(clientObject.getAdministrators(), this);
        }
        return administrators;
    }

    /**
     * Gets the resource collection API of Backups.
     * 
     * @return Resource collection API of Backups.
     */
    public Backups backups() {
        if (this.backups == null) {
            this.backups = new BackupsImpl(clientObject.getBackups(), this);
        }
        return backups;
    }

    /**
     * Gets the resource collection API of LocationBasedCapabilities.
     * 
     * @return Resource collection API of LocationBasedCapabilities.
     */
    public LocationBasedCapabilities locationBasedCapabilities() {
        if (this.locationBasedCapabilities == null) {
            this.locationBasedCapabilities
                = new LocationBasedCapabilitiesImpl(clientObject.getLocationBasedCapabilities(), this);
        }
        return locationBasedCapabilities;
    }

    /**
     * Gets the resource collection API of ServerCapabilities.
     * 
     * @return Resource collection API of ServerCapabilities.
     */
    public ServerCapabilities serverCapabilities() {
        if (this.serverCapabilities == null) {
            this.serverCapabilities = new ServerCapabilitiesImpl(clientObject.getServerCapabilities(), this);
        }
        return serverCapabilities;
    }

    /**
     * Gets the resource collection API of CheckNameAvailabilities.
     * 
     * @return Resource collection API of CheckNameAvailabilities.
     */
    public CheckNameAvailabilities checkNameAvailabilities() {
        if (this.checkNameAvailabilities == null) {
            this.checkNameAvailabilities
                = new CheckNameAvailabilitiesImpl(clientObject.getCheckNameAvailabilities(), this);
        }
        return checkNameAvailabilities;
    }

    /**
     * Gets the resource collection API of CheckNameAvailabilityWithLocations.
     * 
     * @return Resource collection API of CheckNameAvailabilityWithLocations.
     */
    public CheckNameAvailabilityWithLocations checkNameAvailabilityWithLocations() {
        if (this.checkNameAvailabilityWithLocations == null) {
            this.checkNameAvailabilityWithLocations = new CheckNameAvailabilityWithLocationsImpl(
                clientObject.getCheckNameAvailabilityWithLocations(), this);
        }
        return checkNameAvailabilityWithLocations;
    }

    /**
     * Gets the resource collection API of Configurations. It manages Configuration.
     * 
     * @return Resource collection API of Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(clientObject.getConfigurations(), this);
        }
        return configurations;
    }

    /**
     * Gets the resource collection API of Databases. It manages Database.
     * 
     * @return Resource collection API of Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /**
     * Gets the resource collection API of FirewallRules. It manages FirewallRule.
     * 
     * @return Resource collection API of FirewallRules.
     */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(clientObject.getFirewallRules(), this);
        }
        return firewallRules;
    }

    /**
     * Gets the resource collection API of Servers. It manages Server.
     * 
     * @return Resource collection API of Servers.
     */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /**
     * Gets the resource collection API of FlexibleServers.
     * 
     * @return Resource collection API of FlexibleServers.
     */
    public FlexibleServers flexibleServers() {
        if (this.flexibleServers == null) {
            this.flexibleServers = new FlexibleServersImpl(clientObject.getFlexibleServers(), this);
        }
        return flexibleServers;
    }

    /**
     * Gets the resource collection API of LtrBackupOperations.
     * 
     * @return Resource collection API of LtrBackupOperations.
     */
    public LtrBackupOperations ltrBackupOperations() {
        if (this.ltrBackupOperations == null) {
            this.ltrBackupOperations = new LtrBackupOperationsImpl(clientObject.getLtrBackupOperations(), this);
        }
        return ltrBackupOperations;
    }

    /**
     * Gets the resource collection API of Migrations. It manages MigrationResource.
     * 
     * @return Resource collection API of Migrations.
     */
    public Migrations migrations() {
        if (this.migrations == null) {
            this.migrations = new MigrationsImpl(clientObject.getMigrations(), this);
        }
        return migrations;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     * 
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of GetPrivateDnsZoneSuffixes.
     * 
     * @return Resource collection API of GetPrivateDnsZoneSuffixes.
     */
    public GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes() {
        if (this.getPrivateDnsZoneSuffixes == null) {
            this.getPrivateDnsZoneSuffixes
                = new GetPrivateDnsZoneSuffixesImpl(clientObject.getGetPrivateDnsZoneSuffixes(), this);
        }
        return getPrivateDnsZoneSuffixes;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections.
     * 
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections
                = new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnectionOperations.
     * 
     * @return Resource collection API of PrivateEndpointConnectionOperations.
     */
    public PrivateEndpointConnectionOperations privateEndpointConnectionOperations() {
        if (this.privateEndpointConnectionOperations == null) {
            this.privateEndpointConnectionOperations = new PrivateEndpointConnectionOperationsImpl(
                clientObject.getPrivateEndpointConnectionOperations(), this);
        }
        return privateEndpointConnectionOperations;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     * 
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of QuotaUsages.
     * 
     * @return Resource collection API of QuotaUsages.
     */
    public QuotaUsages quotaUsages() {
        if (this.quotaUsages == null) {
            this.quotaUsages = new QuotaUsagesImpl(clientObject.getQuotaUsages(), this);
        }
        return quotaUsages;
    }

    /**
     * Gets the resource collection API of Replicas.
     * 
     * @return Resource collection API of Replicas.
     */
    public Replicas replicas() {
        if (this.replicas == null) {
            this.replicas = new ReplicasImpl(clientObject.getReplicas(), this);
        }
        return replicas;
    }

    /**
     * Gets the resource collection API of LogFiles.
     * 
     * @return Resource collection API of LogFiles.
     */
    public LogFiles logFiles() {
        if (this.logFiles == null) {
            this.logFiles = new LogFilesImpl(clientObject.getLogFiles(), this);
        }
        return logFiles;
    }

    /**
     * Gets the resource collection API of ServerThreatProtectionSettings. It manages
     * ServerThreatProtectionSettingsModel.
     * 
     * @return Resource collection API of ServerThreatProtectionSettings.
     */
    public ServerThreatProtectionSettings serverThreatProtectionSettings() {
        if (this.serverThreatProtectionSettings == null) {
            this.serverThreatProtectionSettings
                = new ServerThreatProtectionSettingsImpl(clientObject.getServerThreatProtectionSettings(), this);
        }
        return serverThreatProtectionSettings;
    }

    /**
     * Gets the resource collection API of TuningOptions.
     * 
     * @return Resource collection API of TuningOptions.
     */
    public TuningOptions tuningOptions() {
        if (this.tuningOptions == null) {
            this.tuningOptions = new TuningOptionsImpl(clientObject.getTuningOptions(), this);
        }
        return tuningOptions;
    }

    /**
     * Gets the resource collection API of TuningIndexes.
     * 
     * @return Resource collection API of TuningIndexes.
     */
    public TuningIndexes tuningIndexes() {
        if (this.tuningIndexes == null) {
            this.tuningIndexes = new TuningIndexesImpl(clientObject.getTuningIndexes(), this);
        }
        return tuningIndexes;
    }

    /**
     * Gets the resource collection API of TuningConfigurations.
     * 
     * @return Resource collection API of TuningConfigurations.
     */
    public TuningConfigurations tuningConfigurations() {
        if (this.tuningConfigurations == null) {
            this.tuningConfigurations = new TuningConfigurationsImpl(clientObject.getTuningConfigurations(), this);
        }
        return tuningConfigurations;
    }

    /**
     * Gets the resource collection API of VirtualEndpoints. It manages VirtualEndpointResource.
     * 
     * @return Resource collection API of VirtualEndpoints.
     */
    public VirtualEndpoints virtualEndpoints() {
        if (this.virtualEndpoints == null) {
            this.virtualEndpoints = new VirtualEndpointsImpl(clientObject.getVirtualEndpoints(), this);
        }
        return virtualEndpoints;
    }

    /**
     * Gets the resource collection API of VirtualNetworkSubnetUsages.
     * 
     * @return Resource collection API of VirtualNetworkSubnetUsages.
     */
    public VirtualNetworkSubnetUsages virtualNetworkSubnetUsages() {
        if (this.virtualNetworkSubnetUsages == null) {
            this.virtualNetworkSubnetUsages
                = new VirtualNetworkSubnetUsagesImpl(clientObject.getVirtualNetworkSubnetUsages(), this);
        }
        return virtualNetworkSubnetUsages;
    }

    /**
     * Gets wrapped service client PostgreSqlManagementClient providing direct access to the underlying auto-generated
     * API implementation, based on Azure REST API.
     * 
     * @return Wrapped service client PostgreSqlManagementClient.
     */
    public PostgreSqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
