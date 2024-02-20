package pages;

import utilities.objects.Component;

public class BetDetails {

    /***************************************************************************************************************
     * These are the container components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component BettingOptions = new Component(
                "Betting Options",
                "Container",
                "Bet Details Page",
                "//div[contains(@class,'roulette_bet_options')]"
        );
        public static Component WinBettingOptions = new Component(
                "List of Win Betting Options",
                "Container",
                "Bet Details Page",
                "//div[contains(@class, 'bet_option') and contains(@class, 'win')]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Bet Details Page",
                "//button[@class='back_btn']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component BetDetails = new Component(
                "Bet Details",
                "Label",
                "Bet Details Page",
                "//h2[normalize-space()='Bet Details']"
        );
        public static Component Stake = new Component(
                "Stake",
                "Label",
                "Bet Details Page",
                "//h3[normalize-space()='Stake']/ancestor::div[1]//p"
        );
        public static Component WinLoss = new Component(
                "Win/Loss",
                "Label",
                "Bet Details Page",
                "//h3[normalize-space()='Win/Loss']/ancestor::div[1]//p"
        );
        public static Component BettingChips = new Component(
                "List of Betting Chips",
                "Label",
                "Bet Details Page",
                "//div[contains(@class,'chip_text')]"
        );
    }

    /***************************************************************************************************************
     * These are the betting options on the Bet Details Page.
     ***************************************************************************************************************/

    public static class BettingOption {
        public static Component getSideBet(String sideBet) {
            return new Component(
                    switch (sideBet) {
                        case "red" -> "Red Betting Option";
                        case "black" -> "Black Betting Option";
                        case "even" -> "Even Betting Option";
                        case "odd" -> "Odd Betting Option";
                        case "1to18" -> "Low Betting Option";
                        case "19to36" -> "High Betting Option";
                        case "1st12" -> "1st Dozen Betting Option";
                        case "2nd12" -> "2nd Dozen Betting Option";
                        case "3rd12" -> "3rd Dozen Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Bet Details Page",
                    "//div[contains(@class, 'bet_option side_bet_option side_bet_option_" + sideBet + "')]"
            );
        }
    }

    /***************************************************************************************************************
     * These are the betting chips on the Bet Details Page.
     ***************************************************************************************************************/

    public static class BettingChip {
        static String chipPath = "//div[contains(@class, 'chip_text')]";
        public static Component getSideBet(String sideBet) {
            return new Component(
                    switch (sideBet) {
                        case "red" -> "Red Betting Chip";
                        case "black" -> "Black Betting Chip";
                        case "even" -> "Even Betting Chip";
                        case "odd" -> "Odd Betting Chip";
                        case "1to18" -> "Low Betting Chip";
                        case "19to36" -> "High Betting Chip";
                        case "1st12" -> "1st Dozen Betting Chip";
                        case "2nd12" -> "2nd Dozen Betting Chip";
                        case "3rd12" -> "3rd Dozen Betting Chip";
                        default -> "";
                    },
                    "Container",
                    "Bet Details Page",
                    "//div[contains(@class, 'bet_option side_bet_option side_bet_option_" + sideBet + "')]" +
                            chipPath
            );
        }
    }

}
