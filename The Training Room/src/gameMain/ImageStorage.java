package gameMain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageStorage {
	public static String baseImageLocation;
	public static String baseImageLocationP;
	public BufferedImage titleScreen = null;
	BufferedImage registerMain = null;
	BufferedImage wildWolfEngine = null;
	BufferedImage nitroviumLogo = null;
	BufferedImage register_signed_in = null;
	BufferedImage registerMain_total = null;

	BufferedImage male_worker= null;
	BufferedImage male_worker_2 = null;
	BufferedImage female_worker= null;
	BufferedImage female_worker_2 = null;
	BufferedImage girl_1 = null;
	BufferedImage girl_2 = null;
	BufferedImage girl_3 = null;
	BufferedImage girl_4 = null;
	BufferedImage girl_5 = null;
	BufferedImage guy_1 = null;
	BufferedImage guy_2 = null;
	BufferedImage guy_3 = null;
	BufferedImage guy_4 = null;
	BufferedImage guy_5 = null;
	BufferedImage manager = null;

	public ImageStorage() {
		baseImageLocation = ".\\The Training Room\\src\\ImageLocation\\";
		baseImageLocationP = ".\\The Training Room\\src\\People\\";
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
			register_signed_in = ImageIO.read(new File(baseImageLocation + "registerMain_signedIn.png"));
		} catch(IOException e) {};

		try
		{
			registerMain_total = ImageIO.read(new File(baseImageLocation + "registerMain_total.png"));
		} catch(IOException e) {};

		// NPC Images
		/*
		try
		{
			male_worker = ImageIO.read(new File(baseImageLocationP + "male_worker.png"));
		} catch(IOException e) {};
		try
		{
			male_worker_2 = ImageIO.read(new File(baseImageLocationP + "male_worker_2.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		try
		{
			register_signed_in = ImageIO.read(new File(baseImageLocationP + "registerMain_signedIn.png"));
		} catch(IOException e) {};
		*/
	}
}
