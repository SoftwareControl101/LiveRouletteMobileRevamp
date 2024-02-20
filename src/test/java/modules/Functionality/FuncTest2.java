package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import utilities.enums.HandleCollection;
import utilities.handlers.*;
import utilities.objects.Component;

public class FuncTest2 extends Functionality {

    static String targetTable;
    static String[] roundResult;

    public static void enterAnyDealerTableWith300Rounds() {
        Component dealerTables = GameLobby.Method.getDealerTable("Deals 300");
        EventHandler.click(dealerTables, GetHandler.getElementByRandom(dealerTables));
        EventHandler.click(DealerTable.Button.SkipWelcome, HandleCollection.WithException);
    }

    public static void waitUntilSucceedingRoundEnds() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
        targetTable = getTableName();
        roundResult = getRoundResult();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 150);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 2");
        System.out.println("Other Information: " + targetTable);
        System.out.println("Actual Results: ");

        int totalRoundCounter = GetHandler.getInt(GameLobby.Method.getTotalRoundCounter(targetTable));
        String message = "** Total Round Counter on Lobby is " + totalRoundCounter +
                " After Succeeding Rounds with Round Result of " + DataTypeHandler.toString(roundResult);
        AssertHandler.assertEquals(300, totalRoundCounter, message, message);

        System.out.println();
    }

}
