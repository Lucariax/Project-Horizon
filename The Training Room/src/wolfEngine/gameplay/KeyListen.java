package wolfEngine.gameplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static wolfEngine.WildWolfEngine.graphics;
import wolfEngine.graphics.GameGraphics;
import gameMain.ScreenManager;

public class KeyListen {
    private int key;
    private char keyChar;
    public int xChange;
    public int yChange;
    public static int startX = 80;
    public static int startY = 300;
    public ScreenManager screenManage;
    public KeyListen(GameGraphics p)
    {
        key = 0;
        keyChar = ' ';
        p.addKeyListener(new KeyListener(){
         
            @Override
            public void keyTyped(KeyEvent e) {
                
            }
        
            @Override
            public void keyReleased(KeyEvent e) {
                key = e.getKeyCode();
                // if(key == KeyEvent.VK_W){
                //     xChange = 0;
                // }

                // if(key == KeyEvent.VK_S){
                //     xChange = 0;
                // }

                // if(key == KeyEvent.VK_D){
                //     yChange = 0;
                // }

                // if(key == KeyEvent.VK_A){
                //     yChange =   0;
                // }

                // if(key == KeyEvent.VK_UP){
                //     xChange = 0;
                // }

                // if(key == KeyEvent.VK_DOWN){
                //     xChange = 0;
                // }

                // if(key == KeyEvent.VK_RIGHT){
                //     yChange = 0;
                // }

                // if(key == KeyEvent.VK_LEFT){
                //     yChange =   0;
                // }
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                key = e.getKeyCode();
                keyChar = e.getKeyChar();
                if(key == KeyEvent.VK_D){ 
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    xChange += 10;
                }

                if(key == KeyEvent.VK_A){        
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    xChange -= 10;
                }

                if(key == KeyEvent.VK_S){
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    yChange += 10;
                }

                if(key == KeyEvent.VK_W){
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    yChange -= 10;
                }
            }

            public void keyHold(KeyEvent e) {
                key = e.getKeyCode();
                keyChar = e.getKeyChar();
                if(key == KeyEvent.VK_D){ 
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    xChange += 10;
                }

                if(key == KeyEvent.VK_A){               
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    xChange -= 10;
                }

                if(key == KeyEvent.VK_S){  
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    yChange += 10;
                }

                if(key == KeyEvent.VK_W){  
                    screenManage.drawFloor();
                    graphics.sleep(1000);
                    yChange -= 10;
                }
            }
        });
    }

    public int getKey() {
        return key;
    }
    
    public void resetKey() {
        key = 0;
    }

    public char getKeyChar() {
        return keyChar;
    }
}