package artificialIntelligence;

public abstract class NPC {
	private String name;
	
	public NPC(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
