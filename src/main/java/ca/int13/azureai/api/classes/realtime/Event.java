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
public class Event {
    private String type;
    
    @SerializedName("event_id")
    private String eventId;
    
    private Session session;

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }

    public Session getSession() { return session; }
    public void setSession(Session session) { this.session = session; }
}