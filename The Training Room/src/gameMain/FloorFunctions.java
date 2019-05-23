package gameMain;

import static wolfEngine.WildWolfEngine.graphics;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.image.BufferedImage;
import wolfEngine.gameplay.KeyListen;

public class  FloorFunctions {
    public KeyListen listenerKey;
    public BufferedImage displayedImage;
    public ImageStorage ims = new ImageStorage();
    
    
    //store perminitor
    Rectangle r1 = new Rectangle(25, 150, 700, 550);
    //shelfs
    Rectangle r2 = new Rectangle(77, 373, 53, 158);
    Rectangle r3 = new Rectangle(177, 373, 53, 158);
    Rectangle r4 = new Rectangle(277, 373, 53, 158);
    Rectangle r5 = new Rectangle(377, 373, 53, 158);

    Rectangle r6 = new Rectangle(85, 200, 368, 70);

    Rectangle r7 = new Rectangle(515, 190, 60, 193);
    Rectangle r8 = new Rectangle(605, 190, 60, 193);
    Rectangle r9 = new Rectangle(495, 458, 180, 72);
    //character
    public Rectangle player; 
    
    
    Rectangle[] array = new Rectangle[]{ r1,r2,r3,r4,r5,r6,r7,r8,r9 };

    public void moveImage(){ 
        ims.setImages();
        displayedImage = ims.mainCharacter;
        Main.engine.drawImage(displayedImage, listenerKey.startX + listenerKey.xChange, listenerKey.startY + listenerKey.yChange);
    }

    public static boolean isCollide(Rectangle[] array, Rectangle player){
        for(int i = 0; i < array.length; i++){
            if(array[i].intersects(player)){
                return true;
            }
        }
        
        return false;
    }
    
}
