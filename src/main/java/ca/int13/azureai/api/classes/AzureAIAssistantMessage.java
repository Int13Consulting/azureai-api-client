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
public class AzureAIAssistantMessage {
     @SerializedName("content")
    private String content;

    @SerializedName("role")
    private String role;

    @SerializedName("attachments")
    private List<AzureAIAttachment> attachments;

    public AzureAIAssistantMessage() {
        
    }
    // Constructor
    public AzureAIAssistantMessage(String content, String role, List<AzureAIAttachment> attachments) {
        this.content = content;
        this.role = role;
        this.attachments = attachments;
    }   

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
}
