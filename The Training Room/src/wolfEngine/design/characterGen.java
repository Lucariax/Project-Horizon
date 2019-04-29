package wolfEngine.design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import gameMain.ImageStorage;
import gameMain.ScreenManager;
import wolfEngine.WildWolfEngine;
import wolfEngine.gameplay.KeyListen;
import wolfEngine.gameplay.MouseListen;

public class characterGen
{
    public String playerName;
    private MouseListen mL;
    private KeyListen kL;
    public characterGen(MouseListen mL, KeyListen kL) {
        this.mL = mL;
        this.kL = kL;
        playerName = "";
    }

    public void run() {
        gameMain.Main.engine.g.setFont(new Font("Descrip", Font.PLAIN, 20));
        gameMain.Main.engine.drawImage(gameMain.Main.engine.screenManage.ims.backgroundCharacterGen);
        gameMain.Main.engine.scrollRead("PLEASE FINISH YOUR APPLICATION.");
        while(kL.getKey() != 10) {
            System.out.println(kL.getKey());
            gameMain.Main.engine.g.setColor(Color.WHITE);
            gameMain.Main.engine.g.drawString(playerName, 500, 500);
            if(kL.getKey() == KeyEvent.VK_BACK_SPACE) {
                if(playerName.length() != 0) {
                    playerName = playerName.substring(0, playerName.length() - 1);
                }
            } else {
                playerName += kL.getKeyChar();
            }
        }
    }
}