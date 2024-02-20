package steps.Payout;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import modules.Payout.*;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.FileHandler;
import utilities.interfaces.PayoutCase;
import utilities.settings.Constants;
import utilities.settings.Variables;

import java.util.ArrayList;
import java.util.List;

public class Steps {

    @Then("I Verify The Mapping Of Betting Options")
    public void VerifyTheMappingOfBettingOptions() {
        PayoutTest1.verify();
    }

    @Then("I Place A Bet Until There Is A Round Result For All Payouts")
    public void iPlaceABetUntilThereIsARoundResultForAllPayouts(DataTable dataTable) {
        List<String> betOptions = dataTable.asList(String.class);
        PayoutWait.waitUntilWins(50, getFirstBatch(betOptions));
        PayoutWait.waitUntilWins(5, getSecondBatch(betOptions));
        FileHandler.TxtFile.write(Variables.getTestResultList(), Constants.Directory.PAYOUT_PATH);
        EventHandler.click(DealerTable.Button.Back);
    }

    private List<PayoutCase> getFirstBatch(List<String> betOptions) {
        List<PayoutCase> payoutCases = new ArrayList<>();
        for (String betOption : betOptions) {
            switch (betOption) {
                case "Red" -> payoutCases.add(new PayoutTest2());
                case "Black" -> payoutCases.add(new PayoutTest3());
                case "Even" -> payoutCases.add(new PayoutTest4());
                case "Odd" -> payoutCases.add(new PayoutTest5());
                case "Low" -> payoutCases.add(new PayoutTest6());
                case "High" -> payoutCases.add(new PayoutTest7());
                case "1st Dozen" -> payoutCases.add(new PayoutTest8());
                case "2nd Dozen" -> payoutCases.add(new PayoutTest9());
                case "3rd Dozen" -> payoutCases.add(new PayoutTest10());
                case "1st Column" -> payoutCases.add(new PayoutTest11());
                case "2nd Column" -> payoutCases.add(new PayoutTest12());
                case "3rd Column" -> payoutCases.add(new PayoutTest13());
                case "Street" -> payoutCases.add(new PayoutTest16());
                case "Corner" -> payoutCases.add(new PayoutTest17());
                case "Six Line" -> payoutCases.add(new PayoutTest18());
                case "Zero Section" -> payoutCases.add(new PayoutTest19());
                case "Zero Corner" -> payoutCases.add(new PayoutTest20());
            }
        }
        return payoutCases;
    }

    private List<PayoutCase> getSecondBatch(List<String> betOptions) {
        List<PayoutCase> payoutCases = new ArrayList<>();
        for (String betOption : betOptions) {
            switch (betOption) {
                case "Straight Up" -> payoutCases.add(new PayoutTest14());
                case "Split" -> payoutCases.add(new PayoutTest15());
            }
        }
        return payoutCases;
    }

    @Then("I Verify The Payout Calculation Of {string} Betting Option")
    public void iVerifyThePayoutCalculationOfBettingOption(String betOption) {
        switch (betOption) {
            case "Red" -> PayoutWait.verify(2);
            case "Black" -> PayoutWait.verify(3);
            case "Even" -> PayoutWait.verify(4);
            case "Odd" -> PayoutWait.verify(5);
            case "Low" -> PayoutWait.verify(6);
            case "High" -> PayoutWait.verify(7);
            case "1st Dozen" -> PayoutWait.verify(8);
            case "2nd Dozen" -> PayoutWait.verify(9);
            case "3rd Dozen" -> PayoutWait.verify(10);
            case "1st Column" -> PayoutWait.verify(11);
            case "2nd Column" -> PayoutWait.verify(12);
            case "3rd Column" -> PayoutWait.verify(13);
            case "Straight Up" -> PayoutWait.verify(14);
            case "Split" -> PayoutWait.verify(15);
            case "Street" -> PayoutWait.verify(16);
            case "Corner" -> PayoutWait.verify(17);
            case "Six Line" -> PayoutWait.verify(18);
            case "Zero Section" -> PayoutWait.verify(19);
            case "Zero Corner" -> PayoutWait.verify(20);
        }
    }

}
