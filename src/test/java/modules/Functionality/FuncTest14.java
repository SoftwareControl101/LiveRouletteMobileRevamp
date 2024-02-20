package modules.Functionality;

import pages.DealerTable;
import pages.Help;
import utilities.handlers.EventHandler;

public class FuncTest14 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        verifyDisplay(Help.Button.Basics);
        verifyDisplay(Help.Button.BetOptions);
        verifyDisplay(Help.Button.GameControls);
        verifyDisplay(Help.Button.Likelihood);

        System.out.println();
        EventHandler.click(Help.Button.Back);
        EventHandler.click(50, 50);
        EventHandler.click(DealerTable.Button.Back);
    }

}
