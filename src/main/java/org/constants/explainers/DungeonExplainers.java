package org.constants.explainers;

import org.constants.enums.DungeonChallengeRating;
import org.constants.enums.DungeonPopularityRating;
import org.constants.enums.DungeonSize;

public class DungeonExplainers {

    public String challengeRating(DungeonChallengeRating dcr){
        switch (dcr){
            case DCR_1_3 -> {
                return "These are beginner-level dungeons suitable for low-level " +
                        "adventurers (Levels 1-3). They often contain straightforward " +
                        "puzzles, simple traps, and weaker monsters, making them " +
                        "accessible for novice adventurers.";
            }
            case DCR_4_6 -> {
                return "Intermediate-level dungeons designed for adventurers at Levels 4-6. " +
                        "These dungeons may feature more complex puzzles, moderate traps, " +
                        "and slightly tougher monsters. They offer a stepping stone for " +
                        "characters looking to challenge themselves further.";
            }
            case DCR_7_9 -> {
                return "Intermediate to advanced dungeons for adventurers at Levels 7-9. " +
                        "These dungeons can include intricate puzzles, challenging traps, " +
                        "and formidable monsters. They require a higher level of skill and " +
                        "experience.";
            }
            case DCR_10_12 -> {
                return "Advanced dungeons for high-level adventurers (Levels 10-12). These " +
                        "dungeons are quite challenging, with complex puzzles, deadly " +
                        "traps, and powerful foes. Only experienced adventurers should " +
                        "attempt them";
            }
            case DCR_12_15 -> {
                return "High-level dungeons for adventurers at Levels 13-15. " +
                        "These dungeons are designed for characters who are nearing " +
                        "the pinnacle of their power. They feature intricate puzzles, " +
                        "deadly traps, and formidable bosses.";
            }
            case DCR_16_20 -> {
                return "Epic dungeons for characters at Levels 16-20. These dungeons " +
                        "are the most challenging and are typically filled with" +
                        " highly intelligent foes, intricate puzzles, and deadly " +
                        "traps. Only the most powerful adventurers should attempt " +
                        "these.";
            }
            case DCR_SPECIAL -> {
                return "Special dungeons that don't fit into the standard " +
                        "categories. These dungeons might have unique qualities, " +
                        "such as temporal distortions, interdimensional travel, " +
                        "or bizarre themes that don't follow the traditional DCR " +
                        "rating system.";
            }
            default -> {
                return "Nothing Found";
            }
        }
    }

    public String size(DungeonSize size){
        switch (size){
            case MINI -> {
                return "1-3 rooms";
            }
            case SMALL -> {
                return "4-5 rooms";
            }
            case MEDIUM -> {
                return "6-15 rooms";
            }
            case LARGE -> {
                return "16-30 rooms";
            }
            case EXTRA_LARGE -> {
                return "31+ rooms";
            }
            case GIGANTIC -> {
                return "Continent";
            }
            case ULTRA -> {
                return "World";
            }
            default -> {
                return "Unknown Dimensions";
            }
        }
    }

    public String popularityRating(DungeonPopularityRating dpr){
        switch (dpr){
            case ONE_STARS -> {
                return """
                        Poorly designed, confusing layout.
                        Lack of interesting challenges or encounters.
                        Boring or repetitive themes.""";
            }
            case TWO_STARS -> {
                return """
                        Average design with some flaws.
                        Encounter balance issues.
                        Story elements feel uninspired.""";
            }
            case THREE_STARS -> {
                return """
                        Well-designed layout with a good flow.
                        Balanced challenges and encounters.
                        Decent storytelling and thematic elements.""";
            }
            case FOUR_STARS -> {
                return """
                        Exceptional design and creativity.
                        Engaging challenges with memorable moments.
                        Immersive storytelling and thematic consistency.""";
            }
            case FIVE_STARS -> {
                return """
                        Flawless design, both visually and functionally.
                        Ingenious and unique challenges and puzzles.
                        Compelling narrative with memorable characters.
                        Rewards that feel satisfying and earned.""";
            }default -> {
                return "Nothing Found";
            }
        }
    }
}
