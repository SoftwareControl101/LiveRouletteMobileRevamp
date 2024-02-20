package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import pages.SwitchTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.GetHandler;

public class FuncTest1 extends Functionality {

    static String targetTable;
    static int[] expectedNumbersInResultPanel, expectedAllRoundCounters;

    public static void checkTheRoundResultHistory() {
        waitBettingPhase(40, false);
        expectedNumbersInResultPanel = GetHandler.getIntArray(DealerTable.Label.NumbersInResultPanel);
        targetTable = DataTypeHandler.getLastChar(getTableName());
    }

    public static void checkAllRoundCounters() {
        expectedAllRoundCounters = GetHandler.getIntArray(SwitchTable.Method.getAllCounters(targetTable));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        int[] actualAllRoundCounters = GetHandler.getIntArray(GameLobby.Method.getAllCounters(targetTable));

        verifyCounter("Red Counter", expectedAllRoundCounters[0], actualAllRoundCounters[0]);
        verifyCounter("Black Counter", expectedAllRoundCounters[1], actualAllRoundCounters[1]);
        verifyCounter("Zero Counter", expectedAllRoundCounters[2], actualAllRoundCounters[2]);
        verifyCounter("Total Round Counter", expectedAllRoundCounters[3], actualAllRoundCounters[3]);

        int expectedTotalRound = actualAllRoundCounters[3];
        int actualTotalRound = actualAllRoundCounters[0] + actualAllRoundCounters[1] + actualAllRoundCounters[2];

        AssertHandler.assertEquals(expectedTotalRound, actualTotalRound,
                "** Sum of Zero, Red, and Black Counter is Same with Total Round Counter",
                "** Sum of Zero, Red, and Black Counter is Not Same with Total Round Counter");

        System.out.println();
    }

    private static void verifyCounter(String counter, int expected, int actual) {
        String message = "** " + counter + " in Switch Table (" + expected + ") and Lobby (" + actual + ")";
        AssertHandler.assertEquals(expected, actual,
                message + " is Same",
                message + " is Not Same");
    }

}
