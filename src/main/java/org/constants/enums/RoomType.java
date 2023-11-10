package org.constants.enums;

public enum RoomType {
    Entrance("entrance, foyer"),                    //   i.e. Guard Post, Castle Entrance, Mansion's Foyer
    PASSAGEWAY("passageway, corridor, hallway"),    //   i.e. Secret passage, Collapsed Tunnel
    ROOM("room, chamber"),                          //   i.e. Guard Room, Armory, Antechamber, Torture Chamber
    LIBRARY("library, study"),                      //   i.e. Scriptorium (writing room), Hidden Archive
    STORAGE("storage, warehouse"),                  //   i.e. Treasure Vault, Wine Cellar
    WORKSHOP("workshop, forge"),                    //   i.e. Blacksmith's Forge, Trap Workshop, Lab
    PRISON_Cell("prison cells"),                    //   i.e. Cage room, Isolation Cell
    RELIGIOUS_CHAMBER("religious chamber"),         //   i.e. Alter, Sanctuary
    COMMON_AREA("common area"),                     //   i.e. Dining Hall, Feasting Hall, Communal Sleeping Quarters
    GARDEN("garden"),                               //   i.e. Green House, Conservatory
    TOWER("tower"),                                 //   i.e. Watch Tower, Observatory
    UTILITIES("utilities"),                         //   i.e. Bathroom, Well Room
    BURIAL("burial room, catacomb"),                //   i.e. Mass Grave, Crypt
    NEXUS("magical nexus, "),                       //   i.e. Elemental Conduit, Portal Room
    MAZE("maze, labyrinth");                        //   i.e. Minotaur's Lair, hedge maze


    private final String type;

    RoomType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

}
