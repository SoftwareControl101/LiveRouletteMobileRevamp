package modules.Gameplay;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;

public class GameTest12 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 12");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);

        verifyDisplay(DealerTable.Label.NoMoreBets);

        Component bettingOptions = DealerTable.Container.BettingOptions;
        AssertHandler.assertFalse(GetHandler.getAttribute(bettingOptions, "class").contains("active"),
                "** \"" + bettingOptions.getName() + "\" " + bettingOptions.getType() + " is Not Expanded",
                "** \"" + bettingOptions.getName() + "\" " + bettingOptions.getType() + " is Expanded");

        Component expandShrink = DealerTable.Button.ExpandShrink;
        AssertHandler.assertTrue(GetHandler.getAttribute(expandShrink, "class").contains("disabled"),
                "** \"" + expandShrink.getName() + "\" " + expandShrink.getType() + " is Disabled",
                "** \"" + expandShrink.getName() + "\" " + expandShrink.getType() + " is Not Disabled");

        AssertHandler.assertTrue(isBettingOptionsDisabled(),
                "** All Betting Options are Disabled",
                "** Betting Options are Not Disabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

    private static boolean isBettingOptionsDisabled() {
        boolean isDisabled = true;
        for (byte i = 0; i < 9; i++) {
            isDisabled = GetHandler.getAttribute(DealerTable.BettingOption.getSideBet(BettingOption.SIDE_BET_LIST[i]),
                    "class").contains("disabled");
        }
        for (byte i = 1; i < 4; i++) {
            isDisabled = GetHandler.getAttribute(DealerTable.BettingOption.getColumn(i),
                    "class").contains("disabled");
        }
        for (byte i = 0; i < 37; i++) {
            isDisabled = GetHandler.getAttribute(DealerTable.BettingOption.getNumber(i),
                    "class").contains("disabled");
        }
        return isDisabled;
    }

}
