package pages;

import utilities.objects.Component;

public class Statistics {

    /***************************************************************************************************************
     * These are the container components on the Statistics Page.
     ***************************************************************************************************************/
    public static class Container {
        public static Component Statistics = new Component(
                "Statistics",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']"
        );
        public static Component AllResults = new Component(
                "All Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p"
        );
        public static Component RedResults = new Component(
                "Red Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[contains(@class, 'number_red')]"
        );
        public static Component ZeroResults = new Component(
                "Zero Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) = 0]"
        );
        public static Component BlackResults = new Component(
                "Black Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[contains(@class, 'number_black')]"
        );
        public static Component OddResults = new Component(
                "Odd Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) mod 2 != 0]"
        );
        public static Component EvenResults = new Component(
                "Even Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) mod 2 = 0 and number(.) != 0]"
        );
        public static Component LowResults = new Component(
                "Low Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) >= 1 and number(.) <= 18]"
        );
        public static Component HighResults = new Component(
                "High Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) >= 19 and number(.) <= 36]"
        );
        public static Component FirstDozenResults = new Component(
                "First Dozen Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) >= 1 and number(.) <= 12]"
        );
        public static Component SecondDozenResults = new Component(
                "Second Dozen Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) >= 13 and number(.) <= 24]"
        );
        public static Component ThirdDozenResults = new Component(
                "Third Dozen Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[number(.) >= 25 and number(.) <= 36]"
        );
        public static Component FirstColumnResults = new Component(
                "First Column Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li" +
                        "//p[number(.) = 1 or number(.) = 4 or number(.) = 7 or number(.) = 10 or " +
                        "number(.) = 13 or number(.) = 16 or number(.) = 19 or number(.) = 22 or number(.) = 25 or " +
                        "number(.) = 28 or number(.) = 31 or number(.) = 34]"
        );
        public static Component SecondColumnResults = new Component(
                "Second Column Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li" +
                        "//p[number(.) = 2 or number(.) = 5 or number(.) = 8 or number(.) = 11 or " +
                        "number(.) = 14 or number(.) = 17 or number(.) = 20 or number(.) = 23 or number(.) = 26 or " +
                        "number(.) = 29 or number(.) = 32 or number(.) = 35]"
        );
        public static Component ThirdColumnResults = new Component(
                "Third Column Results",
                "Container",
                "Statistics Page",
                "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li" +
                        "//p[number(.) = 3 or number(.) = 6 or number(.) = 9 or number(.) = 12 or " +
                        "number(.) = 15 or number(.) = 18 or number(.) = 21 or number(.) = 24 or number(.) = 27 or " +
                        "number(.) = 30 or number(.) = 33 or number(.) = 36]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Statistics Page.
     ***************************************************************************************************************/
    public static class Button {
        public static Component CloseStatistics = new Component(
                "Close Statistics",
                "Button",
                "Statistics Page",
                "//button[@class='statistics_header_close_btn']"
        );
        public static Component OpenInformation = new Component(
                "Close Information",
                "Button",
                "Statistics Page",
                "//button[@class='statistics_header_info_btn']"
        );
        public static Component CloseInformation = new Component(
                "Close Information",
                "Button",
                "Statistics Page",
                "//div[@class='info_modal_close']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Statistics Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component ShowTimer = new Component(
                "Show Timer",
                "Label",
                "Statistics Page",
                "//p[@id='showTimer']"
        );
        public static Component ShowDealing = new Component(
                "Show Dealing",
                "Label",
                "Statistics Page",
                "//p[@id='showDealingWording']"
        );
        public static Component RedPercentage = new Component(
                "Red Percentage",
                "Label",
                "Statistics Page",
                "//div[@class='color_diamond color_diamond_red']/following::div[contains(@class,'percentage')][1]"
        );
        public static Component ZeroPercentage = new Component(
                "Zero Percentage",
                "Label",
                "Statistics Page",
                "//div[@class='color_diamond color_diamond_green']/following::div[contains(@class,'percentage')][1]"
        );
        public static Component BlackPercentage = new Component(
                "Black Percentage",
                "Label",
                "Statistics Page",
                "//div[@class='color_diamond color_diamond_black']/following::div[contains(@class,'percentage')][1]"
        );
        public static Component OddPercentage = new Component(
                "Odd Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'ODD')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component EvenPercentage = new Component(
                "Even Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'EVEN')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component HighPercentage = new Component(
                "High Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'19-36')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component LowPercentage = new Component(
                "Low Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'1-18')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component FirstDozenPercentage = new Component(
                "First Dozen Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'1st Dozen')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component SecondDozenPercentage = new Component(
                "Second Dozen Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'2nd Dozen')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component ThirdDozenPercentage = new Component(
                "Third Dozen Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'3rd Dozen')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component FirstColPercentage = new Component(
                "First Column Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'1st Column')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component SecondColPercentage = new Component(
                "Second Column Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'2nd Column')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component ThirdColPercentage = new Component(
                "Third Column Percentage",
                "Label",
                "Statistics Page",
                "//div[contains(text(),'3rd Column')]/following::div[contains(@class,'percentage')][1]"
        );
        public static Component HotNumbers = new Component(
                "List of Hot Numbers",
                "Label",
                "Statistics Page",
                "//div[@class='temperaturList'][1]//div[@class='number_count']//div[1]"
        );
        public static Component HotCounters = new Component(
                "List of Hot Counters",
                "Label",
                "Statistics Page",
                "//div[@class='temperaturList'][1]//div[@class='number_count']//div[2]"
        );
        public static Component ColdNumbers = new Component(
                "List of Cold Numbers",
                "Label",
                "Statistics Page",
                "//div[@class='temperaturList'][2]//div[@class='number_count']//div[1]"
        );
        public static Component ColdCounters = new Component(
                "List of Cold Counters",
                "Label",
                "Statistics Page",
                "//div[@class='temperaturList'][2]//div[@class='number_count']//div[2]"
        );
        public static Component Info = new Component(
                "List of Information",
                "Label",
                "Statistics Page",
                "//div[@class='statistics_info_modal']//div[@class='info_list']"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Statistics Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getHotResults(int total) {
            return new Component(
                    "Hot Results",
                    "Container",
                    "Statistics Page",
                    "//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[text()='" + total + "']"
            );
        }
        public static Component getColdResults(int total) {
            return new Component(
                    "Cold Results",
                    "Container",
                    "Statistics Page",
                    "(//div[@class='statistics']//div[@class='roulette_line_roadmap']//li//p[text()='" +
                            total + "'])[position()=1]/ancestor::li/preceding-sibling::li"
            );
        }
    }

}
