/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class AzureAIRunResult {
      private String id;
    private String object;
    @SerializedName("created_at")
    private long createdAt;
    @SerializedName("assistant_id")
    private String assistantId;
    @SerializedName("thread_id")
    private String threadId;
    private String status;
    @SerializedName("started_at")
    private Long startedAt;
    @SerializedName("expires_at")
    private long expiresAt;
    @SerializedName("cancelled_at")
    private Long cancelledAt;
    @SerializedName("failed_at")
    private Long failedAt;
    @SerializedName("completed_at")
    private Long completedAt;
    @SerializedName("required_action")
    private String requiredAction;
    @SerializedName("last_error")
    private String lastError;
    private String model;
    private String instructions;
    private List<AzureAITool> tools;
    @SerializedName("tool_resources")
    private AzureAIToolResources toolResources;
    private AzureAIMetadata metadata;
    private double temperature;
    @SerializedName("top_p")
    private double topP;
    @SerializedName("max_completion_tokens")
    private Integer maxCompletionTokens;
    @SerializedName("max_prompt_tokens")
    private Integer maxPromptTokens;
    @SerializedName("truncation_strategy")
    private AzureAITruncationStrategy truncationStrategy;
    @SerializedName("incomplete_details")
    private String incompleteDetails;
    private AzureAIUsage usage;
    @SerializedName("response_format")
    private String responseFormat;
    @SerializedName("tool_choice")
    private String toolChoice;
    @SerializedName("parallel_tool_calls")
    private boolean parallelToolCalls;  

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the object
     */
    public String getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * @return the createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    /**
     * @param assistantId the assistantId to set
     */
    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * @return the threadId
     */
    public String getThreadId() {
        return threadId;
    }

    /**
     * @param threadId the threadId to set
     */
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the startedAt
     */
    public Long getStartedAt() {
        return startedAt;
    }

    /**
     * @param startedAt the startedAt to set
     */
    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * @return the expiresAt
     */
    public long getExpiresAt() {
        return expiresAt;
    }

    /**
     * @param expiresAt the expiresAt to set
     */
    public void setExpiresAt(long expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * @return the cancelledAt
     */
    public Long getCancelledAt() {
        return cancelledAt;
    }

    /**
     * @param cancelledAt the cancelledAt to set
     */
    public void setCancelledAt(Long cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    /**
     * @return the failedAt
     */
    public Long getFailedAt() {
        return failedAt;
    }

    /**
     * @param failedAt the failedAt to set
     */
    public void setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
    }

    /**
     * @return the completedAt
     */
    public Long getCompletedAt() {
        return completedAt;
    }

    /**
     * @param completedAt the completedAt to set
     */
    public void setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * @return the requiredAction
     */
    public String getRequiredAction() {
        return requiredAction;
    }

    /**
     * @param requiredAction the requiredAction to set
     */
    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }

    /**
     * @return the lastError
     */
    public String getLastError() {
        return lastError;
    }

    /**
     * @param lastError the lastError to set
     */
    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * @param instructions the instructions to set
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * @return the tools
     */
    public List<AzureAITool> getTools() {
        return tools;
    }

    /**
     * @param tools the tools to set
     */
    public void setTools(List<AzureAITool> tools) {
        this.tools = tools;
    }

    /**
     * @return the toolResources
     */
    public AzureAIToolResources getToolResources() {
        return toolResources;
    }

    /**
     * @param toolResources the toolResources to set
     */
    public void setToolResources(AzureAIToolResources toolResources) {
        this.toolResources = toolResources;
    }

    /**
     * @return the metadata
     */
    public AzureAIMetadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(AzureAIMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the topP
     */
    public double getTopP() {
        return topP;
    }

    /**
     * @param topP the topP to set
     */
    public void setTopP(double topP) {
        this.topP = topP;
    }

    /**
     * @return the maxCompletionTokens
     */
    public Integer getMaxCompletionTokens() {
        return maxCompletionTokens;
    }

    /**
     * @param maxCompletionTokens the maxCompletionTokens to set
     */
    public void setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
    }

    /**
     * @return the maxPromptTokens
     */
    public Integer getMaxPromptTokens() {
        return maxPromptTokens;
    }

    /**
     * @param maxPromptTokens the maxPromptTokens to set
     */
    public void setMaxPromptTokens(Integer maxPromptTokens) {
        this.maxPromptTokens = maxPromptTokens;
    }

    /**
     * @return the truncationStrategy
     */
    public AzureAITruncationStrategy getTruncationStrategy() {
        return truncationStrategy;
    }

    /**
     * @param truncationStrategy the truncationStrategy to set
     */
    public void setTruncationStrategy(AzureAITruncationStrategy truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }

    /**
     * @return the incompleteDetails
     */
    public String getIncompleteDetails() {
        return incompleteDetails;
    }

    /**
     * @param incompleteDetails the incompleteDetails to set
     */
    public void setIncompleteDetails(String incompleteDetails) {
        this.incompleteDetails = incompleteDetails;
    }

    /**
     * @return the usage
     */
    public AzureAIUsage getUsage() {
        return usage;
    }

    /**
     * @param usage the usage to set
     */
    public void setUsage(AzureAIUsage usage) {
        this.usage = usage;
    }

    /**
     * @return the responseFormat
     */
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * @param responseFormat the responseFormat to set
     */
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
     * @return the toolChoice
     */
    public String getToolChoice() {
        return toolChoice;
    }

    /**
     * @param toolChoice the toolChoice to set
     */
    public void setToolChoice(String toolChoice) {
        this.toolChoice = toolChoice;
    }

    /**
     * @return the parallelToolCalls
     */
    public boolean isParallelToolCalls() {
        return parallelToolCalls;
    }

    /**
     * @param parallelToolCalls the parallelToolCalls to set
     */
    public void setParallelToolCalls(boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }
}
