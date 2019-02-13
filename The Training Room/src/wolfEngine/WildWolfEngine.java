package wolfEngine;

import java.awt.event.MouseListener;

import wolfEngine.graphics.*;

import java.awt.event.KeyListener;

public class WildWolfEngine 
{
    public GameGraphics graphics;
    private KeyListener listenerKey;
    private MouseListener listenerMouse;

    public WildWolfEngine() 
    {
        graphics = new GameGraphics(960, 540);
        graphics.addKeyListener(listenerKey);
        graphics.addMouseListener(listenerMouse);
        
        if(graphics.onKeyDown(e);)
    }
}