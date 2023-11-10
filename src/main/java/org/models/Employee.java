package org.models;

import java.util.List;

public class Employee {

    // VARs
    private int id;
    private String name;
    private String jobTitle;            //   <?> What job titles are there in the dungeon management business
    private String jobRank;             //   <?> shift worker, shift manager, manager, department manager, CEO
    private String jobDepartment;       //   <?> Security, Mx, Resources, HR <- ask AI
    private String location;            //   Room

    // OBJs
    private Compensation compensation;  //   Pay, Pay Grade,
    private CharacterSheet characterSheet;
    private HRFile hrFile;

    // LISTs
    private List<Equipment> equipment;  //   Track any items, equipment, or resources the manager possesses
    private List<BenefitPackage> benefitPackages;
    private List<Note> notes;           //   A place to add notes, comments, or reminders related
    private List<Achievement> achievements;


}
