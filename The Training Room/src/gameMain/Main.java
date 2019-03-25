package gameMain;

import wolfEngine.WildWolfEngine;
import wolfEngine.graphics.GameGraphics.DPKeyEventHandler;

public class Main
{
    public static WildWolfEngine engine;
    static DPKeyEventHandler e;
    
    public static void main(String[] args) 
    {
        engine = new WildWolfEngine();
        engine.runGame();
    }

    public static WildWolfEngine getEngine() {
        return engine;
    }
}