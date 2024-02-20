package modules.ResultAndStatistics;

import globals.RoundCondition;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.ResAndStatsCase;
import utilities.objects.TestResult;
import utilities.settings.Constants;

public class ResAndStatsTest4 extends ResAndStats implements ResAndStatsCase {

    private static final int testCase = 4;

    public int getTestCase() { return testCase; }

    public int getDivision() { return 0; }

    public void setResult() {
        // Test case doesn't require result information.
    }

    public void setStatistics() {
        // Test case doesn't require statistics information.
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (RoundCondition.isZeroLose(roundResult)) return;

        String[] currentNumberInResultPanel = getFirstNumberInResultPanel();
        String actualColorResult = currentNumberInResultPanel[0];
        String actualNumberResult = currentNumberInResultPanel[1];
        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String expectedResult = DataTypeHandler.toString(roundResult);
        String actualResult = actualNumberResult + " " + actualColorResult;

        ResultHandler.setTestResult(testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, null);
        testCaseList = DataTypeHandler.removeFromArray(testCase, testCaseList);
        System.out.println("    Test Case " + testCase + " Was Completed.");
    }

    public static void verify() {
        TestResult result = ResultHandler.getTestResult(testCase, 0, Constants.Directory.RESULT_AND_STATS_PATH);

        System.out.println();
        System.out.println("Module: RESULT AND STATISTICS");
        System.out.println("Test Case: " + result.getTestCase());
        System.out.println("Table Information: " + result.getTableInfo());
        System.out.println("Round Result: " + result.getRoundResult());
        System.out.println("Expected Result: " + result.getExpectedResult());

        String message = "Actual Result: " + result.getActualResult();
        AssertHandler.assertEquals(result.getExpectedResult(), result.getActualResult(), message, message);

        System.out.println();
    }

}
