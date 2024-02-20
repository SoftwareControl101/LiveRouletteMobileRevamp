package modules.Functionality;

import pages.DealerTable;
import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;

public class FuncTest44 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 44");
        System.out.println("Actual Results: ");

        AssertHandler.assertTrue(ConditionHandler.isDisplayed(Statistics.Label.Info),
                "** Hot and Cold Information is Displayed",
                "** Hot and Cold Information is Not Displayed");

        System.out.println();
        EventHandler.click(Statistics.Button.CloseInformation);
        EventHandler.click(Statistics.Button.CloseStatistics);
        EventHandler.click(DealerTable.Button.Back);
    }

}
