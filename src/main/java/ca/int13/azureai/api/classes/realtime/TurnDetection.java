/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes.realtime;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class TurnDetection {
    private String type;
    
    private double threshold;

    @SerializedName("prefix_padding_ms")
    private int prefixPaddingMs;

    @SerializedName("silence_duration_ms")
    private int silenceDurationMs;

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getThreshold() { return threshold; }
    public void setThreshold(double threshold) { this.threshold = threshold; }

    public int getPrefixPaddingMs() { return prefixPaddingMs; }
    public void setPrefixPaddingMs(int prefixPaddingMs) { this.prefixPaddingMs = prefixPaddingMs; }

    public int getSilenceDurationMs() { return silenceDurationMs; }
    public void setSilenceDurationMs(int silenceDurationMs) { this.silenceDurationMs = silenceDurationMs; }
}
