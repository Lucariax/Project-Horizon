package gameMain;

import static wolfEngine.WildWolfEngine.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import wolfEngine.Item;
import wolfEngine.artificialIntelligence.DynamicNPC;
import wolfEngine.artificialIntelligence.NPCStorage;

public class ScreenManager {
    private String version = "v1.0.0";
    public int x, y;
    public BufferedImage displayedImage;
    public String currentScreen;
    public ImageStorage ims = new ImageStorage();
    public RegisterButtonManager rbm = new RegisterButtonManager();
    public ArrayList<Item> checkout;
    public DynamicNPC currNPC;
    public NPCStorage nps = new NPCStorage();

    public ScreenManager(int x, int y) { 
        checkout = new ArrayList<Item>();
        currentScreen = "Locked";
        this.x = x;
        this.y = y;
        currNPC = nps.pickCustomer();
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void buttonMode() {
        rbm.getButton(currentScreen, y, x);
        currentScreen = rbm.switchToScreen();
        drawImage(currentScreen);
    }

    public void drawImage(String screen) {
        switch(screen) {
            case "Sign-In":
                displayedImage = ims.register_signed_in;
                Main.engine.drawImage(displayedImage, 0, 126);
                rbm.reset();
                Main.engine.listenerMouse.reset();
            break;
            
            case "Register-Main":
                displayedImage = ims.register_signed_in;
                Main.engine.drawImage(displayedImage, 0, 126);
                rbm.reset();
                Main.engine.listenerMouse.reset();
            break;

            case "Locked":
                displayedImage = ims.registerMain;
                Main.engine.drawImage(displayedImage, 0, 126);
                rbm.reset();
                Main.engine.listenerMouse.reset();
            break;

            case "PayTime":
                displayedImage = ims.registerMain_total;
                Main.engine.drawImage(displayedImage, 0, 126);
                rbm.reset();
                Main.engine.listenerMouse.reset();
            break;
        }
    }

    public void drawMain() {
        ims.setImages();
        displayedImage = ims.registerMain;
        graphics.clear();
        graphics.setBackground(Color.BLACK);
        Main.engine.drawImage(displayedImage, 0, 126);
        Main.engine.g.setColor(Color.WHITE);
        Main.engine.g.fillRect(750, 0, 370, 630);
        Main.engine.g.setColor(Color.GRAY);
        Main.engine.g.fillRect(750, 400, 370, 230);
        Main.engine.g.setColor(Color.BLACK);
        Main.engine.g.setFont(new Font("Def", Font.BOLD, 50));
        Main.engine.g.drawString("SCAN", 860, 540);
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
    }

    public void manageItems() {

    }

    public void newNPC() {
        currNPC = nps.pickCustomer();
    }
}