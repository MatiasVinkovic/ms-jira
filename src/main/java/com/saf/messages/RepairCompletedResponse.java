package com.saf.messages;

import java.io.Serializable;
import com.saf.core.Message;

/**
 * Réponse de réparation complétée
 * Observer Pattern: notification du statut
 */
public class RepairCompletedResponse implements Message, Serializable {
    private String ticketId;
    private String reparatorId;
    private RepairStatus status;
    private String result;
    private long completionTime;

    public RepairCompletedResponse(String ticketId, String reparatorId, RepairStatus status, String result, long completionTime) {
        this.ticketId = ticketId;
        this.reparatorId = reparatorId;
        this.status = status;
        this.result = result;
        this.completionTime = completionTime;
    }

    public String getTicketId() { return ticketId; }
    public String getReparatorId() { return reparatorId; }
    public RepairStatus getStatus() { return status; }
    public String getResult() { return result; }
    public long getCompletionTime() { return completionTime; }

    @Override
    public String toString() {
        return String.format("RepairCompletedResponse{ticket='%s', reparator='%s', status=%s, time=%dms}",
                ticketId, reparatorId, status.getDescription(), completionTime);
    }
}
