package modules.Functionality;

import globals.BettingOption;
import pages.DealerTable;
import pages.SwitchTable;
import utilities.handlers.*;
import utilities.objects.Component;

public class FuncTest34 extends Functionality {

    public static void switchAndJoinAnotherTable() {
        verify(true);
        EventHandler.click(DealerTable.Button.SwitchTable, 2);
        Component tableCards = SwitchTable.Method.getTableCards(false);
        EventHandler.click(tableCards, GetHandler.getElementByRandom(tableCards));
        WaitHandler.wait(2);
    }

    public static void verify(boolean isFirstTable) {
        if (isFirstTable) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 34");
            System.out.println("Actual Results: ");

            AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.Label.BetsAccepted),
                    "** \"Bets accepted.\" is Displayed In First Bet",
                    "** \"Bets accepted.\" is Displayed In First Bet");

            AssertHandler.assertNotEquals(0, getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED)),
                    "** Able to Bet in Multiple Tables In First Bet",
                    "** Not Able to Bet in Multiple Tables In First Bet");

            AssertHandler.assertNotEquals(0, GetHandler.getDouble(DealerTable.Label.BalanceValue),
                    "** The Bets of the Player is Accepted In First Bet",
                    "** The Bets of the Player is Not Accepted In First Bet");

        } else {

            AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.Label.BetsAccepted),
                    "** \"Bets accepted.\" is Displayed In Second Bet",
                    "** \"Bets accepted.\" is Displayed In Second Bet");

            AssertHandler.assertNotEquals(0, getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED)),
                    "** Able to Bet in Multiple Tables In Second Bet",
                    "** Not Able to Bet in Multiple Tables In Second Bet");

            AssertHandler.assertNotEquals(0, GetHandler.getDouble(DealerTable.Label.BalanceValue),
                    "** The Bets of the Player is Accepted In Second Bet",
                    "** The Bets of the Player is Not Accepted In Second Bet");

            System.out.println();
            waitUntilRoundIsOver();
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}
