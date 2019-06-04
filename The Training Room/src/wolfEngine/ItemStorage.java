package wolfEngine;

public class ItemStorage {
    public Item pencils = new Item("NC 10-PACK PENCILS", 2.99);
    public Item notebook = new Item("NC SPRL NTBK       ", 5.99);
    public Item paper = new Item("NC 1-RM PAPER      ", 10.99);
    public Item ink = new Item("NC INK-CART        ", 62.99);
    public Item candy_bar = new Item("CHOCO CO CHOCO BAR", 3.99);
    public Item water = new Item("POLISH SPRING WATER", 2.99);
    public Item soda = new Item("KOKA KOLA          ", 1.99);
    public Item headphones = new Item("NC HEADPHONES      ", 10.99);

    public Item getRandomItem() {
        int rando = (int)(8*Math.random() + 1);

        switch(rando) {
            case 1:
                return pencils;
            case 2:
                return notebook;
            case 3:
                return paper;
            case 4:
                return ink;
            case 5:
                return candy_bar;
            case 6:
                return water;
            case 7:
                return soda;
            case 8:
                return headphones;
        }
        return null;
    }
}