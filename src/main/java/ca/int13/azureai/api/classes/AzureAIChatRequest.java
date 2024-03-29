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
import java.util.ArrayList;

/**
 *
 * @author mgamble
 */
public class AzureAIChatRequest {
    private ArrayList<AzureAIMessage> messages;
    private ArrayList<AzureAIFunction> functions;
    private Double temperature;
    @SerializedName("top_p")
    private Double topP;
    @SerializedName("n")
    private Integer choices;
    private boolean stream;
    private String stop;
    @SerializedName("max_tokens")
    private Integer maxTokens;
    @SerializedName("presence_penalty")
    private Integer presencePenalty;
    @SerializedName("frequency_penalty")
    private Integer frequencyPenalty;
    private String user;

    public AzureAIChatRequest() {
        this.topP = 0.95;
        this.temperature = 0.7;
        this.maxTokens = 800;
        this.frequencyPenalty = 0;
        this.presencePenalty = 0;   
                
    }
    /**
     * @return the messages
     */
    public ArrayList<AzureAIMessage> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(ArrayList<AzureAIMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(AzureAIMessage message) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(message);
    }
    /**
     * @return the temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the choices
     */
    public int getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(int choices) {
        this.choices = choices;
    }

    /**
     * @return the stream
     */
    public boolean isStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(boolean stream) {
        this.stream = stream;
    }

    /**
     * @return the stop
     */
    public String isStop() {
        return stop;
    }

    /**
     * @param stop the stop to set
     */
    public void setStop(String stop) {
        this.stop = stop;
    }

    public void setStop(boolean stop) {
        if (stop) {
            this.stop = "true";
        } else {
            this.stop = "false";
        }
    }
    /**
     * @return the maxTokens
     */
    public int getMaxTokens() {
        return maxTokens;
    }

    /**
     * @param maxTokens the maxTokens to set
     */
    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * @return the presencePenalty
     */
    public int getPresencePenalty() {
        return presencePenalty;
    }

    /**
     * @param presencePenalty the presencePenalty to set
     */
    public void setPresencePenalty(int presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    /**
     * @return the frequencyPenalty
     */
    public int getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * @param frequencyPenalty the frequencyPenalty to set
     */
    public void setFrequencyPenalty(int frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the functions
     */
    public ArrayList<AzureAIFunction> getFunctions() {
        return functions;
    }

    /**
     * @param functions the functions to set
     */
    public void setFunctions(ArrayList<AzureAIFunction> functions) {
        this.functions = functions;
    }
    
    public void addFunction(AzureAIFunction function) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(function);
    }
}
