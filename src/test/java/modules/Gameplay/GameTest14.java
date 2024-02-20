package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.EventHandler;

public class GameTest14 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        verifyDisplay(DealerTable.Label.BettingIsClosing);
        verifyDisplay(DealerTable.Button.PopUpConfirm);
        verifyDisplay(DealerTable.Button.PopUpNotNow);

        System.out.println();
        EventHandler.click(DealerTable.Button.PopUpNotNow);
        EventHandler.click(DealerTable.Button.Back);
    }

}
