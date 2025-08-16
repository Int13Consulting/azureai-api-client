/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class AzureAICreateThreadMessage {

    @SerializedName("role")
    private String role;

    @SerializedName("content")
    private String content;

    @SerializedName("attachments")
    private List<AzureAIAttachment> attachments;

    @SerializedName("metadata")
    private Metadata metadata;

    
/*
    // Nested class for `attachments` array objects
    public static class Attachment {

        @SerializedName("file_id")
        private String fileId;

        @SerializedName("tools")
        private List<Tool> tools;

        // Nested class for `tools` in each `attachment`
        public static class Tool {

            @SerializedName("type")
            private String type;
        }

       
        public String getFileId() {
            return fileId;
        }

     
        public void setFileId(String fileId) {
            this.fileId = fileId;
        }

       
        public List<Tool> getTools() {
            return tools;
        }
 
        public void setTools(List<Tool> tools) {
            this.tools = tools;
        }
    }
    */

    // Placeholder for `metadata` object
    public static class Metadata {
    }

    public AzureAICreateThreadMessage() {

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
    
    public void addAttachment(AzureAIAttachment attachment) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachment);
    }

    /**
     * @return the metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
