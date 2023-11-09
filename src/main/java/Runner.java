import org.constants.enums.DungeonChallengeRating;
import org.constants.enums.DungeonSize;
import org.constants.enums.DungeonStatus;
import org.models.Dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse, iceCave, vampireCastle, pinkDisco;

        smashHouse = new Dungeon("Smash House",
                                    DungeonSize.LARGE,
                                    DungeonStatus.OPEN,
                                    DungeonChallengeRating.DCR_7_9);
        iceCave = new Dungeon("Ice Cave",
                                    DungeonSize.MEDIUM,
                                    DungeonStatus.OPEN,
                                    DungeonChallengeRating.DCR_1_3);
        vampireCastle = new Dungeon("Van Stoker Caste",
                                    DungeonSize.EXTRA_LARGE,
                                    DungeonStatus.CLOSED,
                                    DungeonChallengeRating.DCR_4_6);
        pinkDisco = new Dungeon("Pink Disco",
                                    DungeonSize.MINI,
                                    DungeonStatus.RENOVATING,
                                    DungeonChallengeRating.DCR_SPECIAL);

        List<Dungeon> dungeons = new ArrayList<>(Arrays.asList(smashHouse,iceCave,vampireCastle, pinkDisco));

        for (Dungeon dungeon : dungeons){
            System.out.println(dungeon.dcrExplainer());
            System.out.println("\n------\n");
        }
    }
}
