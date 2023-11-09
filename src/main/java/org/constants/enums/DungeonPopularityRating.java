package org.constants.enums;

public enum DungeonPopularityRating {
    ONE_STARS("⭐️"),
    TWO_STARS("⭐️⭐️"),
    THREE_STARS("⭐️⭐️⭐️"),
    FOUR_STARS("⭐️⭐️⭐️⭐️"),
    FIVE_STARS("⭐️⭐️⭐️⭐️⭐️");

    private final String rating;

    DungeonPopularityRating(String rating){
        this.rating = rating;
    }

    @Override
    public String toString() {
        return rating;
    }
}
