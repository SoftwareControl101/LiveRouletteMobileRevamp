package modules.Functionality;

import globals.BettingOption;
import org.openqa.selenium.WebElement;
import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;

import java.util.List;

public class FuncTest33 extends Functionality {

    static double oldBet;

    public static void verify(boolean isCheckConfirm) {
        if (isCheckConfirm) {

            oldBet = getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED));

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 33");
            System.out.println("Actual Results: ");

            AssertHandler.assertEquals("Top Up Confirm", GetHandler.getText(DealerTable.Button.Confirm),
                    "** \"Top Up Confirm\" Button is Displayed",
                    "** \"Top Up Confirm\" Button is Not Displayed");

        } else {

            double newBet = getChipValue(DealerTable.BettingChip.getSideBet(BettingOption.RED));
            AssertHandler.assertNotEquals(oldBet, newBet,
                    "** Placed Bet is Changed to Minimum Bet of the Betting Options: " + oldBet + " --> " + newBet,
                    "** Placed Bet is Not Changed to Minimum Bet of the Betting Options: " + oldBet + " --> " + newBet);

            System.out.println();
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
            WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}
