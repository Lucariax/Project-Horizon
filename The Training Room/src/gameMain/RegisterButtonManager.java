package gameMain;

public class RegisterButtonManager
{
    int xStart = 8;
    int xDiff = 84;
    int yStart = 379;
    int yDiff = 61;
    int column = 7;
    int row = 3;
    String[][] usedButtonList = null;
    String currentScreen;

    int[] bPX = {xStart, xStart + xDiff, xStart + 2*xDiff, xStart + 3*xDiff, xStart + 4*xDiff, xStart + 5*xDiff, xStart + 6*xDiff, xStart + 7*xDiff, xStart + 8*xDiff};
    int[] bPY = {yStart, yStart + yDiff, yStart + 2*yDiff, yStart + 3*yDiff, yStart + 4*yDiff};


    //Button arrays start from top left and end at bottom right
    String[][] mainRegister = {{"Begin Return","Modify Return","Reprint Last Receipt", "Gift Card Services", "7", "8", "9", "Clear"},
    {"Sign Off", "BLANK", "Reserve Online", "PRICE CHECK", "4", "5", "6", "Enter"},
    {"Rewards Customer", "Tax Exempt Customer", "Retreive Customer Order", "BLANK", "1", "2", "3", "Enter"},
    {"Manager Functions", "BLANK", "Resume/Pay", "Charge", "0", "Quantity", "BLANK", "BLANK"}};

    String[][] locked = {{"Close Register","Reprint Last Receipt","BLANK", "BLANK", "7", "8", "9", "Clear"},
    {"Sign On", "Balance Inquiry", "BLANK", "PRICE CHECK", "4", "5", "6", "Enter"},
    {"Log Off", "BLANK", "BLANK", "BLANK", "1", "2", "3", "Enter"},
    {"Manager Functions", "Open Register", "Till Totals", "Charge", "0", "BLANK", "BLANK", "BLANK"}};

    String[][] lockedTypeInID = {{"BLANK","BLANK","BLANK", "BLANK", "7", "8", "9", "Clear"},
    {"BLANK", "BLANK", "BLANK", "PRICE CHECK", "4", "5", "6", "Enter"},
    {"BLANK", "BLANK", "BLANK", "BLANK", "1", "2", "3", "Enter"},
    {"BLANK", "BLANK", "BLANK", "Charge", "0", "BLANK", "BLANK", "BLANK"}};

    String[][] checkout = {{"Additional Item","Staples Coupon","Cash", "Gift Receipt", "7", "8", "9", "Clear"},
    {"Tax and Rewards Functions", "Manufacturer Coupon", "CAT", "PRICE CHECK", "4", "5", "6", "Enter"},
    {"Cash/Gift Card Redeemed", "Program Discount", "BLANK", "VOID", "1", "2", "3", "Enter"},
    {"BLANK", "BLANK", "Check", "Charge", "0", "BLANK", "BLANK", "BLANK"}};

    //String[][] next =
    public String getButton(String currScreen, int kY, int kX) {
        currentScreen = "pizzameme";
        switch(currScreen) {
            case "Title Screen":
                usedButtonList = null;
            break;

            case "Register-Main":
                usedButtonList = mainRegister;
            break;

            case "Locked":
                usedButtonList = locked;
            break;

            case "Sign-In":
                usedButtonList = lockedTypeInID;
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

        if(bPY[0] <= kY && kY <= bPY[1]) {
            row = 0;
        } else if(bPY[1] < kY && kY <= bPY[2]) {
            row = 1;
        } else if(bPY[2] < kY && kY <= bPY[3]) {
            row = 2;
        } else if(bPY[3] < kY && kY <= bPY[4]) {
            row = 3;
        }
        return usedButtonList[row][column];
    }

    public String switchToScreen() {
        if(usedButtonList[row][column].equals("Sign On")) {
            return "Register-Main";
        } else if(usedButtonList[row][column].equals("Sign Off")) {
            return "Locked";
        }
        return "NO CHANGE";
    }
    public String debugInfo() {
        return "currScreen: " + currentScreen + "\nRow: " + row + " Col: " + column;
    }

    public void reset() {
        row = 3;
        column = 7;
    }
}