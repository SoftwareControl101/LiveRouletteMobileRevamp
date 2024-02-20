package modules.Gameplay;

import globals.BettingOption;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;

public class GameTest8 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 8");
        System.out.println("Actual Results: ");

        waitBettingPhase(40, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);

        for (byte i = 0; i < 9; i++) {
            verifyPlaceBet(DealerTable.BettingOption.getSideBet(BettingOption.SIDE_BET_LIST[i]),
                    DealerTable.BettingChip.getSideBet(BettingOption.SIDE_BET_LIST[i]));
        }

        for (byte i = 1; i < 4; i++) {
            verifyPlaceBet(DealerTable.BettingOption.getColumn(i),
                    DealerTable.BettingChip.getColumn(i));
        }

        for (int[][] streetOption : BettingOption.STREET_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getStreet(streetOption),
                    DealerTable.BettingChip.getStreet(streetOption));
        }

        for (int[][] cornerOption : BettingOption.CORNER_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getCorner(cornerOption),
                    DealerTable.BettingChip.getCorner(cornerOption));
        }

        for (int[][] sixLineOption : BettingOption.SIX_LINE_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getSixLine(sixLineOption),
                    DealerTable.BettingChip.getSixLine(sixLineOption));
        }

        for (int[][] zeroSectionOption : BettingOption.ZERO_SECTION_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getZeroSection(zeroSectionOption),
                    DealerTable.BettingChip.getZeroSection(zeroSectionOption));
        }

        for (int[][] zeroCornerOption : BettingOption.ZERO_CORNER_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getZeroCorner(zeroCornerOption),
                    DealerTable.BettingChip.getZeroCorner(zeroCornerOption));
        }

        waitBettingPhase(40, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);

        for (byte i = 0; i < 37; i++) {
            verifyPlaceBet(DealerTable.BettingOption.getNumber(i),
                    DealerTable.BettingChip.getNumber(i));
        }

        waitBettingPhase(40, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);

        for (int[][] splitOption : BettingOption.SPLIT_LIST) {
            verifyPlaceBet(DealerTable.BettingOption.getSplit(splitOption),
                    DealerTable.BettingChip.getSplit(splitOption));
        }

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

    private static void verifyPlaceBet(Component bettingOption, Component bettingChip) {
        EventHandler.click(bettingOption);
        String bettingOptionName = bettingOption.getName();
        AssertHandler.assertTrue(ConditionHandler.isDisplayed(bettingChip),
                "** Can Place a Bet on " + bettingOptionName,
                "** Can Not Place a Bet on " + bettingOptionName);
    }

}
