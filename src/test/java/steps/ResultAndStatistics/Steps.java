package steps.ResultAndStatistics;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.ResultAndStatistics.*;
import pages.DealerTable;
import pages.GameLobby;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.FileHandler;
import utilities.interfaces.ResAndStatsCase;
import utilities.settings.Constants;
import utilities.settings.Variables;

import java.util.ArrayList;
import java.util.List;

public class Steps {

    @And("I Enter The Dealer Table With 300 Rounds")
    public void iEnterTheDealerTableWithRounds() {
        EventHandler.click(GameLobby.Method.getDealerTable("Deals 300"));
        EventHandler.click(DealerTable.Button.SkipWelcome, HandleCollection.WithException);
    }

    @When("I Place A Bet Until There Is A Round Result For All Results And Statistics")
    public void iPlaceABetUntilThereIsARoundResultForAllResultsAndStatistics(DataTable dataTable) {
        ResAndStatsWait.waitUntilWins(50, getBatch(dataTable.asList(String.class)));
        FileHandler.TxtFile.write(Variables.getTestResultList(), Constants.Directory.RESULT_AND_STATS_PATH);
        EventHandler.click(DealerTable.Button.Back);
    }

    private List<ResAndStatsCase> getBatch(List<String> betOptions) {
        List<ResAndStatsCase> resAndStatsCases = new ArrayList<>();
        for (String betOption : betOptions) {
            switch (betOption) {
                case "Result Panel" -> resAndStatsCases.add(new ResAndStatsTest1());
                case "Red Result" -> resAndStatsCases.add(new ResAndStatsTest2());
                case "Black Result" -> resAndStatsCases.add(new ResAndStatsTest3());
                case "Zero Result" -> resAndStatsCases.add(new ResAndStatsTest4());
                case "Red Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_1());
                case "Zero Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_2());
                case "Black Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_3());
                case "Odd Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_4());
                case "Even Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_5());
                case "High Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_6());
                case "Low Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_7());
                case "1st Dozen Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_8());
                case "2nd Dozen Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_9());
                case "3rd Dozen Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_10());
                case "1st Column Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_11());
                case "2nd Column Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_12());
                case "3rd Column Percentage" -> resAndStatsCases.add(new ResAndStatsTest5_13());
                case "Hot Numbers Win" -> resAndStatsCases.add(new ResAndStatsTest5_14());
                case "Cold Numbers Lose" -> resAndStatsCases.add(new ResAndStatsTest5_15());
                case "Cold Numbers Win" -> resAndStatsCases.add(new ResAndStatsTest5_16());
            }
        }
        return resAndStatsCases;
    }

    @Then("I Verify The Result Panel")
    public void iVerifyTheResultPanel() { ResAndStatsTest1.verify(); }

    @Then("I Verify The Result Panel When {string} Wins")
    public void iVerifyTheResultPanelWhenWins(String betOption) {
        switch (betOption) {
            case "Red" -> ResAndStatsTest2.verify();
            case "Black" -> ResAndStatsTest3.verify();
            case "Zero" -> ResAndStatsTest4.verify();
        }
    }

    @Then("I Verify The {string} Percentage Displayed")
    public void iVerifyThePercentageDisplayed(String betOption) {
        switch (betOption) {
            case "Red" -> ResAndStatsTest5_1.verify();
            case "Zero" -> ResAndStatsTest5_2.verify();
            case "Black" -> ResAndStatsTest5_3.verify();
            case "Odd" -> ResAndStatsTest5_4.verify();
            case "Even" -> ResAndStatsTest5_5.verify();
            case "High" -> ResAndStatsTest5_6.verify();
            case "Low" -> ResAndStatsTest5_7.verify();
            case "1st Dozen" -> ResAndStatsTest5_8.verify();
            case "2nd Dozen" -> ResAndStatsTest5_9.verify();
            case "3rd Dozen" -> ResAndStatsTest5_10.verify();
            case "1st Column" -> ResAndStatsTest5_11.verify();
            case "2nd Column" -> ResAndStatsTest5_12.verify();
            case "3rd Column" -> ResAndStatsTest5_13.verify();
        }
    }

    @Then("I Verify The {string} Numbers Displayed If They {string}")
    public void iVerifyTheNumbersDisplayedIfThey(String numbers, String result) {
        switch (result) {
            case "Win" -> {
                switch (numbers) {
                    case "Hot" -> ResAndStatsTest5_14.verify();
                    case "Cold" -> ResAndStatsTest5_16.verify();
                }
            }
            case "Lose" -> {
                switch (numbers) {
                    case "Hot" -> System.out.println();
                    case "Cold" -> ResAndStatsTest5_15.verify();
                }
            }
        }
    }

}
