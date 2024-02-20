package modules.Functionality;

import utilities.handlers.AssertHandler;
import utilities.handlers.ConditionHandler;

public class FuncTest5 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 5");
        System.out.println("Actual Results: ");

        AssertHandler.assertFalse(ConditionHandler.isUrlContains("/dealerPage") ||
                        ConditionHandler.isUrlContains("/roulette"),
                "** Live Roulette Revamp is Close",
                "** Live Roulette Revamp is Not Close");

        AssertHandler.assertTrue(ConditionHandler.isUrlContains("/CasinoMobile"),
                "** Player is Back to Live Casino Page",
                "** Player is Not Back to Live Casino Page");

        System.out.println();
    }

}
