package modules.Functionality;

import pages.DealerTable;
import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;

public class FuncTest25 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 25");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);

        verifyDisplay(Statistics.Label.ShowTimer);

        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);

        verifyDisplay(Statistics.Label.ShowDealing);
        verifyDisplay(Statistics.Container.Statistics);
        verifyDisplay(Statistics.Label.RedPercentage);
        verifyDisplay(Statistics.Label.BlackPercentage);
        verifyDisplay(Statistics.Label.ZeroPercentage);
        verifyDisplay(Statistics.Label.OddPercentage);
        verifyDisplay(Statistics.Label.EvenPercentage);
        verifyDisplay(Statistics.Label.HighPercentage);
        verifyDisplay(Statistics.Label.LowPercentage);
        verifyDisplay(Statistics.Label.FirstDozenPercentage);
        verifyDisplay(Statistics.Label.SecondDozenPercentage);
        verifyDisplay(Statistics.Label.ThirdDozenPercentage);
        verifyDisplay(Statistics.Label.FirstColPercentage);
        verifyDisplay(Statistics.Label.SecondColPercentage);
        verifyDisplay(Statistics.Label.ThirdColPercentage);

        AssertHandler.assertTrue(ConditionHandler.isDisplayed(Statistics.Label.HotNumbers) &&
                        ConditionHandler.isDisplayed(Statistics.Label.HotCounters),
                "** Hot Numbers and Counters is Displayed",
                "** Hot Numbers and Counters is Not Displayed");

        AssertHandler.assertTrue(ConditionHandler.isDisplayed(Statistics.Label.ColdNumbers) &&
                        ConditionHandler.isDisplayed(Statistics.Label.ColdCounters),
                "** Cold Numbers and Counters is Displayed",
                "** Cold Numbers and Counters is Not Displayed");

        System.out.println();
        EventHandler.click(Statistics.Button.CloseStatistics);
        EventHandler.click(DealerTable.Button.Back);
    }

}
