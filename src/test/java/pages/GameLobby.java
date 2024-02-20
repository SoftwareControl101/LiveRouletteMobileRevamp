package pages;

import utilities.enums.Environment;
import utilities.objects.Component;
import utilities.settings.Accounts;

public class GameLobby {

    /***************************************************************************************************************
     * These are the table component on the Game Lobby Page.
     ***************************************************************************************************************/

    private static final String tablesPath = Accounts.getEnvironment() == Environment.PRODUCTION ?
            "//div[contains(@class, 'dealer_btn')]//span[not(contains(text(),'Maintenance'))]/ancestor::div[4]" :
            "//div[contains(@class, 'dealer_top')]//p[(contains(text(),'Roulette X'))]/ancestor::div[2]";

    /***************************************************************************************************************
     * These are the container components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component DealerTables = new Component(
                "List of Dealer Tables",
                "Container",
                "Game Lobby Page",
                tablesPath
        );
        public static Component DealerPhotos = new Component(
                "List of Dealer Photos",
                "Container",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='dealer_photo']"
        );
        public static Component RoadMaps = new Component(
                "List of Road Maps",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='roadmap_display']"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Game Lobby Page",
                "//button[@class='back_btn']"
        );
        public static Component ActiveTableLimit = new Component(
                "Active Table Limit",
                "Button",
                "Game Lobby Page",
                "//div[@class='tableLimit_list']//li[@class='active']"
        );
        public static Component HideShowBalance = new Component(
                "Hide/Show Balance",
                "Button",
                "Game Lobby Page",
                "//div[contains(@class, 'balance_btn')]"
        );
        public static Component TableLimits = new Component(
                "List of Table Limits",
                "Button",
                "Game Lobby Page",
                "//div[@class='tableLimit_list']//li"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component BalanceText = new Component(
                "Balance Text",
                "Label",
                "Game Lobby Page",
                "//div[contains(@class, 'balance_btn')]//p"
        );
        public static Component BalanceValue = new Component(
                "Balance Value",
                "Label",
                "Game Lobby Page",
                "//div[contains(@class, 'balance_btn')]//span[2]"
        );
        public static Component DealerNames = new Component(
                "List of Dealer Names",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//span[@class='dealer_name']"
        );
        public static Component TableNames = new Component(
                "List of Table Names",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//p[@class='table_name']"
        );
        public static Component FindATable = new Component(
                "Let's find a table and start betting.",
                "Label",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'find a table and start betting')]"
        );
        public static Component FirstNumberInRoadMap = new Component(
                "First Number In RoadMap",
                "Label",
                "Game Lobby Page",
                tablesPath + "[1]//ul[1]//li[1]"
        );
        public static Component RedCounters = new Component(
                "List of Red Counters",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='line_statistics']//div[1]//span[2]"
        );
        public static Component BlackCounters = new Component(
                "List of Black Counters",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='line_statistics']//div[2]//span[2]"
        );
        public static Component ZeroCounters = new Component(
                "List of Zero Counters",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='line_statistics']//div[3]//span[2]"
        );
        public static Component TotalRoundCounters = new Component(
                "List of Total Round Counters",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer station']//div[@class='line_statistics']//div[4]//span[3]"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getDealerTable(String dealsOrTable) {
            return new Component(
                    dealsOrTable + " Dealer Table",
                    "Container",
                    "Game Lobby Page",
                    tablesPath + "//p[(contains(text(), '" +
                            dealsOrTable + "'))]/ancestor::div[2]"
            );
        }
        public static Component getAllCounters(String dealsOrTable) {
            return new Component(
                    "List of All Counters in " + dealsOrTable + " Dealer Table",
                    "Label",
                    "Game Lobby Page",
                    tablesPath + "//p[(contains(text(), '" + dealsOrTable +
                            "'))]/ancestor::div[2]//div[@class='line_statistics']//div//span[@class='number']"
            );
        }
        public static Component getTotalRoundCounter(String dealsOrTable) {
            return new Component(
                    "Total Round Counter in " + dealsOrTable + " Dealer Table",
                    "Label",
                    "Game Lobby Page",
                    tablesPath + "//p[(contains(text(), '" + dealsOrTable +
                            "'))]/ancestor::div[2]//div[@class='line_statistics']//div[4]//span[3]"
            );
        }
    }

}
