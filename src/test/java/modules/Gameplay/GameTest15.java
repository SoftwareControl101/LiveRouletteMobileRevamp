package modules.Gameplay;

import globals.BettingOption;
import globals.RoundCondition;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.Component;

import java.util.ArrayList;
import java.util.List;

public class GameTest15 extends Gameplay {

    static boolean isHighLighted = true;
    static int[] rouletteNumbers = new int[]
            {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13, 36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26};

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 15");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Container.BetResult, 150);
        int actualNumberResult = GetHandler.getInt(DealerTable.Label.BetResultNumber);
        int actualNumberLeft = GetHandler.getInt(DealerTable.Label.BetResultLeftNumber);
        int actualNumberRight = GetHandler.getInt(DealerTable.Label.BetResultRightNumber);
        String[] roundResult = getRoundResult();
        int expectedNumberResult = Integer.parseInt(roundResult[0]);

        AssertHandler.assertEquals(expectedNumberResult, actualNumberResult,
                "** Number Result is Correct: " + expectedNumberResult + " == " + actualNumberResult,
                "** Number Result is Incorrect: " + expectedNumberResult + " != " + actualNumberResult);

        int expectedNumberLeft = getNumberToLeft(expectedNumberResult);
        AssertHandler.assertEquals(expectedNumberLeft, actualNumberLeft,
                "** Left Number is Correct: " + expectedNumberLeft + " == " + actualNumberLeft,
                "** Left Number is Incorrect: " + expectedNumberLeft + " != " + actualNumberLeft);

        int expectedNumberRight = getNumberToRight(expectedNumberResult);
        AssertHandler.assertEquals(expectedNumberRight, actualNumberRight,
                "** Right Number is Correct: " + expectedNumberRight + " == " + actualNumberRight,
                "** Right Number is Incorrect: " + expectedNumberRight + " != " + actualNumberRight);

        for (Component component : getBettingOptions(roundResult)) {
            if(!GetHandler.getAttribute(component, "class").contains("win")) {
                isHighLighted = false;
                break;
            }
        }

        AssertHandler.assertTrue(isHighLighted,
                "** All Winning Betting Options is Highlighted",
                "** All Winning Betting Options is Not Highlighted");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

    public static int getNumberToLeft(int targetNumber) {
        int targetIndex = findIndex(targetNumber);
        int leftIndex = (targetIndex + rouletteNumbers.length - 1) % rouletteNumbers.length;
        return rouletteNumbers[leftIndex];
    }

    public static int getNumberToRight(int targetNumber) {
        int targetIndex = findIndex(targetNumber);
        int rightIndex = (targetIndex + 1) % rouletteNumbers.length;
        return rouletteNumbers[rightIndex];
    }

    private static int findIndex(int targetNumber) {
        for (int i = 0; i < rouletteNumbers.length; i++) if (rouletteNumbers[i] == targetNumber) return i;
        return -1;
    }

    private static List<Component> getBettingOptions(String[] roundResult) {
        List<Component> bettingOptions = new ArrayList<>();
        if(RoundCondition.isRedWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.RED));
        if(RoundCondition.isBlackWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.BLACK));
        if(RoundCondition.isEvenWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.EVEN));
        if(RoundCondition.isOddWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.ODD));
        if(RoundCondition.isLowWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.LOW));
        if(RoundCondition.isHighWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.HIGH));
        if(RoundCondition.isFirstDozenWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.FIRST_DOZEN));
        if(RoundCondition.isSecondDozenWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.SECOND_DOZEN));
        if(RoundCondition.isThirdDozenWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getSideBet(BettingOption.THIRD_DOZEN));
        if(RoundCondition.isFirstColumnWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getColumn(BettingOption.FIRST_COLUMN));
        if(RoundCondition.isSecondColumnWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getColumn(BettingOption.SECOND_COLUMN));
        if(RoundCondition.isThirdColumnWin(roundResult))
            bettingOptions.add(DealerTable.BettingOption.getColumn(BettingOption.THIRD_COLUMN));
        return bettingOptions;
    }

}
