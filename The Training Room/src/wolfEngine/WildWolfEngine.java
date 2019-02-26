package wolfEngine;

import java.awt.event.MouseListener;

import wolfEngine.gameplay.KeyListen;
import wolfEngine.gameplay.MouseListen;
import wolfEngine.graphics.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
 public class WildWolfEngine 
{
    public GameGraphics graphics;
    private Graphics g;
    private KeyListen listenerKey;
    public MouseListen listenerMouse;

    public WildWolfEngine() 
    {
        graphics = new GameGraphics(960, 540);
        g = graphics.getGraphics();
        listenerMouse = new MouseListen(graphics);
        listenerKey = new KeyListen(graphics);
        while(true)
        {
            g.setColor(Color.BLACK);
            g.fillRect(listenerMouse.getX(), listenerMouse.getY(), 5, 5);

            if(listenerKey.getKey().equalsIgnoreCase("k"))
            {
                System.out.print("arrrooooo! ");
                listenerKey.resetKey();
            }
        }
    }
}