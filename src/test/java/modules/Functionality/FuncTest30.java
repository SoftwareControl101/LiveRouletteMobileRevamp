package modules.Functionality;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;

public class FuncTest30 extends Functionality {

    public static void placeAndUndoAnyBettingOptions() {
        waitBettingPhase(40, false);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.RED));
        EventHandler.click(DealerTable.Button.Undo);
        WaitHandler.wait(2);
        verify(true);
    }

    public static void placeABetOnTwoOrMoreBettingOptions() {
        waitBettingPhase(40, false);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.RED));
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.HIGH));
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.ODD));
    }

    public static void verify(boolean isOneBet) {
        if (isOneBet) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 30");
            System.out.println("Actual Results: ");

            AssertHandler.assertFalse(ConditionHandler.isDisplayed(DealerTable.BettingChip.getSideBet(BettingOption.RED)),
                    "** Placed Bet is Removed",
                    "** Placed Bet is Not Removed");

        } else {

            AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.BettingChip.getSideBet(BettingOption.RED)),
                    "** First Bet is Placed",
                    "** First Bet is Not Placed");

            AssertHandler.assertTrue(ConditionHandler.isDisplayed(DealerTable.BettingChip.getSideBet(BettingOption.HIGH)),
                    "** Second Bet is Placed",
                    "** Second Bet is Not Placed");

            AssertHandler.assertFalse(ConditionHandler.isDisplayed(DealerTable.BettingChip.getSideBet(BettingOption.ODD)),
                    "** Most Previous Move/Third Bet is Undone",
                    "** Most Previous Move/Third Bet is Not Undone");

            System.out.println();
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}
