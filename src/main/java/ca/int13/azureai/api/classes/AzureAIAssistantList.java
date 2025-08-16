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
public class AzureAIAssistantList {
        @SerializedName("object")
    private String object;

    @SerializedName("data")
    private List<AzureAIAssistant> assistants;

    @SerializedName("first_id")
    private String firstId;

    @SerializedName("last_id")
    private String lastId;

    @SerializedName("has_more")
    private boolean hasMore;

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
     * @return the assistants
     */
    public List<AzureAIAssistant> getAssistants() {
        return assistants;
    }

    /**
     * @param assistants the assistants to set
     */
    public void setAssistants(List<AzureAIAssistant> assistants) {
        this.assistants = assistants;
    }

    /**
     * @return the firstId
     */
    public String getFirstId() {
        return firstId;
    }

    /**
     * @param firstId the firstId to set
     */
    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    /**
     * @return the lastId
     */
    public String getLastId() {
        return lastId;
    }

    /**
     * @param lastId the lastId to set
     */
    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    /**
     * @return the hasMore
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * @param hasMore the hasMore to set
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}
