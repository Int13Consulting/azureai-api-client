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
package ca.mgamble.azureai.api.classes;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author mgamble
 */
public class AzureAIChatRequest {
    private ArrayList<AzureAIMessage> messages;
    private int temperature;
    @SerializedName("n")
    private int choices;
    private boolean stream;
    private boolean stop;
    @SerializedName("max_tokens")
    private int maxTokens;
    @SerializedName("presence_penalty")
    private int presencePenalty;
    @SerializedName("frequency_penalty")
    private int frequencyPenalty;
    private String user;

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

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
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
    public boolean isStop() {
        return stop;
    }

    /**
     * @param stop the stop to set
     */
    public void setStop(boolean stop) {
        this.stop = stop;
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
}
