package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

public class DynamicNPC extends NPC {
	public String[] phrases;
	public BufferedImage NPCImage;
	public DynamicNPC(String name, String[] phrases, BufferedImage NPCImage) {
		super(name);
		this.phrases = phrases;
		this.NPCImage = NPCImage;
	}

	public String getPhrase(int pos) {
		return phrases[pos];
	}

	public BufferedImage getNPCImage() {
		return NPCImage;
	}
}
