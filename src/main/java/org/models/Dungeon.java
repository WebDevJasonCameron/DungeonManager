package org.models;

import java.util.List;

public class Dungeon {

    private int id;
    private String name;
    private String theme;           //   Whether classic with traps and monsters, a crypt, a castle, a cave, etc
    private String lore;            //   The history and background story of the Dungeon
    private String description;     //   Its history and any significant features that make it unique
    private String location;        //   In-game world or region where it is located
    private String size;            //   Small, medium, or large Dungeon? Can affect the time required to explore it
    private String creator;         //   Information about the game master or creator of the Dungeon
    private String entranceFee;     //   If applicable, the cost for adventurers to enter

    private int challengeRating;    //   Difficulty or appeal to adventurers
    private int popularityRating;   //   Feedback & ratings provided by adventurers
    private int recommendedLevel;   //   Level or experience range for adventurers

    private String status;          //   Currently open, closed for maintenance, or undergoing renovations

    private List<Room> rooms;       //   The list of rooms
    private List<Staff> staff;      //   Staff that support the Dungeon
    private List<Manager> managers; //   Middle management that manage the Staff
    private List<Owner> owners;     //   VIPs in charge of the overall business


    /**
     * Other Items
     * List of loot
     * Budget type stuff  --> Budget Class
     *
     */
}
