package wolfEngine.gameplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import wolfEngine.graphics.GameGraphics;

public class KeyListen {
    private String key;
    public KeyListen(GameGraphics p)
    {
        key = "";
        p.addKeyListener(new KeyListener(){
        
            @Override
            public void keyTyped(KeyEvent e) {
                
            }
        
            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                key = "" + e.getKeyChar();
            }
        });
    }

    public String getKey() {
        return key;
    }
    
    public void resetKey() {
        key ="";
    }
}
