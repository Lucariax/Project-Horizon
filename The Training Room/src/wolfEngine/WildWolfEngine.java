package wolfEngine;

import wolfEngine.gameplay.KeyListen;
import wolfEngine.gameplay.MouseListen;
import wolfEngine.graphics.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import gameMain.ScreenManager;

public class WildWolfEngine 
{
    private static boolean isStarted;
    public GameGraphics graphics;
    public Graphics g;
    public KeyListen listenerKey;
    public MouseListen listenerMouse;
    private ScreenManager screenManage;

    public WildWolfEngine() 
    {
        screenManage = new ScreenManager(0, 0);
        isStarted = false;
        graphics = new GameGraphics(960, 540);
        g = graphics.getGraphics();
        listenerMouse = new MouseListen(graphics);
        listenerKey = new KeyListen(graphics);
    }
    public void drawImage(BufferedImage image) {
        g.drawImage(image, 0, 0, null);
    }
    public void runGame() {
        while(true)
        {
                if(listenerKey.getKey().equalsIgnoreCase("enter")) {
                    isStarted = true;
                    System.out.print("yup");
                }   
                screenManage.setScreen(isStarted, "");
            //g.setColor(Color.BLACK);
            //g.fillRect(listenerMouse.getX(), listenerMouse.getY(), 5, 5);

            if(listenerKey.getKey().equalsIgnoreCase("k"))
            {
                System.out.print("arrrooooo! ");
                listenerKey.resetKey();
            }
        }
    }
}