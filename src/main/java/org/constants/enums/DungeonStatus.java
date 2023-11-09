package org.constants.enums;

public enum DungeonStatus {
    OPEN("open"),
    CLOSED("closed"),
    MAINTENANCE("maintenance"),
    RENOVATING("renovating");

    private final String status;

    DungeonStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }


}
