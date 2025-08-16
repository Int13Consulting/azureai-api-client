/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes.realtime;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class Session {
    private String id;
    private String object;
    private String model;
    private List<String> modalities;
    private String instructions;
    private String voice;
    
    @SerializedName("input_audio_format")
    private String inputAudioFormat;

    @SerializedName("output_audio_format")
    private String outputAudioFormat;

    @SerializedName("input_audio_transcription")
    private String inputAudioTranscription;

    @SerializedName("turn_detection")
    private TurnDetection turnDetection;
    private List<Object> tools;
    
    @SerializedName("tool_choice")
    private String toolChoice;
    
    private double temperature;
    
    @SerializedName("max_response_output_tokens")
    private Integer maxResponseOutputTokens;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getObject() { return object; }
    public void setObject(String object) { this.object = object; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public List<String> getModalities() { return modalities; }
    public void setModalities(List<String> modalities) { this.modalities = modalities; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public String getVoice() { return voice; }
    public void setVoice(String voice) { this.voice = voice; }

    public String getInputAudioFormat() { return inputAudioFormat; }
    public void setInputAudioFormat(String inputAudioFormat) { this.inputAudioFormat = inputAudioFormat; }

    public String getOutputAudioFormat() { return outputAudioFormat; }
    public void setOutputAudioFormat(String outputAudioFormat) { this.outputAudioFormat = outputAudioFormat; }

    public String getInputAudioTranscription() { return inputAudioTranscription; }
    public void setInputAudioTranscription(String inputAudioTranscription) { this.inputAudioTranscription = inputAudioTranscription; }

    public TurnDetection getTurnDetection() { return turnDetection; }
    public void setTurnDetection(TurnDetection turnDetection) { this.turnDetection = turnDetection; }

    public List<Object> getTools() { return tools; }
    public void setTools(List<Object> tools) { this.tools = tools; }

    public String getToolChoice() { return toolChoice; }
    public void setToolChoice(String toolChoice) { this.toolChoice = toolChoice; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public Integer getMaxResponseOutputTokens() { return maxResponseOutputTokens; }
    public void setMaxResponseOutputTokens(Integer maxResponseOutputTokens) { this.maxResponseOutputTokens = maxResponseOutputTokens; }
}