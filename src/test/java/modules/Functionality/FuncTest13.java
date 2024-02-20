package modules.Functionality;

import pages.DealerTable;
import pages.LimitsAndPayouts;
import utilities.handlers.EventHandler;
import utilities.objects.Component;

public class FuncTest13 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        verifyDisplay(LimitsAndPayouts.Label.TableName);
        verifyDisplay(LimitsAndPayouts.Label.TableLimit);

        Component[] limitList = {
                LimitsAndPayouts.Label.StraightUpLimit,
                LimitsAndPayouts.Label.EvenChanceLimit,
                LimitsAndPayouts.Label.DozenColumnLimit,
                LimitsAndPayouts.Label.SplitLimit,
                LimitsAndPayouts.Label.StreetLimit,
                LimitsAndPayouts.Label.CornerZeroSectionLimit,
                LimitsAndPayouts.Label.ZeroCornerLimit,
                LimitsAndPayouts.Label.SixLineLimit
        };

        for (Component limit : limitList) verifyDisplay(limit);

        Component[] payoutList = {
                LimitsAndPayouts.Label.StraightUpPayout,
                LimitsAndPayouts.Label.EvenChancePayout,
                LimitsAndPayouts.Label.DozenColumnPayout,
                LimitsAndPayouts.Label.SplitPayout,
                LimitsAndPayouts.Label.StreetPayout,
                LimitsAndPayouts.Label.CornerZeroSectionPayout,
                LimitsAndPayouts.Label.ZeroCornerPayout,
                LimitsAndPayouts.Label.SixLinePayout
        };

        for (Component payout : payoutList) verifyDisplay(payout);

        System.out.println();
        EventHandler.click(LimitsAndPayouts.Button.Back);
        EventHandler.click(50, 50);
        EventHandler.click(DealerTable.Button.Back);
    }

}
