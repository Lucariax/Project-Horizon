package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

public interface NPCStorage {
    String[] managerPhrases = {"Welcome to Normal Co! I'm your new manager Aaron. Let's get started training on your first day!",
                                "",
                                "",
                                ""
};
    BufferedImage NPCImage = null;
    DynamicNPC manager = new DynamicNPC("Aaron", managerPhrases, NPCImage);
}