import org.constants.DungeonSize;
import org.constants.DungeonStatus;
import org.models.Dungeon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse = new Dungeon("Smash House", DungeonSize.LARGE, DungeonStatus.OPEN);
        Dungeon iceCave = new Dungeon("Ice Cave", DungeonSize.MEDIUM, DungeonStatus.OPEN);
        Dungeon vampireCastle = new Dungeon("Van Stoker Caste", DungeonSize.EXTRA_LARGE, DungeonStatus.CLOSED);
        Dungeon pinkDisco = new Dungeon("Pink Disco", DungeonSize.MINI, DungeonStatus.RENOVATING);

        Collection<Dungeon> dungeons = new ArrayList<>(Arrays.asList(smashHouse,iceCave,vampireCastle, pinkDisco));

        for(Dungeon dungeon : dungeons){
            if(dungeon.isOpen()){
                System.out.println(dungeon.getName());
                System.out.println(dungeon.getSize());
                System.out.println(dungeon.getStatus());
                System.out.println("\n--------------\n");
            }


        }


    }
}
