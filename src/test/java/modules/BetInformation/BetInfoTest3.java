package modules.BetInformation;

import globals.BettingOption;
import globals.RoundCondition;
import pages.BetDetails;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.Component;

public class BetInfoTest3 extends BetInformation {

    static int numberBet = 4, columnBet = BettingOption.FIRST_COLUMN;
    static String colorBet = BettingOption.BLACK, evenBet = BettingOption.EVEN,
            highBet = BettingOption.HIGH, dozenBet = BettingOption.FIRST_DOZEN;
    static int[][] sixLineBet = BettingOption.SIX_LINE_LIST[0], splitBet = BettingOption.SPLIT_LIST[3],
            streetBet = BettingOption.STREET_LIST[1];

    public static void placeBet() {
        boolean isError = true;
        do {
            try {
                waitBettingPhase(30, false);
                WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 150);
                EventHandler.click(DealerTable.BettingOption.getNumber(numberBet));
                EventHandler.click(DealerTable.BettingOption.getSixLine(sixLineBet));
                EventHandler.click(DealerTable.BettingOption.getSplit(splitBet));
                EventHandler.click(DealerTable.BettingOption.getStreet(streetBet));
                EventHandler.click(DealerTable.BettingOption.getSideBet(colorBet));
                EventHandler.click(DealerTable.BettingOption.getSideBet(evenBet));
                EventHandler.click(DealerTable.BettingOption.getSideBet(highBet));
                EventHandler.click(DealerTable.BettingOption.getSideBet(dozenBet));
                EventHandler.click(DealerTable.BettingOption.getColumn(columnBet));
                EventHandler.click(DealerTable.Button.Confirm);
                waitRoundResult();
                isError = false;
            } catch (Exception e) { PrintHandler.printError("Failed to place a bet"); }
        } while (isError);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: BET INFORMATION");
        System.out.println("Test Case: 3");
        System.out.println("Other Information: " + tableName + " #" + roundId + " " + DataTypeHandler.toString(roundResult));
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(BetDetails.Label.BetDetails, 150);
        verifyDisplay(BetDetails.Button.Back);

        double expectedStake = totalBet;
        double actualStake = getCurrentStake();
        AssertHandler.assertEquals(expectedStake, actualStake,
                "** Stake is Correct: " + expectedStake + " == " + actualStake,
                "** Stake is Incorrect: " + expectedStake + " != " + actualStake);

        double expectedWinLoss = getExpectedWinLoss() - totalBet;
        double actualWinLoss = GetHandler.getDouble(BetDetails.Label.WinLoss);
        AssertHandler.assertEquals(expectedWinLoss, actualWinLoss,
                "** Win/Loss is Correct: " + expectedWinLoss + " == " + actualWinLoss,
                "** Win/Loss is Incorrect: " + expectedWinLoss + " != " + actualWinLoss);

        verifyDisplay(BetDetails.Container.BettingOptions);

        int expectedBetSize = 9;
        int actualBetSize = GetHandler.getElements(BetDetails.Label.BettingChips).size();
        AssertHandler.assertEquals(expectedBetSize, actualBetSize,
                "** Betting Chips is Correct: " + expectedBetSize + " == " + actualBetSize,
                "** Betting Chips is Incorrect: " + expectedBetSize + " != " + actualBetSize);

        Component winBettingOptions = BetDetails.Container.WinBettingOptions;
        AssertHandler.assertFalse(ConditionHandler.isEmpty(winBettingOptions),
                "** Win Betting Options is Correct: " + GetHandler.getElements(winBettingOptions).size(),
                "** Win Betting Options is Incorrect: " + 0);

        System.out.println();
    }

    private static double getExpectedWinLoss() {
        double expectedWinLoss = 0.0;

        expectedWinLoss += getPayout(35, RoundCondition.isNumberWin(roundResult, numberBet),
                DealerTable.BettingChip.getNumber(numberBet));
        expectedWinLoss += getPayout(5, RoundCondition.isPosBetWin(roundResult, sixLineBet),
                DealerTable.BettingChip.getSixLine(sixLineBet));
        expectedWinLoss += getPayout(17, RoundCondition.isPosBetWin(roundResult, splitBet),
                DealerTable.BettingChip.getSplit(splitBet));
        expectedWinLoss += getPayout(11, RoundCondition.isPosBetWin(roundResult, streetBet),
                DealerTable.BettingChip.getStreet(streetBet));
        expectedWinLoss += getPayout(1, RoundCondition.isBlackWin(roundResult),
                DealerTable.BettingChip.getSideBet(colorBet));
        expectedWinLoss += getPayout(1, RoundCondition.isEvenWin(roundResult),
                DealerTable.BettingChip.getSideBet(evenBet));
        expectedWinLoss += getPayout(1, RoundCondition.isHighWin(roundResult),
                DealerTable.BettingChip.getSideBet(highBet));
        expectedWinLoss += getPayout(2, RoundCondition.isFirstDozenWin(roundResult),
                DealerTable.BettingChip.getSideBet(dozenBet));
        expectedWinLoss += getPayout(2, RoundCondition.isFirstColumnWin(roundResult),
                DealerTable.BettingChip.getColumn(columnBet));

        return expectedWinLoss;
    }

    private static double getPayout(int multiplier, boolean condition, Component chipValue) {
        if (condition) {
            int bet = getChipValue(chipValue);
            return bet * multiplier + bet;
        }
        return 0;
    }

}
