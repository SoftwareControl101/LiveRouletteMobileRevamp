package modules.Gameplay;

import globals.RoundCondition;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;

public class GameTest17 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 17");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Container.BetResult, 150);

        while (RoundCondition.isRedWin(getRoundResult())) {
            placeAndConfirmAnyBettingOptions();
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
            WaitHandler.waitVisibility(DealerTable.Container.BetResult, 150);
        }

        AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.Label.BetResultNumber),
                "** Round Result is Displayed",
                "** Round Result is Not Displayed");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);
        EventHandler.click(DealerTable.Button.Back);
    }

}
