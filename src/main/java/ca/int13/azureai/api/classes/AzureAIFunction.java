/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

/**
 *
 * @author mgamble
 */
public class AzureAIFunction {
    private String name;
    private String description;
    private AzureAIFunctionParameters parameters;

    public AzureAIFunction() {
        
    }
    
    public AzureAIFunction(String name, String description, AzureAIFunctionParameters parameters ) {
        this.name = name;
        this.description = description;
        this.parameters = parameters;
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
     * @return the parameters
     */
    public AzureAIFunctionParameters getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(AzureAIFunctionParameters parameters) {
        this.parameters = parameters;
    }
}
