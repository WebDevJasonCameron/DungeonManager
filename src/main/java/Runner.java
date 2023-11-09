import org.constants.enums.DungeonSizeEnum;
import org.constants.enums.DungeonStatusEnum;
import org.models.Dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse, iceCave, vampireCastle, pinkDisco;

        smashHouse = new Dungeon("Smash House", DungeonSizeEnum.LARGE, DungeonStatusEnum.OPEN);
        iceCave = new Dungeon("Ice Cave", DungeonSizeEnum.MEDIUM, DungeonStatusEnum.OPEN);
        vampireCastle = new Dungeon("Van Stoker Caste", DungeonSizeEnum.EXTRA_LARGE, DungeonStatusEnum.CLOSED);
        pinkDisco = new Dungeon("Pink Disco", DungeonSizeEnum.MINI, DungeonStatusEnum.RENOVATING);

        List<Dungeon> dungeons = new ArrayList<>(Arrays.asList(smashHouse,iceCave,vampireCastle, pinkDisco));

        for(Dungeon dungeon : dungeons){
            if(dungeon.isOpen()){
                System.out.println(dungeon.getName());
                System.out.println(dungeon.getSize());
                System.out.println(dungeon.getStatus());
                System.out.println("\n");
            }
         }

    }
}
