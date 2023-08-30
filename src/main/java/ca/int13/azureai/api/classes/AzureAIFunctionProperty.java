/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import java.util.List;

/**
 *
 * @author mgamble
 */
public class AzureAIFunctionProperty {

    private String type;
    private String description;
    private List<String> enumValues; // Only for the 'format' field

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
     * @return the enumValues
     */
    public List<String> getEnumValues() {
        return enumValues;
    }

    /**
     * @param enumValues the enumValues to set
     */
    public void setEnumValues(List<String> enumValues) {
        this.enumValues = enumValues;
    }
}
