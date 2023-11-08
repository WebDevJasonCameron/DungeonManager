package org.constants;

public enum DungeonChallengeRating {
    DCR_1_3("DCR 1-3"),             //   These are beginner-level dungeons suitable for low-level
                                    // adventurers (Levels 1-3). They often contain straightforward
                                    // puzzles, simple traps, and weaker monsters, making them accessible
                                    // for novice adventurers.
    DCR_4_6("DCR 1-3"),             //   Intermediate-level dungeons designed for adventurers at Levels
                                    // 4-6. These dungeons may feature more complex puzzles, moderate
                                    // traps, and slightly tougher monsters. They offer a stepping stone
                                    // for characters looking to challenge themselves further.
    DCR_7_9("DCR 1-3"),             //   Intermediate to advanced dungeons for adventurers at Levels 7-9.
                                    // These dungeons can include intricate puzzles, challenging traps, and
                                    // formidable monsters. They require a higher level of skill and
                                    // experience.
    DCR_10_12("DCR 1-3"),           //   Advanced dungeons for high-level adventurers (Levels 10-12).
                                    // These dungeons are quite challenging, with complex puzzles, deadly
                                    // traps, and powerful foes. Only experienced adventurers should attempt
                                    // them
    DCR_12_15("DCR 1-3"),           //   High-level dungeons for adventurers at Levels 13-15. These dungeons
                                    // are designed for characters who are nearing the pinnacle of their power.
                                    // They feature intricate puzzles, deadly traps, and formidable bosses.
    DCR_16_20("DCR 1-3"),           //   Epic dungeons for characters at Levels 16-20. These dungeons are the
                                    // most challenging and are typically filled with highly intelligent
                                    // foes, intricate puzzles, and deadly traps. Only the most powerful
                                    // adventurers should attempt these.
    DCR_SPECIAL("DCR special");     //   Special dungeons that don't fit into the standard categories. These
                                    // dungeons might have unique qualities, such as temporal distortions,
                                    // interdimensional travel, or bizarre themes that don't follow the
                                    // traditional DCR rating system.

    private final String dungeonChallengeRating;

    DungeonChallengeRating(String dungeonChallengeRating) {
        this.dungeonChallengeRating = dungeonChallengeRating;
    }

    @Override
    public String toString() {
        return dungeonChallengeRating;
    }


}
