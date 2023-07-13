/*
Copyright (c) 2023 Matthew M. Gamble

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
public class AzureAIChoice {
    private AzureAIMessage message;
    @SerializedName("finish_reason")
    private String finishReason;
    @SerializedName("logprobs")
    private String logprobs;
    private int index;

    /**
     * @return the finishReason
     */
    public String getFinishReason() {
        return finishReason;
    }

    /**
     * @param finishReason the finishReason to set
     */
    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the logprobs
     */
    public String getLogprobs() {
        return logprobs;
    }

    /**
     * @param logprobs the logprobs to set
     */
    public void setLogprobs(String logprobs) {
        this.logprobs = logprobs;
    }

    /**
     * @return the message
     */
    public AzureAIMessage getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(AzureAIMessage message) {
        this.message = message;
    }
}
