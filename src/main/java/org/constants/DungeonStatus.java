package org.constants;

public enum DungeonStatus {
    OPEN("open"),
    CLOSED("closed"),
    MAINTENANCE("maintenance"),
    RENOVATING("renovating");


    private String status;

    DungeonStatus(String size) {
        this.status = size;
    }

    @Override
    public String toString() {
        return status;
    }


}
