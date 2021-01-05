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
public class TicketStatus {
    private int id;
    private String status;
    private Timestamp started;
    private Timestamp ended;
    private int ticketNumber;

    public TicketStatus(Timestamp started) {
        this.status = "open";
        this.started = started;
        this.ended = null;
    }

    public TicketStatus() {
        this.status = "";
        this.started = null;
        this.ended = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStarted() {
        return started;
    }

    public void setStarted(Timestamp started) {
        this.started = started;
    }

    public Timestamp getEnded() {
        return ended;
    }

    public void setEnded(Timestamp ended) {
        this.ended = ended;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    
}
