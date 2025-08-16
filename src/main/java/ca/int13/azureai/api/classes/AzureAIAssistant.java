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
public class AzureAIAssistant {
    @SerializedName("id")
        private String id;

        @SerializedName("object")
        private String object;

        @SerializedName("created_at")
        private long createdAt;

        @SerializedName("name")
        private String name;

        @SerializedName("description")
        private String description;

        @SerializedName("model")
        private String model;

        @SerializedName("instructions")
        private String instructions;

        @SerializedName("tools")
        private List<AzureAITool> tools;

        @SerializedName("top_p")
        private double topP;

        @SerializedName("temperature")
        private double temperature;

        @SerializedName("tool_resources")
        private AzureAIToolResources toolResources;

        @SerializedName("metadata")
        private AzureAIMetadata metadata;

        @SerializedName("response_format")
        private String responseFormat;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

}
