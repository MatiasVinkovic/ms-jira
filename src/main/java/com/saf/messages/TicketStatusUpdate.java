package com.saf.messages;

import java.io.Serializable;
import com.saf.core.Message;

/**
 * Notification de statut du ticket (Observer Pattern)
 */
public class TicketStatusUpdate implements Message, Serializable {
    private String ticketId;
    private TicketStatus newStatus;
    private String message;
    private String assignedTo;

    public TicketStatusUpdate(String ticketId, TicketStatus newStatus, String message, String assignedTo) {
        this.ticketId = ticketId;
        this.newStatus = newStatus;
        this.message = message;
        this.assignedTo = assignedTo;
    }

    public String getTicketId() { return ticketId; }
    public TicketStatus getNewStatus() { return newStatus; }
    public String getMessage() { return message; }
    public String getAssignedTo() { return assignedTo; }

    @Override
    public String toString() {
        return String.format("📋 NOTIFICATION: Ticket %s → %s (Par: %s)", ticketId, newStatus, assignedTo);
    }
}
