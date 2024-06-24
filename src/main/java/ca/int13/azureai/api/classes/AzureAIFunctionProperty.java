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
import java.util.List;

/**
 *
 * @author mgamble
 */
public class AzureAIFunctionProperty {

    private String type;
    private String description;
    private List<String> enumValues; // Only for the 'format' field
 private HashMap<String, AzureAIFunctionParameters> items;

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
        /**
     * @return the items
     */
    public HashMap<String, AzureAIFunctionParameters> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(HashMap<String, AzureAIFunctionParameters> items) {
        this.items = items;
    }

}
