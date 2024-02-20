package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;

public class FuncTest47 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 47");
        System.out.println("Actual Results: ");

        AssertHandler.assertTrue(ConditionHandler.isUrlContains("/dealerPage"),
                "** Player is Back to Game Lobby",
                "** Player is Not Back to Game Lobby");

        System.out.println();

        EventHandler.click(DealerTable.Button.Back);
    }

}
