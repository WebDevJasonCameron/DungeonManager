package org.models;

import java.util.List;

public class CharacterSheet {

    // VARs
    private String creatureName;    //   Meta
    private String size;
    private String creatureType;
    private int armorClass;
    private int hitPoints;
    private int walkSpeed;          //   Movements
    private int flySpeed;
    private int swimSpeed;
    private int climbSpeed;
    private int stealthSpeed;
    private int str;                //   Abilities
    private int strMod;
    private int dex;
    private int dexMod;
    private int con;
    private int conMod;
    private int intel;
    private int intelMod;
    private int wis;
    private int wisMod;
    private int cha;
    private int chaMod;
    private double challengeRank;
    private int xp;
    private int proficiencyBonus;
    private boolean multiAttack;
    private String Description;
    private String source;


    // LISTs
    private List<DamageImmunities> damageImmunities;
    private List<ConditionImmunities> conditionImmunities;
    private List<Senses> senses;
    private List<Languages> languages;
    private List<Attribute> attributes;
    private List<Action> actions;
    private List<Reaction> reactions;
    private List<BonusAction> bonusActions;
    private List<Environment> environments;


}


