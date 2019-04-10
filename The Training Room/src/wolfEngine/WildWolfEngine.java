package wolfEngine;

import wolfEngine.artificialIntelligence.NPCStorage;
import wolfEngine.gameplay.KeyListen;
import wolfEngine.gameplay.MouseListen;
import wolfEngine.graphics.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import gameMain.ScreenManager;

public class WildWolfEngine 
{
    private static boolean isStarted;
    public static GameGraphics graphics;
    public Graphics g;
    public KeyListen listenerKey;
    public MouseListen listenerMouse;
    private ScreenManager screenManage;

    private int runOnce = 0, enterPress = 0;

    public WildWolfEngine() 
    {
        screenManage = new ScreenManager(0, 0);
        isStarted = false;
        graphics = new GameGraphics(1120, 630);
        graphics.setBackground(Color.BLACK);
        g = graphics.getGraphics();
        listenerMouse = new MouseListen(graphics);
        listenerKey = new KeyListen(graphics);
    }
    public void drawImage(BufferedImage image) {
        g.drawImage(image, 0, 0, null);
    }

    public void drawImage(BufferedImage image, int x, int y) {
        g.drawImage(image, x, y, null);
    }
    public void runGame() {
        while(true)
        {
            System.out.println(listenerKey.getKey());
            if(runOnce < 1) {
                runOnce++;
                screenManage.openingSequence();
            
            }  
            if(listenerKey.getKey() == KeyEvent.VK_ENTER && enterPress == 0)
            {
                screenManage.drawMain();
                enterPress++;
                graphics.sleep(200);
                scrollRead(NPCStorage.managerPhrases[0]);
            }
            if(enterPress > 0) {
                screenManage.buttonMode("");
            }
        } 
    }

    public void scrollRead(String n) {
        int startX = 105;
        int startY = 25;
        g.setFont(new Font("Descrip", Font.PLAIN, 20));
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 520, 100);
        g.setColor(Color.WHITE);
        for(int i = 0; i < n.length() - 1; i++) {
            String newWord = n.substring(i, n.indexOf(" "));
            int wordLength = 0;
            for(int j = 0; j < newWord.length(); j++) {
                getCharLength(newWord.substring(j, j + 1));
            }
            if(wordLength + startX >= 500 ) {
                startX += 500 - startX;
            }
            g.drawString(n.substring(i, i + 1), startX, startY);
            startX += getCharLength(n.substring(i, i + 1));
            graphics.sleep(50);
            if(startX >= 500) {
                startX = 105;
                startY += 25;
            }
        }
    }

    private int getCharLength(String d) {
        switch(d) {
            case "a": case "b": case "c": case "d":   case "g": case "h":   case "k": case "o": case "e": case "u": case "v": case "q": case "p":  case "s": case "z":
                return 13;
             case "t": case "f":
                return 8;
            case "w": case "x": case "y":    case "n":
                return 15;
            case "l": case "i": case "j":
                return 6;
            case "m":
                return 17;
            case "r":
                return 10;






             case "B":  case "D":  case "F":    case "J": 
                return 12;

            case "L":  case "O": case "P": case "Q": case "R": case "S": case "T": case "U": case "V": case "E": case "H": case "C": case "K": case "A": case "Z": case "G":
                return 15;
            case "W": case "X": case "Y":  case "M": case "N":
                return 20;
            case "I":
                return 7;
        }
        return 5;
    }
}