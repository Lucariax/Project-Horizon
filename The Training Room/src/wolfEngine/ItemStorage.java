package wolfEngine;

public class ItemStorage {
    public Item pencils = new Item("NC 10-PACK PENCILS", 2.99);
    public Item notebook = new Item("NC SPRL NTBK", 5.99);
    public Item paper = new Item("NC 1-RM PAPER", 10.99);
    public Item ink = new Item("NC INK-CART", 62.99);

    public Item getRandomItem() {
        int rando = (int)(4*Math.random() + 1);

        switch(rando) {
            case 1:
                return pencils;
            case 2:
                return notebook;
            case 3:
                return notebook;
            case 4:
                return notebook;
        }
        return null;
    }
}