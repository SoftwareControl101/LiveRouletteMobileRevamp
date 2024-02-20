package modules.Payout;

import pages.DealerTable;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.PayoutCase;

public class PayoutTest14 extends Payout implements PayoutCase {

    private double bet, payout;
    private final int testCase = 14, payoutOdds = 35, betOption = 37;
    private final double[] chipValueList = new double[betOption];

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        for (byte i = 0; i < betOption; i++)
            EventHandler.click(DealerTable.BettingOption.getNumber(i));
    }

    public void getBetOption() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        for (byte i = 0; i < betOption; i++)
            chipValueList[i] = getChipValue(DealerTable.BettingChip.getNumber(i));
    }

    public void computeTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        bet = chipValueList[Integer.parseInt(roundResult[0])];
        payout = bet + (bet * payoutOdds);
        addWin(bet, payoutOdds);
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        ResultHandler.setTestResult(testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = DataTypeHandler.removeFromArray(testCase, testCaseList);
    }

}
