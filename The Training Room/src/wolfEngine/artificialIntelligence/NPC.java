package wolfEngine.artificialIntelligence;

import java.awt.image.BufferedImage;

public abstract class NPC {
	public String[] phrases;
	public BufferedImage NPCImage;
	public String name;
	
	public NPC(String name, String[] phrases, BufferedImage NPCImage) {
		this.name = name;
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
