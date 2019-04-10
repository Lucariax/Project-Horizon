package gameMain;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;

public class ScreenManager
{
    private String version = "Indev v0.0.1";
    private int x, y;
    public BufferedImage displayedImage;
    private String currentScreen;
    private ImageStorage ims = new ImageStorage();
    private int hasPlayed = 0;
    
    public ScreenManager(int x, int y)
    {
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

    public void buttonMode(String buttonSwitch) {
        
    }

    public void drawMain() {
        ims.setImages();
        displayedImage = ims.registerMain;
        Main.engine.graphics.clear();
        Main.engine.graphics.setBackground(Color.BLACK);
        Main.engine.drawImage(displayedImage, 0, 126);    }

    public void openingSequence() {
        ims.setImages();
        displayedImage = ims.nitroviumLogo;
        Main.engine.drawImage(displayedImage, 200, 0);
        Main.engine.graphics.sleep(5000);
        displayedImage = ims.wildWolfEngine;
        Main.engine.drawImage(displayedImage);
        if(hasPlayed < 1) {
            SoundStorage.wolfHowl.play();
            hasPlayed++;
        }
        Main.engine.graphics.sleep(5000);
        displayedImage = ims.titleScreen;
        Main.engine.drawImage(displayedImage);
        Main.engine.g.setFont(new Font("Descrip", Font.PLAIN, 14));
        Main.engine.g.setColor(Color.WHITE);
        Main.engine.g.drawString(version, 20, 610);
    }
}