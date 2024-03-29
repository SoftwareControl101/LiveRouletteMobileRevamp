package modules.ResultAndStatistics;

import pages.Statistics;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.ResultHandler;
import utilities.interfaces.ResAndStatsCase;
import utilities.objects.TestResult;
import utilities.settings.Constants;

import java.util.Arrays;

public class ResAndStatsTest5_16 extends ResAndStats implements ResAndStatsCase {

    public static final int testCase = 5, division = 16;
    private int[] oldColdNumberList = new int[5], oldColdCounterList = new int[5], coldNumberList = new int[5], actualColdCounterList = new int[5];
    private final int[] expectedColdCounterList = new int[5];

    public int getTestCase() { return testCase; }

    public int getDivision() { return division; }

    public void setResult() {
        // Test case doesn't require result information.
    }

    public void setStatistics() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;

        oldColdNumberList = Arrays.copyOf(coldNumberList, coldNumberList.length);
        oldColdCounterList = Arrays.copyOf(actualColdCounterList, actualColdCounterList.length);
        coldNumberList = GetHandler.getIntArray(Statistics.Label.ColdNumbers);
        actualColdCounterList = GetHandler.getIntArray(Statistics.Label.ColdCounters);
        for (int i = 0; i < coldNumberList.length; i++)
            expectedColdCounterList[i] = getSize(Statistics.Method.getColdResults(coldNumberList[i]));
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!DataTypeHandler.find(division, divisionList)) return;
        if (!DataTypeHandler.find(Integer.parseInt(roundResult[0]), oldColdNumberList)) return;

        String currentRoundResult = DataTypeHandler.toString(roundResult);
        String oldResult = getResultFromArray(oldColdNumberList, oldColdCounterList);
        String expectedResult = getResultFromArray(coldNumberList, expectedColdCounterList);
        String actualResult = getResultFromArray(coldNumberList, actualColdCounterList);

        ResultHandler.setTestResult(testCase, division, currentRoundResult, expectedResult, actualResult, tableInfo, oldResult);
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
        AssertHandler.assertTrue(isPassed(result), message, message);

        System.out.println();
    }

    private static boolean isPassed(TestResult result) {
        int[][] actualResult = Arrays.copyOf(getArrayFromResult(result.getActualResult()), getArrayFromResult(result.getActualResult()).length);
        int[] actualNumberResultList = actualResult[0];
        int[] actualCounterResultList = actualResult[1];
        int[][] expectedResult = Arrays.copyOf(getArrayFromResult(result.getExpectedResult()), getArrayFromResult(result.getExpectedResult()).length);
        int[] expectedNumberResultList = expectedResult[0];
        int[] expectedCounterResultList = expectedResult[1];

        int numberResult = Integer.parseInt(result.getRoundResult().split(" ")[0]);

        if (DataTypeHandler.find(numberResult, actualNumberResultList)) return false;
        for (int i = 0; i < actualNumberResultList.length; i++) {
            if (actualNumberResultList[i] != expectedNumberResultList[i]) return false;
            if (expectedCounterResultList[i] != 0 && actualCounterResultList[i] != expectedCounterResultList[i]) return false;
        }

        return true;
    }

}