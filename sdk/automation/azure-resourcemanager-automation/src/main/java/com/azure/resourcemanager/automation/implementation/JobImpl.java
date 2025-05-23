// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.JobInner;
import com.azure.resourcemanager.automation.models.Job;
import com.azure.resourcemanager.automation.models.JobCreateParameters;
import com.azure.resourcemanager.automation.models.JobProvisioningState;
import com.azure.resourcemanager.automation.models.JobStatus;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class JobImpl implements Job, Job.Definition {
    private JobInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    JobImpl(JobInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public RunbookAssociationProperty runbook() {
        return this.innerModel().runbook();
    }

    public String startedBy() {
        return this.innerModel().startedBy();
    }

    public String runOn() {
        return this.innerModel().runOn();
    }

    public UUID jobId() {
        return this.innerModel().jobId();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public JobStatus status() {
        return this.innerModel().status();
    }

    public String statusDetails() {
        return this.innerModel().statusDetails();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public String exception() {
        return this.innerModel().exception();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public OffsetDateTime lastStatusModifiedTime() {
        return this.innerModel().lastStatusModifiedTime();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public JobProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public JobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String jobName;

    private String createClientRequestId;

    private JobCreateParameters createParameters;

    public JobImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Job create() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createWithResponse(resourceGroupName, automationAccountName, jobName, createParameters,
                createClientRequestId, Context.NONE)
            .getValue();
        return this;
    }

    public Job create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createWithResponse(resourceGroupName, automationAccountName, jobName, createParameters,
                createClientRequestId, context)
            .getValue();
        return this;
    }

    JobImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new JobInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
        this.createClientRequestId = null;
        this.createParameters = new JobCreateParameters();
    }

    public Job refresh() {
        String localClientRequestId = null;
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, automationAccountName, jobName, localClientRequestId, Context.NONE)
            .getValue();
        return this;
    }

    public Job refresh(Context context) {
        String localClientRequestId = null;
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, automationAccountName, jobName, localClientRequestId, context)
            .getValue();
        return this;
    }

    public Response<Void> suspendWithResponse(String clientRequestId, Context context) {
        return serviceManager.jobs()
            .suspendWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public void suspend() {
        serviceManager.jobs().suspend(resourceGroupName, automationAccountName, jobName);
    }

    public Response<Void> stopWithResponse(String clientRequestId, Context context) {
        return serviceManager.jobs()
            .stopWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public void stop() {
        serviceManager.jobs().stop(resourceGroupName, automationAccountName, jobName);
    }

    public Response<Void> resumeWithResponse(String clientRequestId, Context context) {
        return serviceManager.jobs()
            .resumeWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public void resume() {
        serviceManager.jobs().resume(resourceGroupName, automationAccountName, jobName);
    }

    public JobImpl withRunbook(RunbookAssociationProperty runbook) {
        this.createParameters.withRunbook(runbook);
        return this;
    }

    public JobImpl withParameters(Map<String, String> parameters) {
        this.createParameters.withParameters(parameters);
        return this;
    }

    public JobImpl withRunOn(String runOn) {
        this.createParameters.withRunOn(runOn);
        return this;
    }

    public JobImpl withClientRequestId(String clientRequestId) {
        this.createClientRequestId = clientRequestId;
        return this;
    }
}
