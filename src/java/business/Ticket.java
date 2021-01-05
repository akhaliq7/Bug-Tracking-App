/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Timestamp;

/**
 *
 * @author amar_
 */
public class Ticket {
    private int number;
    private String ticketType;
    private Timestamp created;
    private String priorityValue;
    private int bugId;
    private int userReporter;
    private int userAssigned;

    public Ticket(String ticketType, Timestamp created, String priorityValue) {
        this.ticketType = ticketType;
        this.created = created;
        this.priorityValue = priorityValue;
    }

    public Ticket() {
        this.ticketType = "";
        this.created = null;
        this.priorityValue = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public void setPriorityValue(String priorityValue) {
        this.priorityValue = priorityValue;
    }

    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public int getUserReporter() {
        return userReporter;
    }

    public void setUserReporter(int userReporter) {
        this.userReporter = userReporter;
    }

    public int getUserAssigned() {
        return userAssigned;
    }

    public void setUserAssigned(int userAssigned) {
        this.userAssigned = userAssigned;
    }
    
    
    
}
