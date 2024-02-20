package modules.Gameplay;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;

public class GameTest9 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 9");
        System.out.println("Actual Results: ");

        AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.BettingChip.getSideBet(BettingOption.RED)),
                "** Can Place a Bet on Any Betting Option",
                "** Can Not Place a Bet on Any Betting Option");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
