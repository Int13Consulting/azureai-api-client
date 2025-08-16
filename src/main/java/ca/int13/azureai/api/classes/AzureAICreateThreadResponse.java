/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class AzureAICreateThreadResponse {

    /* {
  "id": "thread_1627b5Lqbk3nOofamWtbhEvY",
  "object": "thread",
  "created_at": 1731505347,
  "metadata": {},
  "tool_resources": {}
} 
*/
   @SerializedName("id")
   private String threadId;
   private String object;
   private String createdAt;
   private AzureAIMetadata metadata;
   @SerializedName("tool_resources")
   private AzureAIToolResources toolResources;

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
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
   
}
