package design;

public class World {
	private Level[] world;
	private String worldName;
	public World(String worldName, Level[] world) {
		this.world = world;
		this.worldName = worldName;
	}
	public Level[] getWorld() {
		return world;
	}
	public String getWorldName() {
		return worldName;
	}
}
