package modules.ResultAndStatistics;

import globals.RoundCondition;
import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.ResAndStatsCase;
import utilities.objects.TestResult;
import utilities.settings.Constants;

public class ResAndStatsTest5_13 extends ResAndStats implements ResAndStatsCase {

    public static final int testCase = 5, division = 13;
    private double oldThirdColumnPercentage = 0.0, actualThirdColumnPercentage = 0.0, expectedThirdColumnPercentage = 0.0;
    private static int size;

    public int getTestCase() { return testCase; }

    public int getDivision() { return division; }

    public void setResult() {
        // Test case doesn't require result information.
    }

    public void setStatistics() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;

        size = getSize(Statistics.Container.ThirdColumnResults);
        expectedThirdColumnPercentage = Math.round(((float) size / totalResultHistory) * 100.0 * 100.0) / 100.0;
        oldThirdColumnPercentage = actualThirdColumnPercentage;
        actualThirdColumnPercentage = getPercentage(Statistics.Label.ThirdColPercentage);
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;
        if (!RoundCondition.isThirdColumnWin(roundResult)) return;

        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String oldResult = Double.toString(oldThirdColumnPercentage);
        String expectedResult = Double.toString(expectedThirdColumnPercentage);
        String actualResult = Double.toString(actualThirdColumnPercentage);

        ResultHandler.setTestResult(testCase, division, currentRoundResult, expectedResult, actualResult, (tableInfo + " " + totalResultHistory + " " + size), oldResult);
        divisionList = DataTypeHandler.removeFromArray(division, divisionList);
        if (divisionList.length != 0) return;
        testCaseList = DataTypeHandler.removeFromArray(testCase, testCaseList);
    }

    public static void verify() {
        TestResult result = ResultHandler.getTestResult(testCase, division, Constants.Directory.RESULT_AND_STATS_PATH);

        System.out.println();
        System.out.println("Module: RESULT AND STATISTICS");
        System.out.println("Division: " + result.getDivision());
        System.out.println("Test Case: " + result.getTestCase());
        System.out.println("Table Information: " + result.getTableInfo());
        System.out.println("Round Result: " + result.getRoundResult());
        System.out.println("Expected Result: " + result.getExpectedResult());

        String message = "Actual Result: " + result.getOtherInfo() + " --> " + result.getActualResult();
        double expectedPercentage = Double.parseDouble(result.getExpectedResult());
        double actualPercentage = Double.parseDouble(result.getActualResult());
        AssertHandler.assertEquals(expectedPercentage, actualPercentage, message, message);

        System.out.println();
    }

}