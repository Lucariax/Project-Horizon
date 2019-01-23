package engine;

import graphics.Sprite;

public class Character {
	private Sprite character;
	private String name;
	public Character(Sprite character) {
		name = character.getName();
		this.character = character;
	}
	public String getName() {
		return name;
	}
	public Sprite getSprite() {
		return character;
	}
}
