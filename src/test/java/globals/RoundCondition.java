package globals;

import utilities.handlers.DataTypeHandler;

import java.util.Objects;

public class RoundCondition {

    /***************************************************************************************************************
     * These methods checks the results of each round in the Live Roulette Revamp Game.
     ***************************************************************************************************************/

    public static boolean isNumberWin(String[] result, int number) {
        int numberResult = Integer.parseInt(result[0]);
        return number == numberResult;
    }

    public static boolean isPosBetWin(String[] result, int[][] bettingOption) {
        int[] bettingOptions = bettingOption[1];
        int numberResult = Integer.parseInt(result[0]);
        return DataTypeHandler.find(numberResult, bettingOptions);
    }

    public static boolean isPosBetLose(String[] result, int[][][] bettingOptionList) {
        int numberResult = Integer.parseInt(result[0]);
        for (int[][] bettingOption : bettingOptionList) {
            int[] bettingResult = bettingOption[1];
            if (DataTypeHandler.find(numberResult, bettingResult)) return false;
        }
        return true;
    }

    public static boolean isRedWin(String[] result) {
        String colorResult = result[1];
        return Objects.equals(colorResult, "RED");
    }

    public static boolean isBlackWin(String[] result) {
        String colorResult = result[1];
        return Objects.equals(colorResult, "BLACK");
    }

    public static boolean isZeroLose(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult != 0;
    }

    public static boolean isEvenWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult % 2 == 0 && numberResult != 0;
    }

    public static boolean isOddWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult % 2 != 0;
    }

    public static boolean isLowWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult <= 18 && numberResult != 0;
    }

    public static boolean isHighWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult >= 19;
    }

    public static boolean isFirstDozenWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult <= 12 & numberResult != 0;
    }

    public static boolean isSecondDozenWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult >= 13 & numberResult <= 24;
    }

    public static boolean isThirdDozenWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return numberResult >= 25;
    }

    public static boolean isFirstColumnWin(String[] result) {
        int numberResult = Integer.parseInt(result[0]);
        return DataTypeHandler.find(numberResult, BettingOption.FIRST_COLUMN_NUMBERS);
    }

    public static boolean isSecondColumnWin(String[] result) {
        int number = Integer.parseInt(result[0]);
        return DataTypeHandler.find(number, BettingOption.SECOND_COLUMN_NUMBERS);
    }

    public static boolean isThirdColumnWin(String[] result) {
        int number = Integer.parseInt(result[0]);
        return DataTypeHandler.find(number, BettingOption.THIRD_COLUMN_NUMBERS);
    }

}
