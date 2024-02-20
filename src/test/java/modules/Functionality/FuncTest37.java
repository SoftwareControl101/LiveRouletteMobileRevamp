package modules.Functionality;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;

public class FuncTest37 extends Functionality {

    static double oldBet;

    public static void checkThePlacedBet() {
        oldBet = getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        double expectedBet = oldBet * 2;
        double actualBet = getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED));
        AssertHandler.assertEquals(expectedBet, actualBet,
                "** The Placed Bet is Doubled: " + oldBet + " --> " + actualBet,
                "** The Placed Bet is Not Doubled: " + oldBet + " --> " + actualBet);

        AssertHandler.assertFalse(GetHandler.getAttribute(DealerTable.Button.Confirm, "class").contains("disabled"),
                "** Confirm Button is Enabled",
                "** Confirm Button is Not Enabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
