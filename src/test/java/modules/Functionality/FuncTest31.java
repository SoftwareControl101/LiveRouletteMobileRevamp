package modules.Functionality;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;

public class FuncTest31 extends Functionality {

    public static void placeABetOnFourOrMoreBettingOptions() {
        waitBettingPhase(45, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.RED));
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.BLACK));
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.ODD));
        EventHandler.click(DealerTable.BettingOption.getSideBet(BettingOption.EVEN));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 31");
        System.out.println("Actual Results: ");

        verifyUndone(DealerTable.BettingChip.getSideBet(BettingOption.RED));
        verifyUndone(DealerTable.BettingChip.getSideBet(BettingOption.BLACK));
        verifyUndone(DealerTable.BettingChip.getSideBet(BettingOption.ODD));
        verifyUndone(DealerTable.BettingChip.getSideBet(BettingOption.EVEN));

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

    private static void verifyUndone(Component bettingChip) {
        AssertHandler.assertFalse(ConditionHandler.isDisplayed(bettingChip),
                "** " + bettingChip.getName() + " is Removed and Undone",
                "** " + bettingChip.getName() + " is Not Removed and Not Undone");
    }

}
