import org.models.Dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Dungeon smashHouse = new Dungeon("Smash House", "large", "open");
        Dungeon iceCave = new Dungeon("Ice Cave", "medium", "open");
        Dungeon vampireCastle = new Dungeon("Van Stoker Caste", "extra large", "closed");
        Dungeon pinkDisco = new Dungeon("Pink Disco", "tiny", "maintenance");

        Collection<Dungeon> dungeons = new ArrayList<>(Arrays.asList(smashHouse,iceCave,vampireCastle, pinkDisco));



    }
}
