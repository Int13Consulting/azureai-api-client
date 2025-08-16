/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author mgamble
 */
public class AzureAIThreadMessages {
    private String object;
    @SerializedName("data")
    private ArrayList<AzureAIThreadMessage> threadMessages;

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
     * @return the threadMessages
     */
    public ArrayList<AzureAIThreadMessage> getThreadMessages() {
        return threadMessages;
    }

    /**
     * @param threadMessages the threadMessages to set
     */
    public void setThreadMessages(ArrayList<AzureAIThreadMessage> threadMessages) {
        this.threadMessages = threadMessages;
    }
    
}
