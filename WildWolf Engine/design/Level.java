package design;

import engine.Map;

public class Level {
	private Map[] level;
	private String levelName;
	public Level(String levelName, Map[] level) {
		this.level = level;
		this.levelName = levelName;
	}
	public Map[] getLevel() {
		return level;
	}
	public String getLevelName() {
		return levelName;
	}
}
