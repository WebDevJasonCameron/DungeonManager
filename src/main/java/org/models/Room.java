package org.models;

import org.constants.classes.RoomDescription;

import java.util.List;

public class Room {

    // VARs
    private int id;
    private String designation;
    private String name;                //   If it has one
    private String type;
    private String theme;
    private String visibility;          //   Can see from the current room & how it fits with the rest of
    private String functionalPurpose;
    private String storyPurpose;

    private boolean timer;
    private int timeLimit;              //    Introduce time-sensitive elements to add urgency
    private String dynamicChanges;      //    Allow for changes in the environment based on player actions

    // OBJs
    private RoomDescription description;

    // LISTs
    private List<Trap> traps;
    private List<Obstacle> obstacles;
    private List<Employee> employees;
    private List<Manager> managers;
    private List<Owner> owners;
    private List<String> roomConnections;//   Consider how the room connects to adjacent areas







}
