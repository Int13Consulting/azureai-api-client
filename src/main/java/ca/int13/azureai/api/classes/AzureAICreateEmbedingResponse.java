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

/**
 *
 * @author mgamble
 */
public class AzureAICreateEmbedingResponse {
    private String object;
    private String model;
    private ArrayList<AzureAICreateEmbedingResponseData> data;

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
     * @return the data
     */
    public ArrayList<AzureAICreateEmbedingResponseData> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ArrayList<AzureAICreateEmbedingResponseData> data) {
        this.data = data;
    }
    
    public void addData(AzureAICreateEmbedingResponseData data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
    
    
}
