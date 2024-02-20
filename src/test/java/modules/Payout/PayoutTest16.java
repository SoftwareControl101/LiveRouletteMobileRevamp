package modules.Payout;

import globals.BettingOption;
import globals.RoundCondition;
import pages.DealerTable;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.PayoutCase;

import java.util.Arrays;

public class PayoutTest16 extends Payout implements PayoutCase {

    private double bet, payout;
    private final int testCase = 16, payoutOdds = 11;
    private final int[][][] betOptionList = Arrays.copyOf(BettingOption.STREET_LIST, BettingOption.STREET_LIST.length);
    private final double[] chipValueList = new double[betOptionList.length];

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        for (int[][] betOption : betOptionList)
            EventHandler.click(DealerTable.BettingOption.getStreet(betOption));
    }

    public void getBetOption() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        byte i = 0;
        for (int[][] betOption : betOptionList)
            chipValueList[i++] = getChipValue(DealerTable.BettingChip.getStreet(betOption));
    }

    public void computeTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (RoundCondition.isPosBetLose(roundResult, betOptionList)) return;

        byte i = 0;
        for (int[][] betOption : betOptionList) {
            if (RoundCondition.isPosBetWin(roundResult, betOption)) {
                double winBet = chipValueList[i++];
                bet += winBet;
                payout += winBet + (winBet * payoutOdds);
                addWin(winBet, payoutOdds);
            }
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (RoundCondition.isPosBetLose(roundResult, betOptionList)) return;

        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        ResultHandler.setTestResult(testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = DataTypeHandler.removeFromArray(testCase, testCaseList);
    }

}