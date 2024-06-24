/*
Copyright (c) 2023 Int13 Consulting Inc.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package ca.int13.azureai.api.classes;

import java.util.ArrayList;
import java.util.HashMap;

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
