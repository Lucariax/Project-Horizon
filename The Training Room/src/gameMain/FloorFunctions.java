package gameMain;

import static wolfEngine.WildWolfEngine.graphics;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.image.BufferedImage;
import wolfEngine.gameplay.KeyListen;
import gameMain.ScreenManager;
import wolfEngine.WildWolfEngine;

public class  FloorFunctions {
    public BufferedImage displayedImage;
    public ImageStorage ims = new ImageStorage();
    public ScreenManager screenManager;
    public int collideX;
    public int collideY;
    //store perminitor
    Rectangle r1 = new Rectangle(0, 0, 217, 292);
    //shelfs
    Rectangle r2 = new Rectangle(321, 106, 76, 222);
    Rectangle r3 = new Rectangle(485, 106, 76, 222);
    // Rectangle r4 = new Rectangle(277, 373, 53, 158);
    // Rectangle r5 = new Rectangle(377, 373, 53, 158);

    // Rectangle r6 = new Rectangle(85, 200, 368, 70);

    // Rectangle r7 = new Rectangle(515, 190, 60, 193);
    // Rectangle r8 = new Rectangle(605, 190, 60, 193);
    // Rectangle r9 = new Rectangle(495, 458, 180, 72);
    //character
    
    public Rectangle player = new Rectangle(collideX, collideY);
    // Main.engine.g.setColor(Color.WHITE);
    // Main.engine.g.fillRect(730, 0, 370, 630);
    public Rectangle[] array = new Rectangle[]{ r1, r2, r3};
    public void moveImage(){ 
        int xstartLocation = gameMain.Main.engine.listenerKey.startX;
        int ystartLocation = gameMain.Main.engine.listenerKey.startY;
        int xLocation = xstartLocation + gameMain.Main.engine.listenerKey.xChange;
        int yLocation = ystartLocation + gameMain.Main.engine.listenerKey.yChange;
        collideX = xLocation;
        collideY = yLocation;
        // screenManager.drawFloor();
        ims.setImages();
        displayedImage = ims.mainCharacter;
        Main.engine.drawImage(displayedImage, xLocation, yLocation);
        // Main.engine.g.setColor(Color.GRAY);
        // Main.engine.g.fillRect(collideX, collideY, 100, 50);
         
        
    }

    public static boolean isCollide(Rectangle[] array, Rectangle player){
        for(int i = 0; i < array.length; i++){
            if(array[i].intersects(player)){
                return true;
            }
        }
        
        return false;
    }

    public void removeImage(){
        graphics.clear();
    }
    
}
