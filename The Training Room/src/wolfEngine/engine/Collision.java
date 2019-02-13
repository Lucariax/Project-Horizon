package wolfEngine.engine;

import java.awt.Rectangle;

public class Collision {
	private Rectangle collisionBox;
	public Collision(int x, int y, int width, int height) {
		collisionBox = new Rectangle(x, y, width, height);
	}
	public boolean isCollided(Collision collision) {
		return collisionBox.intersects(collision.getCollisionRectangle());
	}
	public Rectangle getCollisionRectangle() {
		return collisionBox;
	}
}
