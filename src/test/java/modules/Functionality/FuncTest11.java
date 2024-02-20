package modules.Functionality;

import globals.BettingOption;
import pages.BetDetails;
import pages.DealerTable;
import pages.MyBets;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;

public class FuncTest11 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 11");
        System.out.println("Other Information: #" + roundId);
        System.out.println("Actual Results: ");

        verifyDisplay(BetDetails.Label.BetDetails);
        verifyDisplay(BetDetails.Label.Stake);
        verifyDisplay(BetDetails.Label.WinLoss);
        verifyDisplay(BetDetails.Container.BettingOptions);
        verifyDisplay(BetDetails.Container.WinBettingOptions);
        verifyDisplay(BetDetails.BettingChip.getSideBet(BettingOption.RED));

        System.out.println();
        EventHandler.click(BetDetails.Button.Back);
        EventHandler.click(MyBets.Button.Back, HandleCollection.WithScroll);
        EventHandler.click(50, 50);
        EventHandler.click(DealerTable.Button.Back);
    }

}
