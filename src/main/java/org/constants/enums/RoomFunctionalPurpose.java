package org.constants.enums;

public enum RoomFunctionalPurpose {
    ENTRY("entry"),
    SECURITY("security"),
    PASSAGEWAY("passageway"),
    GENERAL("general"),
    KNOWLEDGE("knowledge"),
    STORAGE("storage"),
    CRAFTING("crafting"),
    CONFINEMENT("confinement"),
    RELIGIOUS("religious"),
    SOCIAL("social"),
    NATURE("nature"),
    PLANNING("planning"),
    HYGIENIC("hygienic"),
    RESIDENTIAL("residential"),
    BURIAL("burial"),
    TRAINING("training"),
    MAGICAL("magical"),
    CHALLENGING("challenging");

    private final String purpose;

    RoomFunctionalPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return purpose;
    }
}
