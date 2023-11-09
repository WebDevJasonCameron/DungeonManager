package org.constants.explainer;
import org.constants.enums.DungeonSizeEnum;

public class DungeonSizeExplainer {

    public String explainer(DungeonSizeEnum size){
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
}
