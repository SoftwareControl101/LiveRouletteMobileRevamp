package pages;

import utilities.objects.Component;

public class DealerTable {

    /***************************************************************************************************************
     * These are the container components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component Announcement = new Component(
                "Announcement",
                "Container",
                "Dealer Table Page",
                "//div[@class='news_ticker']"
        );
        public static Component Timer = new Component(
                "Timer",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'timer_small')]"
        );
        public static Component BettingOptions = new Component(
                "Betting Options",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class,'roulette_bet_options')]"
        );
        public static Component WinResult = new Component(
                "Win Result",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class,'num_bet_option') and contains(@class, 'win')]"
        );
        public static Component BetResult = new Component(
                "Bet Result",
                "Container",
                "Dealer Table Page",
                "//div[@class='bet_result_roulette']"
        );
        public static Component Notification = new Component(
                "Notification",
                "Container",
                "Dealer Table Page",
                "//div[@class='snack_bar']"
        );
        public static Component RedBettingChip = new Component(
                "Red Betting Chip",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'side_bet_option_red')]//div[contains(@class, 'chip chip')]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Dealer Table Page",
                "//button[@class='back_btn']"
        );
        public static Component SkipWelcome = new Component(
                "Skip Welcome",
                "Button",
                "Dealer Table Page",
                "//button[contains(@class,'welcome_skip_button')]"
        );
        public static Component HideShowBalance = new Component(
                "Hide/Show Balance",
                "Button",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]"
        );
        public static Component Menu = new Component(
                "Menu",
                "Button",
                "Dealer Table Page",
                "//button[@class='menu']"
        );
        public static Component SwitchTable = new Component(
                "Switch Table",
                "Button",
                "Dealer Table Page",
                "//button[@class='tool_btn jump_table']"
        );
        public static Component ExpandShrink = new Component(
                "Expand/Shrink",
                "Button",
                "Dealer Table Page",
                "//div[@class='side_section_bottom']//button[1]"
        );
        public static Component TableLimit = new Component(
                "Table Limit",
                "Button",
                "Dealer Table Page",
                "//div[@class='side_section_bottom']//button[2]"
        );
        public static Component Statistics = new Component(
                "Statistics",
                "Button",
                "Dealer Table Page",
                "//div[@class='side_section_bottom']//button[3]"
        );
        public static Component Undo = new Component(
                "Undo",
                "Button",
                "Dealer Table Page",
                "//div[@class='pattern']//button[contains(@class, 'btn_cancel')]"
        );
        public static Component Double = new Component(
                "Double",
                "Button",
                "Dealer Table Page",
                "//button[contains(@class, 'btn_double')]"
        );
        public static Component Confirm = new Component(
                "Confirm",
                "Button",
                "Dealer Table Page",
                "//button[contains(@class, 'btn_') and contains(@class, 'confirm')]"
        );
        public static Component EditChips = new Component(
                "Edit Chips",
                "Button",
                "Dealer Table Page",
                "//div[@class='chip_set']//li[contains(@data-gtm, 'Btn_ClickChipCustomize')]"
        );
        public static Component ChipOptions = new Component(
                "List of Chip Options",
                "Button",
                "Dealer Table Page",
                "//div[@class='chip_set']//li[not(contains(@data-gtm, 'Btn_ClickChipCustomize'))]"
        );
        public static Component ActionButtons = new Component(
                "List of Action Buttons",
                "Button",
                "Dealer Table Page",
                "//div[@class='pattern']//button"
        );
        public static Component PopUpConfirm = new Component(
                "PopUp Confirm",
                "Button",
                "Dealer Table Page",
                "//div[@class='popUp']//button[@class='confirm']"
        );
        public static Component PopUpNotNow = new Component(
                "PopUp Not Now",
                "Button",
                "Dealer Table Page",
                "//div[@class='popUp']//button[normalize-space()='Not Now']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component WelcomeAndGoodLuck = new Component(
                "Welcome and good luck.",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Welcome and good luck')]"
        );
        public static Component ShowTimer = new Component(
                "Show Timer",
                "Label",
                "Dealer Table Page",
                "//p[@id='showTimer']"
        );
        public static Component PlaceYourBetsPlease = new Component(
                "Place your bets please",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Place your bets please')]"
        );
        public static Component ShowDealing = new Component(
                "Show Dealing",
                "Label",
                "Dealer Table Page",
                "//p[@id='showDealingWording']"
        );
        public static Component NoMoreBets = new Component(
                "No more bets",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'No more bets')]"
        );
        public static Component TableInfo = new Component(
                "Table Info",
                "Label",
                "Dealer Table Page",
                "//p[@class='table_info']"
        );
        public static Component TotalBet = new Component(
                "Total Bet",
                "Label",
                "Dealer Table Page",
                "//p[@class='total_bet']"
        );
        public static Component BalanceText = new Component(
                "Balance Text",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]//p"
        );
        public static Component BalanceValue = new Component(
                "Balance Value",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]//span[2]"
        );
        public static Component BetResultNumber = new Component(
                "Bet Result Number",
                "Label",
                "Dealer Table Page",
                "//div[@class='bet_result_roulette']//li[3]"
        );
        public static Component BetResultLeftNumber = new Component(
                "Bet Result Left Number",
                "Label",
                "Dealer Table Page",
                "//div[@class='bet_result_roulette']//li[2]"
        );
        public static Component BetResultRightNumber = new Component(
                "Bet Result Right Number",
                "Label",
                "Dealer Table Page",
                "//div[@class='bet_result_roulette']//li[4]"
        );
        public static Component FirstNumberInResultPanel = new Component(
                "First Number In Result Panel",
                "Label",
                "Dealer Table Page",
                "//div[@class='roulette_line_roadmap']//li[1]//p[1]"
        );
        public static Component BetsAccepted = new Component(
                "Bets accepted.",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Bets accepted.')]"
        );
        public static Component ConfirmNow = new Component(
                "Confirm now?",
                "Label",
                "Dealer Table Page",
                "//p[@class='popUp_title']"
        );
        public static Component BettingIsClosing = new Component(
                "Betting is closing.",
                "Label",
                "Dealer Table Page",
                "//div[@class='popUp']//p[contains(normalize-space(), 'Betting is closing.')]"
        );
        public static Component WonValue = new Component(
                "Won Value",
                "Label",
                "Dealer Table Page",
                "//p[@class='you_won_amount_text']"
        );
        public static Component WonText = new Component(
                "Won Text",
                "Label",
                "Dealer Table Page",
                "//div[@class='you_won_title ribbon']"
        );
        public static Component GiveItATry = new Component(
                "You haven't bet for a long time. Give it a try?",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Give it a try?')]"
        );
        public static Component ExceededTheMaxBet = new Component(
                "You've exceeded the max bet amount.",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'exceeded the max bet amount.')]"
        );
        public static Component YourBetsAreBeingSettled = new Component(
                "Your bets are being settled right now. Please wait.",
                "Label",
                "Dealer Table Page",
                "//p[contains(text(),'Your bets are being settled right now. Please wait.')]"
        );
        public static Component RememberedYourChipSettings = new Component(
                "Remembered your chip settings.",
                "Label",
                "Dealer Table Page",
                "//p[contains(text(),'remembered your chip settings.')]"
        );
        public static Component NumbersInResultPanel = new Component(
                "List of Numbers In Result Panel",
                "Label",
                "Dealer Table Page",
                "(//div[contains(@class, 'roulette_line_roadmap')]//p)[position() <= 12]"
        );
    }

    /***************************************************************************************************************
     * These are the betting options on the Dealer Table Page.
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
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option side_bet_option side_bet_option_" + sideBet + "')]"
            );
        }
        public static Component getColumn(int column) {
            return new Component(
                    switch (column) {
                        case 1 -> "1st Column Betting Option";
                        case 2 -> "2nd Column Betting Option";
                        case 3 -> "3rd Column Betting Option";
                        default -> "";
                    },
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option col_bet_option" +
                            " col_bet_option_2to1_" + column + "')]"
            );
        }
        public static Component getNumber(int number) {
            return new Component(
                    "Straight Up #" + number + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_" + number + "')][1]"
            );
        }
        public static Component getSplit(int[][] split) {
            int[] position = split[0];
            int[] numbers = split[1];
            return new Component(
                    "Split #" + numbers[0] + " & #" + numbers[1] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
        public static Component getStreet(int[][] street) {
            int[] position = street[0];
            int[] numbers = street[1];
            return new Component(
                    "Street #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
        public static Component getCorner(int[][] corner) {
            int[] position = corner[0];
            int[] numbers = corner[1];
            return new Component(
                    "Corner #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
        public static Component getSixLine(int[][] sixLine) {
            int[] position = sixLine[0];
            int[] numbers = sixLine[1];
            return new Component(
                    "Six Line #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + ", #" +
                    numbers[4] + ", #" + numbers[5] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
        public static Component getZeroSection(int[][] zeroSection) {
            int[] position = zeroSection[0];
            int[] numbers = zeroSection[1];
            return new Component(
                    "Zero Section #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
        public static Component getZeroCorner(int[][] zeroCorner) {
            int[] position = zeroCorner[0];
            int[] numbers = zeroCorner[1];
            return new Component(
                    "Zero Corner #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Option",
                    "Button",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]"
            );
        }
    }

    /***************************************************************************************************************
     * These are the betting chips on the Dealer Table Page.
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
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option side_bet_option side_bet_option_" + sideBet + "')]" +
                            chipPath
            );
        }
        public static Component getColumn(int column) {
            return new Component(
                    switch (column) {
                        case 1 -> "1st Column Betting Chip";
                        case 2 -> "2nd Column Betting Chip";
                        case 3 -> "3rd Column Betting Chip";
                        default -> "";
                    },
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option col_bet_option" +
                            " col_bet_option_2to1_" + column + "')]" +
                            chipPath
            );
        }
        public static Component getNumber(int number) {
            return new Component(
                    "Straight Up #" + number + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_" + number + "')][1]" +
                            chipPath
            );
        }
        public static Component getSplit(int[][] split) {
            int[] position = split[0];
            int[] numbers = split[1];
            return new Component(
                    "Split #" + numbers[0] + " & #" + numbers[1] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
        public static Component getStreet(int[][] street) {
            int[] position = street[0];
            int[] numbers = street[1];
            return new Component(
                    "Street #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
        public static Component getCorner(int[][] corner) {
            int[] position = corner[0];
            int[] numbers = corner[1];
            return new Component(
                    "Corner #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
        public static Component getSixLine(int[][] sixLine) {
            int[] position = sixLine[0];
            int[] numbers = sixLine[1];
            return new Component(
                    "Six Line #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + ", #" +
                            numbers[4] + ", #" + numbers[5] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
        public static Component getZeroSection(int[][] zeroSection) {
            int[] position = zeroSection[0];
            int[] numbers = zeroSection[1];
            return new Component(
                    "Zero Section #" + numbers[0] + ", #" + numbers[1] + ", #" +
                            numbers[2] + ", & #" + numbers[3] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
        public static Component getZeroCorner(int[][] zeroCorner) {
            int[] position = zeroCorner[0];
            int[] numbers = zeroCorner[1];
            return new Component(
                    "Zero Corner #" + numbers[0] + ", #" + numbers[1] + ", & #" + numbers[2] + " Betting Chip",
                    "Container",
                    "Dealer Table Page",
                    "//div[contains(@class, 'bet_option num_bet_option num_bet_option_"
                            + position[0] + "')][1]" +
                            "//div[contains(@class, 'bet_option_chip_position pos_"
                            + position[1] + "')]" +
                            chipPath
            );
        }
    }
}
