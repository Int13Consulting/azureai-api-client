package ca.int13.azureai.api.classes;


import com.google.gson.annotations.SerializedName;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgamble
 */
public class AzureAIRunThreadRequest {
    @SerializedName("assistant_id")
    private String assistantId;

    @SerializedName("model")
    private String model;
    
    private boolean stream;
    

    public AzureAIRunThreadRequest() {
        this.stream = false;
        
    }
    // Constructor
    public AzureAIRunThreadRequest(String assistantId, String model) {
        this.assistantId = assistantId;
        this.model = model;
    }

    // Getters and setters (optional)
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the stream
     */
    public boolean isStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(boolean stream) {
        this.stream = stream;
    }
}
