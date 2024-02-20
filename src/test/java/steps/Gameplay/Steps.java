package steps.Gameplay;

import globals.TestMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.Gameplay.*;
import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.EventHandler;
import utilities.handlers.PrintHandler;
import utilities.handlers.WaitHandler;

public class Steps {

    @When("Do {string}")
    public void iDo(String step) {
        switch (step) {
            case "Move The Sliding Bar" -> EventHandler.scroll(GameLobby.Label.FirstNumberInRoadMap);
            case "Not Bet For 8 Consecutive Rounds" -> PrintHandler.printInfo("Test Case 19 - Do Step Is Included In Verify Step");
            case "Not Bet For 9 Consecutive Rounds" -> PrintHandler.printInfo("Test Case 20 - Do Step Is Included In Verify Step");
        }
    }

    @When("Click {string}")
    public void iClick(String step) {
        switch (step) {
            case "On Each Chip" -> PrintHandler.printInfo("Test Case 6 - Click Step Is Included In Verify Step");
            case "The Back Button" -> GameTest25.clickTheBackButton();
        }
    }

    @When("Wait {string}")
    public void iWait(String step) {
        switch (step) {
            case "Until New Round Starts", "Until Drawing Phase Done", "Until Bet Wins", "Until Bet Loses" ->
                    WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
            case "Until Timer Less Than Ten Seconds" -> TestMethod.waitBettingPhase(10, true);
        }
    }

    @When("Place {string}")
    public void iPlace(String step) {
        switch (step) {
            case "A Bet On Each Betting Option" -> PrintHandler.printInfo("Test Case 8 - Place Step Is Included In Verify Step");
            case "A Bet On Any Betting Options" -> Gameplay.placeABetOnAnyBettingOptions();
            case "And Confirm Any Betting Options" -> Gameplay.placeAndConfirmAnyBettingOptions();
            case "And Confirm Bet Again" -> PrintHandler.printInfo("Test Case 11 - Place Step Is Included In Verify Step");
            case "A Bet That Exceeds Maximum Bet", "A Maximum Bet On Any Betting Options" -> Gameplay.placeAndConfirmAnyBettingOptions(true);
            case "A Minimum Bet On Any Betting Options" -> Gameplay.placeAndConfirmAnyBettingOptions(false);
        }
    }

    @Then("Verify {string}")
    public void iVerify(String step) {
        switch (step) {
            case "The Behavior Of Sliding Bar In Lobby" -> GameTest2.verify();
            case "The Behavior Of The Game After Joining Table" -> GameTest3.verify();
            case "The Behavior Of The Game After Joining Table With Betting Phase Open" -> GameTest4.verify();
            case "The Behavior Of The Game After Joining Table With Betting Phase Close" -> GameTest5.verify();
            case "The Behavior Of Chips After Clicking On Each Chips" -> GameTest6.verify();
            case "The Behavior Of The Game When New Round Is Started" -> GameTest7.verify();
            case "The Behavior Of The Game When Placed Bet On Each Betting Options" -> GameTest8.verify();
            case "The Behavior Of The Game When Placed Bet On Any Betting Option" -> GameTest9.verify();
            case "The Behavior Of Action Buttons When Placed Bet" -> GameTest10.verify();
            case "The Behavior Of The Game When Confirmed Bet Then Place And Confirm Bet Again" -> GameTest11.verify();
            case "The Behavior Of The Game When Betting Phase Closed" -> GameTest12.verify();
            case "The Behavior Of The Game When Placed Bet And Did Not Confirm" -> GameTest13.verify();
            case "The Behavior Of The Game When Placed Bet And Did Not Confirm Until Less Than 10 Seconds" -> GameTest14.verify();
            case "The Behavior Of The Game When Drawing Phase Done" -> GameTest15.verify();
            case "The Behavior Of The Game When Wins Round" -> GameTest16.verify();
            case "The Behavior Of The Game When Loses Round" -> GameTest17.verify();
            case "The Behavior Of The Game When Did Not Bet For 8 Rounds" -> GameTest19.verify();
            case "The Behavior Of The Game When Did Not Bet For 9 Rounds" -> GameTest20.verify();
            case "The Behavior Of The Game When Placed Bet That Exceed Maximum Limit" -> GameTest21.verify();
            case "The Behavior Of Double Button When Placed Minimum Bet On Any Betting Options" -> GameTest22.verify();
            case "The Behavior Of Double Button When Placed Maximum Bet On Any Betting Options" -> GameTest23.verify();
            case "The Behavior Of The Game When Click Back Button While Confirmed Bet" -> GameTest25.verify();
            case "The Behavior Of Betting Timer When Its 10 Seconds Below" -> GameTest28.verify();
        }
    }

}