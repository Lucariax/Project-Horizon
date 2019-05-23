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

import gameMain.ScreenManager;

public class WildWolfEngine 
{
    public static GameGraphics graphics;
    public Graphics g;
    public KeyListen listenerKey;
    public MouseListen listenerMouse;
    public ScreenManager screenManage;

    private int runOnce = 0, enterPress = 0, managerRun = 0, hasRead = 0;

    public WildWolfEngine() 
    {
        screenManage = new ScreenManager(0, 0);
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
                graphics.sleep(1000);
                scrollRead(NPCStorage.managerPhrases[1]);
                while(!screenManage.rbm.getButton(screenManage.currentScreen, screenManage.y, screenManage.x).equals("Sign On")) {
                    screenManage.setX(listenerMouse.getX());
                    screenManage.setY(listenerMouse.getY());
                }
                drawItemStrings();
                scrollRead(NPCStorage.managerPhrases[2]);
            }

            if(750 < listenerMouse.getX() && listenerMouse.getX() < 1120 && 400 < listenerMouse.getY() && listenerMouse.getY() < 630) {
                g.setColor(Color.WHITE);
                g.fillRect(750, 0, 370, 400);
                if(!screenManage.currNPC.getBasket().isEmpty()) {
                    screenManage.checkout.add(screenManage.currNPC.removeItem(0));
                }
                listenerMouse.reset();
                drawItemStrings();
            }
            if(screenManage.currentScreen.equals("PayTime") && enterPress == 1) {
                drawItemStrings();
                enterPress++;
            }

            if(managerRun != 0 && hasRead == 0) {
                scrollRead(screenManage.nps.customerPhrases[(int)(Math.random()*3)]);
                hasRead++;
            }

            if(screenManage.rbm.getButtonName().equals("CAT")) {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Descrip", Font.PLAIN, 20));
                g.drawString("Processing card payment...", 760, 200);
                graphics.sleep(200);
                screenManage.checkout.clear();
                g.drawString("Reciept printed. Customer has left.", 760, 250);
                graphics.sleep(200);
                screenManage.currNPC = screenManage.nps.pickCustomer();
                screenManage.drawImage("Register-Main");
                enterPress = 1;
                managerRun++;
                screenManage.currentScreen = "Register-Main";
                screenManage.buttonMode();
                hasRead = 0;
                drawItemStrings();
            } else if(screenManage.rbm.getButtonName().equals("Cash")) {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Descrip", Font.PLAIN, 20));
                g.drawString("Processing cash payment...", 760, 200);
                graphics.sleep(200);
                g.drawString("Reciept printed. Customer has left.", 760, 250);
                graphics.sleep(200);
                screenManage.checkout.clear();
                screenManage.currNPC = screenManage.nps.pickCustomer();
                screenManage.drawImage("Register-Main");
                enterPress = 1;
                managerRun++;
                screenManage.currentScreen = "Register-Main";
                screenManage.buttonMode();
                hasRead = 0;
                drawItemStrings();
            } else if(screenManage.rbm.getButtonName().equals("Check")) {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Descrip", Font.PLAIN, 20));
                g.drawString("Processing check payment...", 760, 200);
                graphics.sleep(200);
                g.drawString("Reciept printed. Customer has left.", 760, 250);
                graphics.sleep(200);
                screenManage.checkout.clear();
                screenManage.currNPC = screenManage.nps.pickCustomer();
                screenManage.drawImage("Register-Main");
                enterPress = 1;
                managerRun++;
                screenManage.currentScreen = "Register-Main";
                screenManage.buttonMode();
                hasRead = 0;
                drawItemStrings();
            }

            screenManage.setX(listenerMouse.getX());
            screenManage.setY(listenerMouse.getY());
            screenManage.buttonMode();
        }
    }
    public void drawItemStrings() {
        int startX = 760;
        int startY = 50;
        g.setColor(Color.BLACK);
        g.setFont(new Font("Descrip", Font.PLAIN, 20));
        for(int i = 0; i < screenManage.currNPC.getBasketSize(); i++) {
            g.drawString(screenManage.currNPC.getBasket().get(i).getName(), startX, (startY + i*25));
        }
        startX = 313;
        startY = 184;
        g.setColor(Color.BLACK);
        g.setFont(new Font("Descrip", Font.PLAIN, 10));
        for(int i = 0; i < screenManage.checkout.size(); i++) {
            g.drawString(screenManage.checkout.get(i).getName() + "                  " + screenManage.checkout.get(i).getPrice(), startX, (startY + i*12));
        }
        double total = 0;
        for(int i = 0; i < screenManage.checkout.size(); i++) {
            total += screenManage.checkout.get(i).getPrice();
        }
        g.setColor(new Color(157, 157, 157));
        g.fillRect(633, 357, 50, 16);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Descrip", Font.PLAIN, 14));
        g.drawString(String.format("%.2f", total) + "", 645, 368);
    }

    public void scrollRead(String n) {
        int startX = 105;
        int startY = 25;
        String[] newN = n.split(" ");
        g.setFont(new Font("Descrip", Font.PLAIN, 20));
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 605, 130);
        g.setColor(Color.WHITE);

        for(String s: newN) {
            if(!newN[newN.length - 1].equalsIgnoreCase(s)) {
                s += " ";
            }
            if(startX >= 500) {
                startX = 105;
                startY += 25;
            }
            for(char t: s.toCharArray()) {
                g.drawString(t + "", startX, startY);
                startX += getCharLength(t);
                graphics.sleep(20);
            }
        }
    }

    private int getCharLength(char d) {
        switch(d) {
            case 'a': case 'b': case 'c': case 'd':   case 'g': case 'h':   case 'k': case 'o': case 'e': case 'u': case 'v': case 'q': case 'p':  case 's': case 'z':
                return 13;
             case 't': case 'f':
                return 8;
            case 'w': case 'x': case 'y': case 'n':
                return 15;
            case 'l': case 'i': case 'j':
                return 6;
            case 'm':
                return 17;
            case 'r':
                return 10;






             case 'B':  case 'D':  case 'F':    case 'J': 
                return 12;

            case 'L':  case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'U': case 'V': case 'E': case 'H': case 'C': case 'K': case 'A': case 'Z': case 'G':
                return 15;
            case 'W': case 'X': case 'Y':  case 'M': case 'N':
                return 20;
            case 'I':
                return 7;
        }
        return 5;
    }
}