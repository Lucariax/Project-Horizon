package gameMain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageStorage {
	public static String baseImageLocation;
	public static String baseImageLocationP;
	public BufferedImage titleScreen = null;
	public BufferedImage registerMain = null;
	public BufferedImage wildWolfEngine = null;
	public BufferedImage nitroviumLogo = null;
	public BufferedImage register_signed_in = null;
	public BufferedImage registerMain_total = null;

	public BufferedImage male_worker= null;
	public BufferedImage male_worker_2 = null;
	public BufferedImage female_worker= null;
	public BufferedImage female_worker_2 = null;
	public BufferedImage girl_1 = null;
	public BufferedImage girl_2 = null;
	public BufferedImage girl_3 = null;
	public BufferedImage girl_4 = null;
	public BufferedImage girl_5 = null;
	public BufferedImage guy_1 = null;
	public BufferedImage guy_2 = null;
	public BufferedImage guy_3 = null;
	public BufferedImage guy_4 = null;
	public BufferedImage guy_5 = null;
	public BufferedImage manager = null;

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
			manager = ImageIO.read(new File(baseImageLocationP + "manager_still.png"));
		} catch(IOException e) {};
		try
		{
			guy_1 = ImageIO.read(new File(baseImageLocationP + "guy_1.png"));
		} catch(IOException e) {};
		try
		{
			guy_2 = ImageIO.read(new File(baseImageLocationP + "guy_2.png"));
		} catch(IOException e) {};
		try
		{
			guy_3 = ImageIO.read(new File(baseImageLocationP + "guy_3.png"));
		} catch(IOException e) {};
		try
		{
			guy_4 = ImageIO.read(new File(baseImageLocationP + "guy_4.png"));
		} catch(IOException e) {};
		try
		{
			guy_5 = ImageIO.read(new File(baseImageLocationP + "guy_5.png"));
		} catch(IOException e) {};
		try
		{
			girl_1 = ImageIO.read(new File(baseImageLocationP + "girl_1.png"));
		} catch(IOException e) {};
		try
		{
			girl_2 = ImageIO.read(new File(baseImageLocationP + "girl_2.png"));
		} catch(IOException e) {};
		try
		{
			girl_3 = ImageIO.read(new File(baseImageLocationP + "girl_3.png"));
		} catch(IOException e) {};
		try
		{
			girl_4 = ImageIO.read(new File(baseImageLocationP + "girl_4.png"));
		} catch(IOException e) {};
		try
		{
			girl_5 = ImageIO.read(new File(baseImageLocationP + "girl_5.png"));
		} catch(IOException e) {};
		try
		{
			female_worker = ImageIO.read(new File(baseImageLocationP + "female_worker.png"));
		} catch(IOException e) {};
		try
		{
			female_worker_2 = ImageIO.read(new File(baseImageLocationP + "female_worker_2.png"));
		} catch(IOException e) {};
	}
}
