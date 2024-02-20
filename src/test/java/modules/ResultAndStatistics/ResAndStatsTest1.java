package modules.ResultAndStatistics;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.interfaces.ResAndStatsCase;
import utilities.objects.Component;
import utilities.objects.TestResult;
import utilities.settings.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ResAndStatsTest1 extends ResAndStats implements ResAndStatsCase {

    private static final int testCase = 1;
    private int counter = 0;
    private final String[] roundResultList = new String[2];
    private String[] expectedResultList = new String[12];
    private String oldResult = "";

    public int getTestCase() { return testCase; }

    public int getDivision() { return 0; }

    public void setResult() {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;
        if (!Objects.equals(oldResult, "")) return;

        expectedResultList = getResultList();
        oldResult = DataTypeHandler.toString(expectedResultList);
    }

    public void setStatistics() {
        // Test case doesn't require statistics information.
    }

    public void saveTestCase(String[] roundResult) {
        if (!DataTypeHandler.find(testCase, testCaseList)) return;

        if (counter <= 1) {
            expectedResultList = getNewResultList(Integer.parseInt(roundResult[0]), expectedResultList);
            roundResultList[counter] = DataTypeHandler.toString(roundResult);
        }

        if (counter == 1) {
            String currentRoundResult = DataTypeHandler.toString(roundResultList);
            String expectedResult = DataTypeHandler.toString(expectedResultList);
            String actualResult = DataTypeHandler.toString(getResultList());

            ResultHandler.setTestResult(testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, oldResult);
            testCaseList = DataTypeHandler.removeFromArray(testCase, testCaseList);
        }

        ++counter;
    }

    private static String[] getResultList() {
        Component numbersInResultPanel = DealerTable.Label.NumbersInResultPanel;
        String[] winNumber = GetHandler.getTextArray(numbersInResultPanel);
        return !ConditionHandler.isEmpty(numbersInResultPanel) ? winNumber : null;
    }

    private String[] getNewResultList(int numberResult, String[] list) {
        List<String> resultList = new ArrayList<>(Arrays.asList(list));
        resultList.add(0, String.valueOf(numberResult));
        if (resultList.size() > 12) resultList.remove(resultList.size() - 1);
        return resultList.toArray(new String[0]);
    }

    public static void verify() {
        TestResult result = ResultHandler.getTestResult(testCase, 0, Constants.Directory.RESULT_AND_STATS_PATH);

        System.out.println();
        System.out.println("Module: RESULT AND STATISTICS");
        System.out.println("Test Case: " + result.getTestCase());
        System.out.println("Table Information: " + result.getTableInfo());
        System.out.println("Round Result: " + result.getRoundResult());
        System.out.println("Expected Result: " + result.getExpectedResult());

        String message = "Actual Result: " + result.getOtherInfo() + " --> " + result.getActualResult();
        AssertHandler.assertEquals(result.getExpectedResult(), result.getActualResult(), message, message);

        System.out.println();
    }

}
