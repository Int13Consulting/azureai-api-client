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
public class AzureAIFileUploadResponse {
    /*
    {
  "object": "file",
  "id": "assistant-NDfPfcyXQFY7Y8raPTvbNemN",
  "purpose": "assistants",
  "filename": "testcc.pdf",
  "bytes": 128782,
  "created_at": 1731509711,
  "status": "processed",
  "status_details": null
}
    */
    @SerializedName("object")
    private String object;

    @SerializedName("id")
    private String id;

    @SerializedName("purpose")
    private String purpose;

    @SerializedName("filename")
    private String filename;

    @SerializedName("bytes")
    private int bytes;

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("status")
    private String status;

    @SerializedName("status_details")
    private String statusDetails;

    public AzureAIFileUploadResponse() {
        
    }
    // Constructor
    public AzureAIFileUploadResponse(String object, String id, String purpose, String filename,
                              int bytes, long createdAt, String status, String statusDetails) {
        this.object = object;
        this.id = id;
        this.purpose = purpose;
        this.filename = filename;
        this.bytes = bytes;
        this.createdAt = createdAt;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    // Getters and Setters (optional)
    public String getObject() { return object; }
    public void setObject(String object) { this.object = object; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public String getFilename() { return filename; }
    public void setFilename(String filename) { this.filename = filename; }

    public int getBytes() { return bytes; }
    public void setBytes(int bytes) { this.bytes = bytes; }

    public long getCreatedAt() { return createdAt; }
    public void setCreatedAt(long createdAt) { this.createdAt = createdAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getStatusDetails() { return statusDetails; }
    public void setStatusDetails(String statusDetails) { this.statusDetails = statusDetails; }
}
