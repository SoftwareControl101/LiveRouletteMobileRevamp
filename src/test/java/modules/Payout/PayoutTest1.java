package modules.Payout;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.EventHandler;

public class PayoutTest1 extends Payout {

    public static void verify() {
        System.out.println();
        System.out.println("Module: PAYOUT");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        for (byte i = 0; i < 9; i++)
            verifyDisplay(DealerTable.BettingOption.getSideBet(BettingOption.SIDE_BET_LIST[i]));

        for (byte i = 1; i < 4; i++)
            verifyDisplay(DealerTable.BettingOption.getColumn(i));

        for (byte i = 0; i < 37; i++)
            verifyDisplay(DealerTable.BettingOption.getNumber(i));

        for (int[][] splitOption : BettingOption.SPLIT_LIST)
            verifyDisplay(DealerTable.BettingOption.getSplit(splitOption));

        for (int[][] streetOption : BettingOption.STREET_LIST)
            verifyDisplay(DealerTable.BettingOption.getStreet(streetOption));

        for (int[][] cornerOption : BettingOption.CORNER_LIST)
            verifyDisplay(DealerTable.BettingOption.getCorner(cornerOption));

        for (int[][] sixLineOption : BettingOption.SIX_LINE_LIST)
            verifyDisplay(DealerTable.BettingOption.getSixLine(sixLineOption));

        for (int[][] zeroSectionOption : BettingOption.ZERO_SECTION_LIST)
            verifyDisplay(DealerTable.BettingOption.getZeroSection(zeroSectionOption));

        for (int[][] zeroCornerOption : BettingOption.ZERO_CORNER_LIST)
            verifyDisplay(DealerTable.BettingOption.getZeroCorner(zeroCornerOption));

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
