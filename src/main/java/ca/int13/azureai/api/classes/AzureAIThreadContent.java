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
// Nested class for `content` array objects
public class AzureAIThreadContent {

    @SerializedName("type")
    private String type;

    @SerializedName("text")
    private AzureAIText text;

    // Nested class for `text` object in `content`
   

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
     * @return the text
     */
    public AzureAIText getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(AzureAIText text) {
        this.text = text;
    }
    
    public void setText(String text) {
        this.text = new AzureAIText(text);
    }
}
