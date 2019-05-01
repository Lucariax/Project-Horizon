package gameMain;

import static wolfEngine.WildWolfEngine.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;

public class ScreenManager {
    private String version = "Indev v1.0.0";
    private int x, y;
    public BufferedImage displayedImage;
    private String currentScreen;
    public ImageStorage ims = new ImageStorage();
    private int hasPlayed = 0;
    public RegisterButtonManager rbm = new RegisterButtonManager();

    public ScreenManager(int x, int y) {
        currentScreen = "Locked";
        this.x = x;
        this.y = y;
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
        if(screen.equals("Sign-In")) {
            displayedImage = ims.register_signed_in;
            Main.engine.drawImage(displayedImage, 0, 126);
            rbm.reset();
            Main.engine.listenerMouse.reset();
        } else if(screen.equals("Register-Main")) {
            displayedImage = ims.register_signed_in;
            Main.engine.drawImage(displayedImage, 0, 126);
            rbm.reset();
            Main.engine.listenerMouse.reset();
        } else if(screen.equals("Locked")) {
            displayedImage = ims.registerMain;
            Main.engine.drawImage(displayedImage, 0, 126);
            rbm.reset();
            Main.engine.listenerMouse.reset();
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
        Main.engine.g.setColor(Color.BLACK);
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
}