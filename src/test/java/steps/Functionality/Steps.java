package steps.Functionality;

import globals.TestMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.Functionality.*;
import pages.*;
import utilities.handlers.EventHandler;
import utilities.handlers.PrintHandler;
import utilities.handlers.WaitHandler;

public class Steps {

    @When("I Check {string}")
    public void iCheck(String step) {
        switch (step) {
            case "The Round Result History" -> FuncTest1.checkTheRoundResultHistory();
            case "All Round Counters" -> FuncTest1.checkAllRoundCounters();
            case "The Default Chips" -> FuncTest27.checkTheDefaultChips();
            case "The Betting Chip" -> FuncTest32.checkTheBettingChip();
            case "The Placed Bet" -> FuncTest37.checkThePlacedBet();
        }
    }

    @When("I Click {string}")
    public void iClick(String step) {
        switch (step) {
            case "The Switch Table Button" -> EventHandler.click(DealerTable.Button.SwitchTable, 2);
            case "The Back Button On Game" -> EventHandler.click(DealerTable.Button.Back, 2);
            case "The Show/Hide Balance Button" -> EventHandler.click(GameLobby.Button.HideShowBalance, 2);
            case "On Each Table Limit" -> PrintHandler.printInfo("Test Case 3 - Click Step Is Included In Verify Step");
            case "The Back Button On Lobby" -> EventHandler.click(GameLobby.Button.Back, 2);
            case "The Menu Button" -> EventHandler.click(DealerTable.Button.Menu, 2);
            case "The Confirm Button" -> EventHandler.click(DealerTable.Button.Confirm, 2);
            case "The Running Tab" -> EventHandler.click(MyBets.Button.Running, 2);
            case "On Each Category in Help" -> PrintHandler.printInfo("Test Case 15 - Click Step Is Included In Verify Step");
            case "The Table Limit Button" -> EventHandler.click(DealerTable.Button.TableLimit, 2);
            case "The Statistics Button" -> EventHandler.click(DealerTable.Button.Statistics, 2);
            case "The Expand Shrink Button" -> EventHandler.click(DealerTable.Button.ExpandShrink, 2);
            case "The Edit Chips Button" -> EventHandler.click(DealerTable.Button.EditChips, 2);
            case "The Save Button" -> EventHandler.click(ChipSettings.Button.Save, 2);
            case "The Undo Button" -> EventHandler.click(DealerTable.Button.Undo, 2);
            case "The Double Button" -> EventHandler.click(DealerTable.Button.Double, 2);
            case "The Popup Confirm Button" -> EventHandler.click(DealerTable.Button.PopUpConfirm, 2);
            case "The Popup Not Now Button" -> PrintHandler.printInfo("Test Case 42 - Click Step Is Included In Verify Step");
            case "The Information Button On Statistics" -> EventHandler.click(Statistics.Button.OpenInformation, 2);
            case "The Close Button On Statistics Information" -> EventHandler.click(Statistics.Button.CloseInformation, 2);
            case "The Back Button On Statistics" -> EventHandler.click(Statistics.Button.CloseStatistics, 2);
        }
    }

    @When("I Go {string}")
    public void iGo(String step) {
        switch (step) {
            case "Back To The Game Lobby" -> Functionality.goBackToTheGameLobby();
            case "To My Bets" -> Functionality.goToMyBets();
            case "To The Bet Details" -> Functionality.goToTheBetDetails();
            case "To Limits And Payouts" -> Functionality.goToLimitsAndPayouts();
            case "To Help" -> Functionality.goToHelp();
            case "To Settings" -> Functionality.goToSettings();
            case "To Other Roulette Table" -> FuncTest19.goToOtherRouletteTable();
            case "To Other Live Products" -> FuncTest20.goToOtherLiveProducts();
            case "To Other Live Products Table" -> FuncTest21.goToOtherLiveProductsTable();
            case "To Other Table Limit Table" -> FuncTest23.goToOtherTableLimitTable();
        }
    }

    @When("I Enter {string}")
    public void iEnter(String step) {
        switch (step) {
            case "Any Dealer Table With 300 Rounds" -> FuncTest2.enterAnyDealerTableWith300Rounds();
            case "Any Dealer Table" -> FuncTest6.enterAnyDealerTable();
            case "The Dealer Table With High Table Limits" -> FuncTest33.enterTheDealerTableWithHighTableLimits();
        }
    }

