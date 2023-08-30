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

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class AzureAIMessage {
    
    private String name;
    private AzureAIRole role;
    private String content;
    @SerializedName("function_call")
    private AzureAIFunctionCall functionCall;

    public AzureAIMessage() {
        
    }
    public AzureAIMessage(String content, AzureAIRole role) {
        this.content = content;
        this.role = role;
    }
    
    /**
     * @return the role
     */
    public AzureAIRole getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(AzureAIRole role) {
        this.role = role;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the functionCall
     */
    public AzureAIFunctionCall getFunctionCall() {
        return functionCall;
    }

    /**
     * @param functionCall the functionCall to set
     */
    public void setFunctionCall(AzureAIFunctionCall functionCall) {
        this.functionCall = functionCall;
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
    
}
