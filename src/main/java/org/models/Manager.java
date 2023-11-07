package org.models;

import java.util.List;

public class Manager {

    // VARs
    private int id;
    private String name;
    private String type;
    private String lore;
    private String contactInfo;
    private String location;            //   Physical location in the dungeon management office or headquarters
    private String title;               //   The manager's official title or rank within the organization
    private String background;          //   Could add depth to the character and provide context for their role
    private String profilePix;          //   Upload an avatar or profile picture that represents their character
    private String portfolio;           //   A list of dungeons managed by the character

    // OBJs
    private Compensation compensation;  //   Pay, Pay Grade,
    private CharacterSheet characterSheet;

    // LISTs
    private List<Equipment> equipment;  //   Track any items, equipment, or resources the manager possesses
    private List<BenefitPackage> benefitPackages;
    private List<Note> notes;           //   A place to add notes, comments, or reminders related
    private List<Achievement> achievements;

}
