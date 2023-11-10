package org.constants.classes;

import java.util.List;

public class RoomDescription {

    // VARs
    // Physical
    private String shape;
    private double width;
    private double length;
    private double height;

    // Senses
    private String Aesthetics;          //   Visual style of the room: ancient & mystical or modern & technological
    private String lighting;            //   Well-lit, dimly lit, or completely dark? ... magical or natural light
    private String sounds;
    private String smells;
    private String temperature;         //   Is the room hot, cold, or temperate
    private String weather;             //   any weather effects within the room: rain, snow, or unnatural phenomena

    // Player Aware
    private String visibility;          //   Can see from the current room & how it fits with the rest of

    // LISTs
    private List<String> roomConnections;//   Consider how the room connects to adjacent areas

}
