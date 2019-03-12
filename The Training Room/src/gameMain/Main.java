package gameMain;

import wolfEngine.WildWolfEngine;
import wolfEngine.graphics.GameGraphics.DPKeyEventHandler;

public class Main
{
    public static WildWolfEngine engine;
    static DPKeyEventHandler e;
    private static boolean isStarted;
    public static void main(String[] args) 
    {
        isStarted = false;
        engine = new WildWolfEngine();
        while(true) {
            if(engine.listenerKey.getKey().equalsIgnoreCase("enter")) {
                isStarted = true;
            }
            ScreenManager.setScreen(isStarted, "");
        }
    }
}