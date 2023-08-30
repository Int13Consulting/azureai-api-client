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
public class AzureAIUsage {
    /*
     "prompt_tokens": 10,
        "completion_tokens": 9,
        "total_tokens": 19
    */
    @SerializedName("prompt_tokens")
    private int promptTokens;
    @SerializedName("completion_tokens")
    private int completionTokens;
    @SerializedName("total_tokens")
    private int totalTokens;

    /**
     * @return the promptTokens
     */
    public int getPromptTokens() {
        return promptTokens;
    }

    /**
     * @param promptTokens the promptTokens to set
     */
    public void setPromptTokens(int promptTokens) {
        this.promptTokens = promptTokens;
    }

    /**
     * @return the completionTokens
     */
    public int getCompletionTokens() {
        return completionTokens;
    }

    /**
     * @param completionTokens the completionTokens to set
     */
    public void setCompletionTokens(int completionTokens) {
        this.completionTokens = completionTokens;
    }

    /**
     * @return the totalTokens
     */
    public int getTotalTokens() {
        return totalTokens;
    }

    /**
     * @param totalTokens the totalTokens to set
     */
    public void setTotalTokens(int totalTokens) {
        this.totalTokens = totalTokens;
    }
    
}
