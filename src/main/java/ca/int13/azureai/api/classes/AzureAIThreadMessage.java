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
public class AzureAIThreadMessage {
 

    @SerializedName("id")
    private String id;

    @SerializedName("object")
    private String object;

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("assistant_id")
    private String assistantId;

    @SerializedName("thread_id")
    private String threadId;

    @SerializedName("run_id")
    private String runId;

    @SerializedName("role")
    private String role;

    @SerializedName("content")
    private List<AzureAIThreadContent> content;

    @SerializedName("attachments")
    private List<AzureAIAttachment> attachments;

    @SerializedName("metadata")
    private AzureAIMetadata metadata;

  

    // Constructor to initialize required fields (optional)
    public AzureAIThreadMessage() {
        
    }

    // Getters and setters for each field (optional)

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
     * @return the runId
     */
    public String getRunId() {
        return runId;
    }

    /**
     * @param runId the runId to set
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the content
     */
    public List<AzureAIThreadContent> getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(List<AzureAIThreadContent> content) {
        this.content = content;
    }

    /**
     * @return the attachments
     */
    public List<AzureAIAttachment> getAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(List<AzureAIAttachment> attachments) {
        this.attachments = attachments;
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
}