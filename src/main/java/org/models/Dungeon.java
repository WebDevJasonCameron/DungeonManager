package org.models;

import org.constants.enums.DungeonSizeEnum;
import org.constants.enums.DungeonStatusEnum;

import java.util.List;

public class Dungeon {

    // VARs
    private int id;
    private String name;
    private String theme;           //   Whether classic with traps and monsters, a crypt, a castle, a cave, etc
    private String lore;            //   The history and background story of the Dungeon
    private String description;     //   Significant features that make it unique
    private String location;        //   In-game world or region where it is located
    private DungeonSizeEnum size;
    private String creator;         //   Information about the game master or creator of the Dungeon
    private String entranceFee;     //   If applicable, the cost for adventurers to enter
    private DungeonStatusEnum status;
    private int challengeRating;    //   Difficulty or appeal to adventurers
    private int popularityRating;   //   Feedback & ratings provided by adventurers
    private int recommendedLevel;   //   Level or experience range for adventurers
    private String source;          //   Where this dungeon info actually comes from

    // OBJs
    private Budget budget;

    // LISTs
    private List<Room> rooms;       //   The list of rooms
    private List<Staff> staff;      //   Staff that support the Dungeon
    private List<Manager> managers; //   Middle management that manage the Staff
    private List<Owner> owners;     //   VIPs in charge of the overall business
    private List<Event> events;     //   Conferences <!> Add later

    // ===========================================================

    // CONs
    public Dungeon(){}

    public Dungeon(String name, DungeonSizeEnum size, DungeonStatusEnum status) {
        this.name = name;
        this.size = size;
        this.status = status;
    }

    public Dungeon(int id, String name, String theme, String lore, String description, String location, DungeonSizeEnum size, String creator, String entranceFee, DungeonStatusEnum status, int challengeRating, int popularityRating, int recommendedLevel, String source, Budget budget, List<Room> rooms, List<Staff> staff, List<Manager> managers, List<Owner> owners, List<Event> events) {
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.lore = lore;
        this.description = description;
        this.location = location;
        this.size = size;
        this.creator = creator;
        this.entranceFee = entranceFee;
        this.status = status;
        this.challengeRating = challengeRating;
        this.popularityRating = popularityRating;
        this.recommendedLevel = recommendedLevel;
        this.source = source;
        this.budget = budget;
        this.rooms = rooms;
        this.staff = staff;
        this.managers = managers;
        this.owners = owners;
        this.events = events;
    }


    // GETs
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTheme() {
        return theme;
    }
    public String getLore() {
        return lore;
    }
    public String getDescription() {
        return description;
    }
    public String getLocation() {
        return location;
    }
    public DungeonSizeEnum getSize() {
        return size;
    }
    public String getCreator() {
        return creator;
    }
    public String getEntranceFee() {
        return entranceFee;
    }
    public DungeonStatusEnum getStatus() {
        return status;
    }
    public int getChallengeRating() {
        return challengeRating;
    }
    public int getPopularityRating() {
        return popularityRating;
    }
    public int getRecommendedLevel() {
        return recommendedLevel;
    }
    public String getSource() {
        return source;
    }
    public Budget getBudget() {
        return budget;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public List<Staff> getStaff() {
        return staff;
    }
    public List<Manager> getManagers() {
        return managers;
    }
    public List<Owner> getOwners() {
        return owners;
    }
    public List<Event> getEvents() {
        return events;
    }


    // SETs
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setLore(String lore) {
        this.lore = lore;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setSize(DungeonSizeEnum size) {
        this.size = size;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setEntranceFee(String entranceFee) {
        this.entranceFee = entranceFee;
    }
    public void setStatus(DungeonStatusEnum status) {
        this.status = status;
    }
    public void setChallengeRating(int challengeRating) {
        this.challengeRating = challengeRating;
    }
    public void setPopularityRating(int popularityRating) {
        this.popularityRating = popularityRating;
    }
    public void setRecommendedLevel(int recommendedLevel) {
        this.recommendedLevel = recommendedLevel;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    // ===========================================================

    // METHs
    public boolean isOpen(){
        return DungeonStatusEnum.OPEN == this.status;
    }


}
