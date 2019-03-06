package gameMain;

import java.awt.image.BufferedImage;
public class ScreenManager
{
    private int x, y;
    private BufferedImage displayedImage;
    private String currentScreen;
    public ScreenManager(int x, int y)
    {
        displayedImage = ImageStorage.titleScreen;
        currentScreen = "Title Screen";
        this.x = x;
        this.y = y;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public void setScreen() {
        switch(currentScreen)
        {
            case "Title Screen":
                displayedImage = ImageStorage.titleScreen;
            break;

            case "Register-Main":
                displayedImage = ImageStorage.registerMain;
            break;
        }
    } 
}