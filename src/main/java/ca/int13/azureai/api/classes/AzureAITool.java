/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class AzureAITool {

    @SerializedName("type")
    private String type;

    @SerializedName("file_search")
    private FileSearch fileSearch;

    public static class FileSearch {

        @SerializedName("ranking_options")
        private RankingOptions rankingOptions;

        public static class RankingOptions {

            @SerializedName("ranker")
            private String ranker;

            @SerializedName("score_threshold")
            private double scoreThreshold;
        }
    }
    
    public AzureAITool() {
        
    }
    public AzureAITool(String type) {
        this.type = type;
    }
}
