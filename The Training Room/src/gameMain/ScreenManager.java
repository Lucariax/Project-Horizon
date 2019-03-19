package gameMain;

import java.awt.Color;
import java.awt.image.BufferedImage;

import wolfEngine.WildWolfEngine;
public class ScreenManager
{
    private int x, y;
    private WildWolfEngine engine;
    public BufferedImage displayedImage;
    private String currentScreen;
    private ImageStorage ims = new ImageStorage();
    public static String baseImageLocation = ".\\The Training Room\\src\\ImageLocation\\";
    
    public ScreenManager(int x, int y)
    {
        engine = Main.getEngine();
        currentScreen = "Title Screen";
        this.x = x;
        this.y = y;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public void setScreen(boolean enterPressed, String buttonSwitch) {
        ims.setImages();
        switch(buttonSwitch)
        {
            case "Title Screen":
            if(enterPressed) {
                buttonSwitch = "Register-Main";
            }
                displayedImage = ims.titleScreen;
            break;

            case "Register-Main":
                displayedImage = ims.registerMain;
            break;
        }
        System.out.println(displayedImage == null);
        //engine.drawImage(ims.registerMain);
    }
}