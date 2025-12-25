package com.saf.messages;

import java.io.Serializable;

/**
 * Représente un statut de réparation
 * Strategy Pattern: permet différentes stratégies de réparation
 */
public enum RepairStatus implements Serializable {
    ASSIGNED("Réparation assignée"),
    IN_PROGRESS("En cours de réparation"),
    COMPLETED("Réparation complétée"),
    FAILED("Réparation échouée");

    private final String description;

    RepairStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
