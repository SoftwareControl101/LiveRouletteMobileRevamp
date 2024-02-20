package modules.Gameplay;

import org.openqa.selenium.WebElement;
import pages.DealerTable;
import utilities.handlers.AssertHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;

public class GameTest10 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 10");
        System.out.println("Actual Results: ");

        for (WebElement actionButton : GetHandler.getElements(DealerTable.Button.ActionButtons)) {
            AssertHandler.assertFalse(actionButton.getAttribute("class").contains("disabled"),
                    "** " + actionButton.getText() + " Button is Enabled",
                    "** " + actionButton.getText() + " Button is Not Enabled");
        }

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
