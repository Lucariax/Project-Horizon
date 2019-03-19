package gameMain;

import wolfEngine.WildWolfEngine;
import wolfEngine.graphics.GameGraphics.DPKeyEventHandler;

public class Main
{
    public static WildWolfEngine engine = new WildWolfEngine();
    static DPKeyEventHandler e;
    
    public static void main(String[] args) 
    {
        engine.runGame();
    }

    public static WildWolfEngine getEngine() {
        return engine;
    }
}