package wolfEngine.artificialIntelligence;

public class StaticNPC extends NPC{
	
	private String phrase;
	public StaticNPC(String name, String phrase) {
		super(name);
		this.phrase = phrase;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
}