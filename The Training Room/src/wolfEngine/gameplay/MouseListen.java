package wolfEngine.gameplay;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import wolfEngine.graphics.GameGraphics;

public class MouseListen {
    private int x;
    private int y;
    public MouseListen(GameGraphics p)
    {
        x = 0;
        y = 0;
        p.addMouseListener(new MouseListener()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                System.out.println("X: " + x + " Y: " + y);
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

			}
		});
	}

    public int getX()
    {
		return x;
    }
    
    public int getY()
    {
        return y;
    }
}
