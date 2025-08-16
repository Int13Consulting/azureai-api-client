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
public class AzureAIToolResources {

    /**
     * @return the fileSearch
     */
    public AzureAIFileSearchResources getFileSearch() {
        return fileSearch;
    }

    /**
     * @param fileSearch the fileSearch to set
     */
    public void setFileSearch(AzureAIFileSearchResources fileSearch) {
        this.fileSearch = fileSearch;
    }

    @SerializedName("file_search")
    private AzureAIFileSearchResources fileSearch;
}
