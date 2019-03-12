package gameMain;

public class RegisterButtonManager
{
    int xStart;
    int xDiff;
    int yStart, yDiff;

    int[] bPX = {xStart, xStart + xDiff, xStart + 2*xDiff, xStart + 3*xDiff, xStart + 4*xDiff, xStart + 5*xDiff, xStart + 6*xDiff, xStart + 7*xDiff, xStart + 8*xDiff};
    int[] bPY = {yStart, yStart + yDiff, yStart + 2*yDiff, yStart + 3*yDiff, xStart + 4*yDiff};


    //Button arrays start from top left and end at bottom right
    String[][] mainRegister = {{"Begin Return","Modify Return","Reprint Last Receipt", "Gift Card Services", "7", "8", "9", "Clear"},
    {"Sign Off", "BLANK", "Reserve Online", "PRICE CHECK", "4", "5", "6", "Enter"},
    {"Rewards Customer", "Tax Exempt Customer", "Retreive Customer Order", "BLANK", "1", "2", "3", "Enter"},
    {"Manager Functions", "BLANK", "Resume/Pay", "Charge", "0", "Quantity", "BLANK", "BLANK"}};

    //String[][] next =
    public String getButton(String currScreen, int kY, int kX) {
        String[][] usedButtonList = null;
        int row = -1;
        int column = -1;
        switch(currScreen) {
            case "Title Screen":
                usedButtonList = null;
            break;

            case "Register-Main":
                usedButtonList = mainRegister;
            break;
        }

        if(bPX[0] <= kX && kX <= bPX[1]) {
            column = 0;
        } else if(bPX[1] < kX && kX <= bPX[2]) {
            column = 1;
        } else if(bPX[2] < kX && kX <= bPX[3]) {
            column = 2;
        } else if(bPX[3] < kX && kX <= bPX[4]) {
            column = 3;
        } else if(bPX[4] < kX && kX <= bPX[5]) {
            column = 4;
        } else if(bPX[5] < kX && kX <= bPX[6]) {
            column = 5;
        } else if(bPX[6] < kX && kX <= bPX[7]) {
            column = 6;
        } else if(bPX[7] < kX && kX <= bPX[8]) {
            column = 7;
        }

        if(bPY[0] <= kX && kX <= bPY[1]) {
            row = 0;
        } else if(bPY[1] < kX && kX <= bPY[2]) {
            row = 1;
        } else if(bPY[2] < kX && kX <= bPY[3]) {
            row = 2;
        } else if(bPY[3] < kX && kX <= bPY[4]) {
            row = 3;
        }
        if(usedButtonList == null) {
            return "No Button Found";
        }
        return usedButtonList[row][column];
    }
}