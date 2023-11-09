import org.constants.enums.DungeonChallengeRatingEnum;
import org.constants.enums.DungeonSizeEnum;
import org.constants.enums.DungeonStatusEnum;
import org.constants.explainer.DungeonChallengeRatingExplainer;
import org.models.Dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse, iceCave, vampireCastle, pinkDisco;

        smashHouse = new Dungeon("Smash House",
                                    DungeonSizeEnum.LARGE,
                                    DungeonStatusEnum.OPEN,
                                    DungeonChallengeRatingEnum.DCR_7_9);
        iceCave = new Dungeon("Ice Cave",
                                    DungeonSizeEnum.MEDIUM,
                                    DungeonStatusEnum.OPEN,
                                    DungeonChallengeRatingEnum.DCR_1_3);
        vampireCastle = new Dungeon("Van Stoker Caste",
                                    DungeonSizeEnum.EXTRA_LARGE,
                                    DungeonStatusEnum.CLOSED,
                                    DungeonChallengeRatingEnum.DCR_4_6);
        pinkDisco = new Dungeon("Pink Disco",
                                    DungeonSizeEnum.MINI,
                                    DungeonStatusEnum.RENOVATING,
                                    DungeonChallengeRatingEnum.DCR_SPECIAL);

        List<Dungeon> dungeons = new ArrayList<>(Arrays.asList(smashHouse,iceCave,vampireCastle, pinkDisco));

        System.out.println(vampireCastle.dcrExplainer());

    }
}