    @When("I Wait {string}")
    public void iWait(String step) {
        switch (step) {
            case "Until Succeeding Round Ends" -> FuncTest2.waitUntilSucceedingRoundEnds();
            case "Until Round Is Over" -> Functionality.waitUntilRoundIsOver();
            case "Until Betting Phase" -> TestMethod.waitBettingPhase(10, false);
            case "Until Betting Timer Starts" -> WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 150);
            case "Until Betting Timer Ends" -> TestMethod.waitBettingPhase(1, true);
            case "Until Bet Wins" -> FuncTest39.waitUntilBetWins();
            case "Until Betting Timer Reaches Last 10 Seconds" -> Functionality.waitUntilBettingTimerReachesLastSeconds();
        }
    }

    @When("I Place {string}")
    public void iPlace(String step) {
        switch (step) {
            case "A Bet On Any Betting Options" -> Functionality.placeABetOnAnyBettingOptions();
            case "And Undo Any Betting Options" -> FuncTest30.placeAndUndoAnyBettingOptions();
            case "A Bet On Two Or More Betting Options" -> FuncTest30.placeABetOnTwoOrMoreBettingOptions();
            case "A Bet On Four Or More Betting Options" -> FuncTest31.placeABetOnFourOrMoreBettingOptions();
            case "And Confirm Any Betting Options" -> Functionality.placeAndConfirmAnyBettingOptions();
        }
    }

    @When("I Do {string}")
    public void iDo(String step) {
        switch (step) {
            case "Remove Any Chips On My Chips" -> FuncTest28.removeAnyChipsOnMyChips();
            case "Select Any Chips On Chips Selections" -> FuncTest28.selectAnyChipsOnChipsSelections();
            case "Replace Any Chip On My Chips" -> FuncTest29.replaceAnyChipOnMyChips();
            case "Press And Hold The Undo Button" -> EventHandler.pressAndHold(DealerTable.Button.Undo, 3);
            case "Switch And Join Another Table" -> FuncTest34.switchAndJoinAnotherTable();
        }
    }

    @Then("I Verify {string}")
    public void iVerify(String step) {
        switch (step) {
            case "The Data Displayed Besides Dealer Thumbnail On The Game Lobby" -> FuncTest1.verify();
            case "The Total Round Counter On The Game Lobby After The Succeeding Rounds" -> FuncTest2.verify();
            case "The Functionality After Clicking Show/Hide Balance Button" -> FuncTest3.verify(true);
            case "The Functionality After Re-clicking Show/Hide Balance Button" -> FuncTest3.verify(false);
            case "The Functionality After Clicking Each Table Limit Button" -> FuncTest4.verify();
            case "The Functionality After Clicking The Back Button On The Game Lobby" -> FuncTest5.verify();
            case "The Functionality After Clicking Any Table" -> FuncTest6.verify();
            case "The Functionality After Clicking The Menu Button" -> FuncTest8.verify();
            case "The Functionality After Clicking The My Bets In The Menu" -> FuncTest9.verify();
            case "The Functionality Of Settled Round In My Bets In The Menu" -> FuncTest10.verify();
            case "The Functionality After Clicking The Details Button In Settled Rounds" -> FuncTest11.verify();
            case "The Functionality Of Running Round In My Bets In The Menu" -> FuncTest12.verify();
            case "The Functionality After Clicking The Limits And Payouts In The Menu" -> FuncTest13.verify();
            case "The Functionality After Clicking The Help In The Menu" -> FuncTest14.verify();
            case "The Functionality After Clicking Each Category In The Menu" -> FuncTest15.verify(true);
            case "The Functionality After Re-clicking Each Category In The Menu" -> FuncTest15.verify(false);
            case "The Functionality After Clicking The Settings In The Menu" -> FuncTest16.verify();
            case "The Functionality After Clicking The Switch Table Button" -> FuncTest18.verify();
            case "The Functionality After Selecting Other Table In The Switch Table" -> FuncTest19.verify();
            case "The Functionality After Selecting Other Product In The Switch Table" -> FuncTest20.verify();
            case "The Functionality After Seating On Other Live Products Table" -> FuncTest21.verify();
            case "The Functionality After Clicking The Table Limit Button" -> FuncTest22.verify();
            case "The Functionality After Selecting Other Table Limit" -> FuncTest23.verify();
            case "The Functionality After Clicking The Statistics Button" -> FuncTest25.verify();
            case "The Functionality After Clicking Expand Shrink Button" -> FuncTest26.verify(true);
            case "The Functionality After Re-clicking Expand Shrink Button" -> FuncTest26.verify(false);
            case "The Functionality After Clicking The Edit Chips Button" -> FuncTest27.verify();
            case "The Functionality After Removing Betting Chips" -> FuncTest28.verify(true);
            case "The Functionality After Adding Betting Chips" -> FuncTest28.verify(false);
            case "The Functionality After Clicking The Save Button In Chip Settings" -> FuncTest29.verify();
            case "The Functionality After Clicking The Undo Button" -> FuncTest30.verify(false);
            case "The Functionality After Pressing And Holding The Undo Button" -> FuncTest31.verify();
            case "The Functionality After Clicking The Confirm Button" -> FuncTest32.verify();
            case "The Functionality Of The Confirm Button" -> FuncTest33.verify(true);
            case "The Functionality After Clicking The Top Up And Confirm Button" -> FuncTest33.verify(false);
            case "The Functionality Of The Switch Table When Betting In Multiple Tables" -> FuncTest34.verify(false);
            case "The Functionality Of The Betting Timer Once It Starts" -> FuncTest35.verify();
            case "The Functionality Of The Betting Timer Once It Ends" -> FuncTest36.verify();
            case "The Functionality After Clicking The Double Button" -> FuncTest37.verify();
            case "The Functionality Of Total Balance After Confirming Any Bets" -> FuncTest38.verify();
            case "The Functionality Of Total Balance After Winning Round" -> FuncTest39.verify();
            case "The Functionality After Betting Timer Reaches Last 10 Seconds And Not Confirming" -> FuncTest40.verify();
            case "The Functionality After Clicking The Confirm Button On Popup Message" -> FuncTest41.verify();
            case "The Functionality After Clicking The Not Now Button On Popup Message" -> FuncTest42.verify();
            case "The Functionality After Clicking The Information Button On Statistics" -> FuncTest44.verify();
            case "The Functionality After Clicking The Close Button On Statistics Information" -> FuncTest45.verify();
            case "The Functionality After Clicking The Back Button On Statistics" -> FuncTest46.verify();
            case "The Functionality After Clicking The Back Button On Game" -> FuncTest47.verify();
        }
    }

}
