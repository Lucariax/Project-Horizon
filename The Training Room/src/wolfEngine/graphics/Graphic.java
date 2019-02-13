package wolfEngine.graphics;

import java.awt.image.BufferedImage;

public abstract class Graphic {
	private String name;
	private BufferedImage image;
	public Graphic(String name, BufferedImage image) {
		this.name = name;
		this.image = image;
	}
	
	public String getName() {
		return name;
	}
	public BufferedImage getImage() {
		return image;
	}
}
