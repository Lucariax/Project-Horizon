package gameMain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageStorage {
	public static String baseImageLocation;
	BufferedImage titleScreen = null;
	BufferedImage registerMain = null;
	BufferedImage wildWolfEngine = null;
	BufferedImage nitroviumLogo = null;

	public ImageStorage() {
		baseImageLocation = ".\\The Training Room\\src\\ImageLocation\\";
	}
	
	// All of the variables in here must follow the above format ^

	// ALL IMAGE FILES MUST BE IN THE .PNG FORMAT!
	public void setImages() {
		//System.out.println(registerMain == null);
		try
		{
			registerMain = ImageIO.read(new File(baseImageLocation + "registerMain.png"));
			//System.out.println(registerMain == null);
		} catch(IOException e) {};

		try
		{
			titleScreen = ImageIO.read(new File(baseImageLocation + "titleScreen.png"));
		} catch(IOException e) {};
		//System.out.println(registerMain == null);

		try
		{
			wildWolfEngine = ImageIO.read(new File(baseImageLocation + "wildWolfEngine.png"));
		} catch(IOException e) {};

		try
		{
			nitroviumLogo = ImageIO.read(new File(baseImageLocation + "nitroviumLogo.png"));
		} catch(IOException e) {};
	}
}
