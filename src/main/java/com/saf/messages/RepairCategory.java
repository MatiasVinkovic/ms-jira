package com.saf.messages;

import java.io.Serializable;

/**
 * Catégories de réparation (Strategy Pattern)
 */
public enum RepairCategory implements Serializable {
    HARDWARE("Matériel"),
    SOFTWARE("Logiciel"),
    NETWORK("Réseau"),
    SECURITY("Sécurité"),
    DATABASE("Base de données"),
    PERFORMANCE("Performance");

    private final String displayName;

    RepairCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
