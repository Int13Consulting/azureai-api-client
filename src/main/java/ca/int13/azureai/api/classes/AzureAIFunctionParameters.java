/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mgamble
 */
public class AzureAIFunctionParameters {
    private String type;
    private HashMap<String, AzureAIFunctionProperty> properties;
    private ArrayList<String> required;

    
    public AzureAIFunctionParameters() {
        
    }
    
    public AzureAIFunctionParameters(String type, HashMap<String, AzureAIFunctionProperty> properties, ArrayList<String> required) {
        this.type = type;
        this.properties = properties;
        this.required = required;
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
     * @return the properties
     */
    public HashMap<String, AzureAIFunctionProperty> getProperties() {
        return properties;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(HashMap<String, AzureAIFunctionProperty> properties) {
        this.properties = properties;
    }

    public void addProperty(String key, AzureAIFunctionProperty property) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, property);
    }
    /**
     * @return the required
     */
    public ArrayList<String> getRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(ArrayList<String> required) {
        this.required = required;
    }
    
    public void addRequired(String required) {
        if (this.required == null) {
            this.required = new ArrayList<>();
        }
        this.required.add(required);
    }
}
