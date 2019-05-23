package gameMain;

import static wolfEngine.WildWolfEngine.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenManager {
    private String version = "Indev v0.0.2";
    private int x, y;
    public BufferedImage displayedImage;
    private String currentScreen;
    public ImageStorage ims = new ImageStorage();
    private int hasPlayed = 0;

    public ScreenManager(int x, int y) {
        currentScreen = "Title Screen";
        this.x = x;
        this.y = y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void buttonMode(String buttonSwitch) {

    }

    public void drawMain() {
        ims.setImages();
        displayedImage = ims.registerMain;
        graphics.clear();
        graphics.setBackground(Color.BLACK);
        Main.engine.drawImage(displayedImage, 0, 126);
        Main.engine.g.setColor(Color.WHITE);
        Main.engine.g.fillRect(750, 0, 370, 630);
        Main.engine.g.setColor(Color.BLACK);
        
    }

    public void drawFloor(){
        ims.setImages();
        displayedImage = ims.storeFloor;
        graphics.clear();
        graphics.setBackground(Color.BLACK);
        Main.engine.drawImage(displayedImage, 0, 0);
        Main.engine.g.setColor(Color.WHITE);
        Main.engine.g.fillRect(730, 0, 370, 630);
        Main.engine.g.setColor(Color.BLACK);
    }

    public void drawTwoButtons(){
        ims.setImages();
        displayedImage = ims.registerButton;
        graphics.clear();
        graphics.setBackground(Color.BLACK);
        Main.engine.drawImage(displayedImage, 85, 150);
        displayedImage = ims.floorButton;
        Main.engine.drawImage(displayedImage, 620, 150);
        
    }

    public void openingSequence() {
        ims.setImages();
        displayedImage = ims.nitroviumLogo;
        Main.engine.drawImage(displayedImage, 200, 0);
        SoundStorage.nitrovium.play();
        graphics.sleep(2000);

        displayedImage = ims.wildWolfEngine;
        Main.engine.drawImage(displayedImage);
        SoundStorage.wolfHowl.play();
        graphics.sleep(2000);

        displayedImage = ims.titleScreen;
        Main.engine.drawImage(displayedImage);
        Main.engine.g.setFont(new Font("Descrip", Font.PLAIN, 14));
        Main.engine.g.setColor(Color.WHITE);
        Main.engine.g.drawString(version, 20, 610);

        Main.engine.graphics.sleep(1000);
        graphics.clear();
        drawTwoButtons();


    }
}