package org.constants.enums;

public enum DungeonStatusEnum {
    OPEN("open"),
    CLOSED("closed"),
    MAINTENANCE("maintenance"),
    RENOVATING("renovating");

    private final String status;

    DungeonStatusEnum(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }


}
