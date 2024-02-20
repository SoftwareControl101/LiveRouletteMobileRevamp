package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.Component;

public class GameTest28 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 28");
        System.out.println("Actual Results: ");

        Component timer = DealerTable.Container.Timer;
        AssertHandler.assertTrue(GetHandler.getAttribute(timer, "class").contains("red"),
                "** \"" + timer.getName() + "\" " + timer.getType() + " is Red Color",
                "** \"" + timer.getName() + "\" " + timer.getType() + " is Not Red Color");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
