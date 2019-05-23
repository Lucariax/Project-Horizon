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
	BufferedImage storeFloor = null;
	BufferedImage mainCharacter = null;
	BufferedImage floorButton = null;
	BufferedImage registerButton = null;
	public BufferedImage backgroundCharacterGen = null;

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

		try
		{
			storeFloor = ImageIO.read(new File(baseImageLocation + "Supermarket layout.png"));
		} catch(IOException e) {};

		try
		{
			mainCharacter = ImageIO.read(new File(baseImageLocation + "mainCharacter.png"));
		} catch(IOException e) {};

		try
		{
			floorButton = ImageIO.read(new File(baseImageLocation + "Floor Button.png"));
		} catch(IOException e) {};

		try
		{
			registerButton = ImageIO.read(new File(baseImageLocation + "Register Button.png"));
		} catch(IOException e) {};

		try
		{
			backgroundCharacterGen = ImageIO.read(new File(baseImageLocation + "backgroundCharacterGen.png"));
		} catch(IOException e) {};
	}
}
