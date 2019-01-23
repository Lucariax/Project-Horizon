package engine;
import graphics.Texture;
public class Map {
	private Texture[][] mapTexture;
	private Collision[][] mapCollision;
	public Map(int length, int width) {
		mapTexture = new Texture[length][width];
		mapCollision = new Collision[length][width];
	}
	public Texture[][] getMapTexture() {
		return mapTexture;
	}
	public Collision[][] getMapCollision() {
		return mapCollision;
	}
}
