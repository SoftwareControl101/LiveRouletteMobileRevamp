package modules.ResultAndStatistics;

import globals.RoundCondition;
import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.ResAndStatsCase;
import utilities.objects.TestResult;
import utilities.settings.Constants;

public class ResAndStatsTest5_2 extends ResAndStats implements ResAndStatsCase {

    public static final int testCase = 5, division = 2;
    private double oldZeroPercentage = 0.0, actualZeroPercentage = 0.0, expectedZeroPercentage = 0.0;
    private static int size;

    public int getTestCase() { return testCase; }

    public int getDivision() { return division; }

    public void setResult() {
        // Test case doesn't require result information.
    }

    public void setStatistics() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;

        size = getSize(Statistics.Container.ZeroResults);
        double redPercentage = Math.round(((float) getSize(Statistics.Container.RedResults) / totalResultHistory)
                * 100.0 * 100.0) / 100.0;
        double blackPercentage = Math.round(((float) getSize(Statistics.Container.BlackResults) / totalResultHistory)
                * 100.0 * 100.0) / 100.0;
        expectedZeroPercentage = 100.0 - (redPercentage + blackPercentage);
        oldZeroPercentage = actualZeroPercentage;
        actualZeroPercentage = getPercentage(Statistics.Label.ZeroPercentage);
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;
        if (RoundCondition.isZeroLose(roundResult)) return;

        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String oldResult = Double.toString(oldZeroPercentage);
        String expectedResult = Double.toString(expectedZeroPercentage);
        String actualResult = Double.toString(actualZeroPercentage);

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
