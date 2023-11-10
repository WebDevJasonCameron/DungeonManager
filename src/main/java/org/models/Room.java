package org.models;

import org.constants.classes.RoomDescription;

import java.util.Dictionary;
import java.util.List;

public class Room {

    // VARs
    private int id;
    private String designation;
    private String name;                //   If it has one
    private String type;                //   <N> Hall, Room, Courtyard,
    private String theme;
    private String functionalPurpose;
    private String storyPurpose;

    private boolean timer;
    private int timeLimit;              //    Introduce time-sensitive elements to add urgency
    private String dynamicChanges;      //    Allow for changes in the environment based on player actions

    // OBJs
    private RoomDescription description;

    // DICs
    private Dictionary<String, String> descriptionText;         //   Subject : Description text
    private Dictionary<String, String> boxText;                 //   Title : Description text
    private Dictionary<String, Item> items;                     //   Title : Description text
    private Dictionary<String, String> mapsAndPictures;         //   Title : URL

    // LISTs
    private List<Trap> traps;
    private List<Obstacle> obstacles;
    private List<Employee> employees;









}
