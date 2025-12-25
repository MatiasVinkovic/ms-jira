package com.saf.messages;

import java.io.Serializable;
import com.saf.core.Message;

/**
 * Demande d'assignation de réparation
 * Factory Pattern: création contrôlée de réparations
 */
public class AssignRepairRequest implements Message, Serializable {
    private String ticketId;
    private String ticketTitle;
    private String ticketDescription;
    private TicketPriority priority;
    private RepairCategory category;
    private String reparatorId;

    public AssignRepairRequest(String ticketId, String title, String description,
                               TicketPriority priority, RepairCategory category, String reparatorId) {
        this.ticketId = ticketId;
        this.ticketTitle = title;
        this.ticketDescription = description;
        this.priority = priority;
        this.category = category;
        this.reparatorId = reparatorId;
    }

    public String getTicketId() { return ticketId; }
    public String getTicketTitle() { return ticketTitle; }
    public String getTicketDescription() { return ticketDescription; }
    public TicketPriority getPriority() { return priority; }
    public RepairCategory getCategory() { return category; }
    public String getReparatorId() { return reparatorId; }

    @Override
    public String toString() {
        return String.format("AssignRepairRequest{id='%s', title='%s', category=%s, priority=%s, reparator='%s'}",
                ticketId, ticketTitle, category.getDisplayName(), priority, reparatorId);
    }
}
