package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

import gameMain.ImageStorage;

public class NPCStorage {
    public DynamicNPC woman1, woman2, woman3, woman4, woman5, man1, man2, man3, man4, man5;
    public DynamicNPC manager;
    static public String[] managerPhrases = {"Welcome to Normal Co! I'm your new manager Aaron. Let's get started training on your first day!",
        "Hit the \"Sign On\" button to get started.",
        "Now that you've signed on, let's scan an item. Click the scan button on the bottom right side of your screen. Be sure to hit total when you're done.",
        "I'm paying with card. Hit \'CAT\'"
    };

    static public String[] customerPhrases = {"I'd like to purchase these, please.",
        "I'm buying these items.",
        "Can you ring me out for these?",
    };

    String[] employeePhrases = {"Sell anything good today?",
        "",
        "",
        ""
    };

    ImageStorage ims;
    
    public NPCStorage() {
        ims = new ImageStorage();
        // Customers
        manager = new DynamicNPC("Aaron", managerPhrases, ims.manager);
        woman1 = new DynamicNPC("Adriana", customerPhrases, ims.girl_1);
        woman2 = new DynamicNPC("Julie", customerPhrases, ims.girl_2);
        woman3 = new DynamicNPC("Jen", customerPhrases, ims.girl_3);
        woman4 = new DynamicNPC("Susanne", customerPhrases, ims.girl_4);
        woman5 = new DynamicNPC("Michelle", customerPhrases, ims.girl_5);

        man1 = new DynamicNPC("Tom", customerPhrases, ims.guy_1);
        man2 = new DynamicNPC("Bob", customerPhrases, ims.guy_2);
        man3 = new DynamicNPC("Bill", customerPhrases, ims.guy_3);
        man4 = new DynamicNPC("Nick", customerPhrases, ims.guy_4);
        man5 = new DynamicNPC("Tyrone", customerPhrases, ims.guy_5);

        // Associates
        StaticNPC employeefem1 = new StaticNPC("Aubrey", employeePhrases, ims.female_worker);
        StaticNPC employeefem2 = new StaticNPC("Emily", employeePhrases, ims.female_worker_2);

        StaticNPC employeeman1 = new StaticNPC("Alex", employeePhrases, ims.male_worker);
        StaticNPC employeeman2 = new StaticNPC("Will", employeePhrases, ims.male_worker_2);

    }
    
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