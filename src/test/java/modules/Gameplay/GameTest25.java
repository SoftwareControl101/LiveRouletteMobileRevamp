package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;

public class GameTest25 extends Gameplay {

    public static void clickTheBackButton() {
        WaitHandler.wait(2);
        EventHandler.click(DealerTable.Button.Back);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 25");
        System.out.println("Actual Results: ");

        verifyDisplay(DealerTable.Label.YourBetsAreBeingSettled);

        AssertHandler.assertTrue(ConditionHandler.isUrlContains("/roulette"),
                "** Player is Seated on the Current Table",
                "** Player is Not Seated on the Current Table");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);
        EventHandler.click(DealerTable.Button.Back);
    }

}
