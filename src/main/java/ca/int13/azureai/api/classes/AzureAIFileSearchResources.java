/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.int13.azureai.api.classes;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class AzureAIFileSearchResources {

    @SerializedName("vector_store_ids")
    private List<String> vectorStoreIds;
}
