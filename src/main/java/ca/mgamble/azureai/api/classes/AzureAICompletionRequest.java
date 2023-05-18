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
import java.util.HashMap;


/**
 *
 * @author mgamble
 */
public class AzureAICompletionRequest {
    private String prompt;
    @SerializedName("max_tokens")
    private int maxTokens;
    private int temperature = 1;
    @SerializedName("top_p")
    private int topProbibility = 1;
    @SerializedName("logit_bias")
    private HashMap<String, Integer> logitBiasMap;
    private String user;
    @SerializedName("n")
    private int choices = 1;
    private boolean stream = false;
    private String suffix;
    private boolean echo;
    private String stop;
    
    @SerializedName("presence_penalty")
    private int presencePenalty = 0;
    @SerializedName("frequency_penalty")
    private int frequencyPenalty = 0;
    @SerializedName("best_of")
    private int bestOf;

    /**
     * @return the prompt
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * @param prompt the prompt to set
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
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
     * @return the topProbibility
     */
    public int getTopProbibility() {
        return topProbibility;
    }

    /**
     * @param topProbibility the topProbibility to set
     */
    public void setTopProbibility(int topProbibility) {
        this.topProbibility = topProbibility;
    }

    /**
     * @return the logitBiasMap
     */
    public HashMap<String, Integer> getLogitBiasMap() {
        return logitBiasMap;
    }

    /**
     * @param logitBiasMap the logitBiasMap to set
     */
    public void setLogitBiasMap(HashMap<String, Integer> logitBiasMap) {
        this.logitBiasMap = logitBiasMap;
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
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @return the echo
     */
    public boolean isEcho() {
        return echo;
    }

    /**
     * @param echo the echo to set
     */
    public void setEcho(boolean echo) {
        this.echo = echo;
    }

    /**
     * @return the stop
     */
    public String getStop() {
        return stop;
    }

    /**
     * @param stop the stop to set
     */
    public void setStop(String stop) {
        this.stop = stop;
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
     * @return the bestOf
     */
    public int getBestOf() {
        return bestOf;
    }

    /**
     * @param bestOf the bestOf to set
     */
    public void setBestOf(int bestOf) {
        this.bestOf = bestOf;
    }

   
    
}
