package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import utilities.enums.HandleCollection;
import utilities.handlers.AssertHandler;
import utilities.handlers.DataTypeHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;

public class FuncTest6 {

    static String expectedTable;

    public static void enterAnyDealerTable() {
        String tableName = GetHandler.getElementByRandom(GameLobby.Label.TableNames)
                .getText().replace(" / ", "/");
        expectedTable = tableName.split("/")[1];
        EventHandler.click(GameLobby.Method.getDealerTable(expectedTable), HandleCollection.WithException);
        EventHandler.click(DealerTable.Button.SkipWelcome, HandleCollection.WithException);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 6");
        System.out.println("Other Information: " + expectedTable);
        System.out.println("Actual Results: ");

        String tableInfo = GetHandler.getText(DealerTable.Label.TableInfo);
        AssertHandler.assertTrue(tableInfo.contains(DataTypeHandler.getLastChar(expectedTable)),
                "** Entered Table is Correct: " + tableInfo,
                "** Entered Table is Incorrect: " + tableInfo);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
