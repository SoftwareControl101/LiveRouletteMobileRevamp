package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

public class GameTest13 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);

        AssertHandler.assertEquals(0, GetHandler.getDouble(DealerTable.Label.TotalBet),
                "** Placed Bet is Not Accepted",
                "** Placed Bet is Accepted");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
