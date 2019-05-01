package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

public interface NPCStorage {
    String[] managerPhrases = {"Welcome to Normal Co! I'm your new manager Aaron. Let's get started training on your first day!",
                                "",
                                "",
                                ""
};

String[] customerPhrases = {"I'd like to purchase these, please.",
                                "",
                                "",
                                ""
};

String[] employeePhrases = {"Sell anything good today?",
                                "",
                                "",
                                ""
};
    BufferedImage NPCImage = null;
    DynamicNPC manager = new DynamicNPC("Aaron", managerPhrases, NPCImage);

    // Customers
    DynamicNPC woman1 = new DynamicNPC("Adriana", customerPhrases, NPCImage);
    DynamicNPC woman2 = new DynamicNPC("Julie", customerPhrases, NPCImage);
    DynamicNPC woman3 = new DynamicNPC("Jen", customerPhrases, NPCImage);
    DynamicNPC woman4 = new DynamicNPC("Susanne", customerPhrases, NPCImage);
    DynamicNPC woman5 = new DynamicNPC("Michelle", customerPhrases, NPCImage);

    DynamicNPC man1 = new DynamicNPC("Tom", customerPhrases, NPCImage);
    DynamicNPC man2 = new DynamicNPC("Bob", customerPhrases, NPCImage);
    DynamicNPC man3 = new DynamicNPC("Bill", customerPhrases, NPCImage);
    DynamicNPC man4 = new DynamicNPC("Nick", customerPhrases, NPCImage);
    DynamicNPC man5 = new DynamicNPC("Tyrone", customerPhrases, NPCImage);

    // Associates
    DynamicNPC employeefem1 = new DynamicNPC("Aubrey", employeePhrases, NPCImage);
    DynamicNPC employeefem2 = new DynamicNPC("Emily", employeePhrases, NPCImage);

    DynamicNPC employeeman1 = new DynamicNPC("Alex", employeePhrases, NPCImage);
    DynamicNPC employeeman2 = new DynamicNPC("Will", employeePhrases, NPCImage);
}