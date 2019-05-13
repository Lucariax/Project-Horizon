package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import wolfEngine.Item;
import wolfEngine.ItemStorage;

public class DynamicNPC extends NPC {
	private ArrayList<Item> basket;
	private ItemStorage itemStore;

	public DynamicNPC(String name, String[] phrases, BufferedImage NPCImage) {
		super(name, phrases, NPCImage);
		itemStore = new ItemStorage();
		basket = new ArrayList<Item>();
		for(int i = 0; i < (int)(5*Math.random() + 3); i++) {
			basket.add(itemStore.getRandomItem());
		}
	}

	public ArrayList<Item> getBasket() {
		return basket;
	}

	public Item removeItem(int pos) {
		return basket.remove(pos);
	}

	public int getBasketSize() {
		return basket.size();
	}
}
