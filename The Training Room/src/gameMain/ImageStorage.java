package gameMain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public interface ImageStorage {
	public static final String baseImageLocation = ".//ImageLocation//";
	// All of the variables in here must follow the above format ^

	// ALL IMAGE FILES MUST BE IN THE .PNG FORMAT!
	BufferedImage titleScreen = null;
	File titleScreenLocation = new File(baseImageLocation + "titleScreen.png") {{
	try
	{
		ImageIO.read(titleScreenLocation);
	} catch(IOException e) {}
	}};

	BufferedImage registerMain = null;
	File registerMainLocation = new File(baseImageLocation + "registerMain.png") {{
	try
	{
		ImageIO.read(registerMainLocation);
	} catch(IOException e) {}
	}};
}
