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
public class AzureAITruncationStrategy {
            private String type;
        @SerializedName("last_messages")
        private String lastMessages;
        
        public AzureAITruncationStrategy() {
            
        }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the lastMessages
     */
    public String getLastMessages() {
        return lastMessages;
    }

    /**
     * @param lastMessages the lastMessages to set
     */
    public void setLastMessages(String lastMessages) {
        this.lastMessages = lastMessages;
    }
}
