package wolfEngine.gameplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import wolfEngine.graphics.GameGraphics;

public class KeyListen {
    private int key;
    private char keyChar;
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
                
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                key = e.getKeyCode();
                keyChar = e.getKeyChar();
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
