package modules.Functionality;

import pages.DealerTable;
import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;

public class FuncTest45 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 45");
        System.out.println("Actual Results: ");

        AssertHandler.assertFalse(ConditionHandler.isDisplayed(Statistics.Label.Info),
                "** Hot and Cold Information is Closed",
                "** Hot and Cold Information is Not Closed");

        EventHandler.click(Statistics.Button.OpenInformation, 2);
        EventHandler.click(50, 50);
        WaitHandler.wait(2);

        AssertHandler.assertFalse(ConditionHandler.isDisplayed(Statistics.Label.Info),
                "** Hot and Cold Information is Closed When Clicked Outside of Information Modal",
                "** Hot and Cold Information is Not Closed When Clicked Outside of Information Modal");

        System.out.println();
        EventHandler.click(Statistics.Button.CloseStatistics);
        EventHandler.click(DealerTable.Button.Back);
    }

}
