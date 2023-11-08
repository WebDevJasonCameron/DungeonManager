package org.constants;

public enum DungeonSize {
    MINI("mini"),                       //   1-3 rooms
    SMALL("small"),                     //   4-5 rooms
    MEDIUM("medium"),                   //   6-15 rooms
    LARGE("large"),                     //   16-30 rooms
    EXTRA_LARGE("extra large"),         //   31+ rooms
    GIGANTIC("gigantic"),               //   Continent
    ULTRA("ultra");                     //   World

    private final String size;

    DungeonSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
