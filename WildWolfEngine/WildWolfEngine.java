import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import graphics.GameGraphics;

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
    }
}