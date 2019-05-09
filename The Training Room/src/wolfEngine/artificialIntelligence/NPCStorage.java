package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

public class NPCStorage {
    static public String[] managerPhrases = {"Welcome to Normal Co! I'm your new manager Aaron. Let's get started training on your first day!",
                                "Hit the \"Sign On\" button to get started.",
                                "Now that you've signed on, let's scan an item. Click the scan button on the bottom right side of your screen.",
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
    StaticNPC employeefem1 = new StaticNPC("Aubrey", employeePhrases, NPCImage);
    StaticNPC employeefem2 = new StaticNPC("Emily", employeePhrases, NPCImage);

    StaticNPC employeeman1 = new StaticNPC("Alex", employeePhrases, NPCImage);
    StaticNPC employeeman2 = new StaticNPC("Will", employeePhrases, NPCImage);

    public DynamicNPC pickCustomer() {
        int rando = (int)(10*Math.random() + 1);

        switch(rando) {
            case 1:
                return woman1;
            case 2:
                return man1;
            case 3:
                return woman2;
            case 4:
                return man2;
            case 5:
                return woman3;
            case 6:
                return man3;
            case 7:
                return woman4;
            case 8:
                return man4;
            case 9:
                return woman5;
            case 10:
                return man5;
        }
        return null;
    }
}