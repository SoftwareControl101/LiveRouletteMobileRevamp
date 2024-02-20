package pages;

import utilities.objects.Component;

public class LimitsAndPayouts {

    /***************************************************************************************************************
     * These are the button components on the Limits And Payouts Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Limits And Payouts Page",
                "//div[@class='nav_bar']//button[@class='back_btn']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Limits And Payouts Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component TableName = new Component(
                "Table Name",
                "Label",
                "Limits And Payouts Page",
                "//h3[contains(normalize-space(), 'Roulette')]"
        );
        public static Component TableLimit = new Component(
                "Table Limit",
                "Label",
                "Limits And Payouts Page",
                "//h3[contains(normalize-space(), 'Roulette')]//span"
        );
        public static Component StraightUpLimit = new Component(
                "Straight Up Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Straight-up']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component StraightUpPayout = new Component(
                "Straight Up Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Straight-up']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component EvenChanceLimit = new Component(
                "Even Chance Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Even Chance']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component EvenChancePayout = new Component(
                "Even Chance Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Even Chance']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component DozenColumnLimit = new Component(
                "Dozen Column Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Dozen/Column']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component DozenColumnPayout = new Component(
                "Dozen Column Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Dozen/Column']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component SplitLimit = new Component(
                "Split Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Split']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component SplitPayout = new Component(
                "Split Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Split']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component StreetLimit = new Component(
                "Street Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Street']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component StreetPayout = new Component(
                "Street Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Street']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component SixLineLimit = new Component(
                "Six Line Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Six Line']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component SixLinePayout = new Component(
                "Six Line Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Six Line']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component CornerZeroSectionLimit = new Component(
                "Corner Zero Section Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Corner/Zero Section']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component CornerZeroSectionPayout = new Component(
                "Corner Zero Section Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Corner/Zero Section']/ancestor::div[1]//div[@class='row_item'][3]"
        );
        public static Component ZeroCornerLimit = new Component(
                "Zero Corner Limit",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Zero Corner']/ancestor::div[1]//div[@class='row_item'][2]"
        );
        public static Component ZeroCornerPayout = new Component(
                "Zero Corner Payout",
                "Label",
                "Limits And Payouts Page",
                "//div[normalize-space()='Zero Corner']/ancestor::div[1]//div[@class='row_item'][3]"
        );
    }

}
