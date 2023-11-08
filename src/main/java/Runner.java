import org.constants.DungeonSize;
import org.constants.DungeonStatus;
import org.models.Dungeon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse, iceCave, vampireCastle, pinkDisco;

        smashHouse = new Dungeon("Smash House", DungeonSize.LARGE, DungeonStatus.OPEN);
        iceCave = new Dungeon("Ice Cave", DungeonSize.MEDIUM, DungeonStatus.OPEN);
        vampireCastle = new Dungeon("Van Stoker Caste", DungeonSize.EXTRA_LARGE, DungeonStatus.CLOSED);
        pinkDisco = new Dungeon("Pink Disco", DungeonSize.MINI, DungeonStatus.RENOVATING);

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
