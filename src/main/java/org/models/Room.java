package org.models;

import org.constants.classes.RoomDescription;
import org.constants.enums.RoomFunctionalPurpose;
import org.constants.enums.RoomType;

import java.util.Dictionary;
import java.util.List;

public class Room {

    // VARs                             //   Focusing on what the dm should know
    private int id;
    private String designation;
    private String name;                //   If it has one
    private RoomType type;
    private RoomFunctionalPurpose functionalPurpose;
    private String storyPurpose;        //   i.e. build tension, provide clues of why such-and-such is going on

    private boolean timer;              //   Up-front-notice to DM if there is a time component to this room
    private String timeLimit;           //   How much time should be given (physical or turns)
    private String dynamicChanges;      //   Allow for changes in the environment based on player actions

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
