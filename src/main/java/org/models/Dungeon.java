package org.models;

import org.constants.enums.DungeonChallengeRating;
import org.constants.enums.DungeonPopularityRating;
import org.constants.enums.DungeonSize;
import org.constants.enums.DungeonStatus;
import org.constants.explainers.DungeonExplainers;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Dungeon {

    // VARs
    private int id;
    private String name;
    private String theme;               //   <N> Refers to the overarching style or atmosphere of the dungeon
    private String type;                //   <N> Relates to the purpose and function of the dungeon
    private String lore;                //   The history and background story of the Dungeon
    private String description;         //   Significant features that make it unique
    private String location;            //   In-game world or region where it is located
    private DungeonSize size;
    private String creator;             //   Information about the game master or creator of the Dungeon
    private String entranceFee;         //   If applicable, the cost for adventurers to enter
    private DungeonStatus status;
    private DungeonChallengeRating challengeRating;
    private DungeonPopularityRating popularityRating;
    private String source;              //   Where this dungeon info actually comes from

    // OBJs
    private Budget budget;              //   <?> Cost and expenses of running a dungeon

    // LISTs
    private Dictionary<String, Room> rooms;     //   i.e. {A:1, Room Obj}
    private List<Employee> employees;   //   Employee that support the Dungeon
    private List<Manager> managers;     //   Middle management that manage the Employee
    private List<Owner> owners;         //   VIPs in charge of the overall business
    private List<Event> events;         //   Conferences <!> Add later

    // ===========================================================

    // CONs
    public Dungeon(){}

    public Dungeon(String name, DungeonSize size, DungeonStatus status, DungeonChallengeRating challengeRating, DungeonPopularityRating popularityRating) {
        this.name = name;
        this.size = size;
        this.status = status;
        this.challengeRating = challengeRating;
        this.popularityRating = popularityRating;
    }

    public Dungeon(int id, String name, String theme, String type, String lore, String description, String location, DungeonSize size, String creator, String entranceFee, DungeonStatus status, DungeonChallengeRating challengeRating, DungeonPopularityRating popularityRating, String source, Budget budget, Dictionary<String, Room> rooms, List<Employee> employees, List<Manager> managers, List<Owner> owners, List<Event> events) {
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.type = type;
        this.lore = lore;
        this.description = description;
        this.location = location;
        this.size = size;
        this.creator = creator;
        this.entranceFee = entranceFee;
        this.status = status;
        this.challengeRating = challengeRating;
        this.popularityRating = popularityRating;
        this.source = source;
        this.budget = budget;
        this.rooms = rooms;
        this.employees = employees;
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
    public String getType() {
        return type;
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
    public DungeonSize getSize() {
        return size;
    }
    public String getCreator() {
        return creator;
    }
    public String getEntranceFee() {
        return entranceFee;
    }
    public DungeonStatus getStatus() {
        return status;
    }
    public DungeonChallengeRating getChallengeRating() {
        return challengeRating;
    }
    public DungeonPopularityRating getPopularityRating() {
        return popularityRating;
    }
    public String getSource() {
        return source;
    }
    public Budget getBudget() {
        return budget;
    }
    public Dictionary<String, Room> getRooms() {
        return rooms;
    }
    public List<Employee> getEmployees() {
        return employees;
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
    public void setType(String type) {
        this.theme = type;
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
    public void setSize(DungeonSize size) {
        this.size = size;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setEntranceFee(String entranceFee) {
        this.entranceFee = entranceFee;
    }
    public void setStatus(DungeonStatus status) {
        this.status = status;
    }
    public void setChallengeRating(DungeonChallengeRating challengeRating) {
        this.challengeRating = challengeRating;
    }
    public void setPopularityRating(DungeonPopularityRating popularityRating) {
        this.popularityRating = popularityRating;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    public void setRooms(Dictionary<String, Room> rooms) {
        this.rooms = rooms;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
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
        return DungeonStatus.OPEN == this.status;
    }


    // <F> Explainers
    public String dcrExplainer(){                               //   dcr => Dungeon Challenge Rating
        DungeonExplainers explain = new DungeonExplainers();
        return explain.challengeRating(this.challengeRating);
    }
    public String dprExplainer(){                               //   dpr => Dungeon Popularity Rating
        DungeonExplainers explain = new DungeonExplainers();
        return explain.popularityRating(this.popularityRating);
    }


}
