@Functionality
Feature: Functionality

  Background:
    Given I Go To The Live Casino
    And I Join Live Roulette Revamp

  @FunctionalityTest1
  Scenario: FT Test 1: Checking The Data Displayed Besides Dealer Thumbnail On The Game Lobby
    When I Enter The Dealer Table
    And I Check "The Round Result History"
    And I Click "The Switch Table Button"
    And I Check "All Round Counters"
    And I Go "Back To The Game Lobby"
    Then I Verify "The Data Displayed Besides Dealer Thumbnail On The Game Lobby"

  @FunctionalityTest2
  Scenario: FT Test 2: Checking The Total Round Counter On The Game Lobby After The Succeeding Rounds
    When I Enter "Any Dealer Table With 300 Rounds"
    And I Wait "Until Succeeding Round Ends"
    And I Click "The Back Button On Game"
    Then I Verify "The Total Round Counter On The Game Lobby After The Succeeding Rounds"

  @FunctionalityTest3
  Scenario: FT Test 3: Checking The Functionality Of Show/Hide The Balance Button
    When I Click "The Show/Hide Balance Button"
    Then I Verify "The Functionality After Clicking Show/Hide Balance Button"
    When I Click "The Show/Hide Balance Button"
    Then I Verify "The Functionality After Re-clicking Show/Hide Balance Button"

  @FunctionalityTest4
  Scenario: FT Test 4: Checking The Functionality On Each Table Limit Button
    When I Click "On Each Table Limit"
    Then I Verify "The Functionality After Clicking Each Table Limit Button"

  @FunctionalityTest5
  Scenario: FT Test 5: Checking The Functionality Of The Back Button On The Game Lobby
    When I Click "The Back Button On Lobby"
    Then I Verify "The Functionality After Clicking The Back Button On The Game Lobby"

  @FunctionalityTest6
  Scenario: FT Test 6: Checking The Functionality Of Any Live Roulette Revamp Table
    When I Enter "Any Dealer Table"
    Then I Verify "The Functionality After Clicking Any Table"

  @FunctionalityTest8
  Scenario: FT Test 8: Checking The Functionality Of The Menu Button
    When I Enter The Dealer Table
    And I Click "The Menu Button"
    Then I Verify "The Functionality After Clicking The Menu Button"

  @FunctionalityTest9
  Scenario: FT Test 9: Checking The Functionality Of My Bets In The Menu
    When I Enter The Dealer Table
    And I Go "To My Bets"
    Then I Verify "The Functionality After Clicking The My Bets In The Menu"

  @FunctionalityTest10
  Scenario: FT Test 10: Checking The Functionality Of Settled Round In My Bets In The Menu
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Round Is Over"
    And I Go "To My Bets"
    Then I Verify "The Functionality Of Settled Round In My Bets In The Menu"

  @FunctionalityTest11
  Scenario: FT Test 11: Checking The Functionality Of The Details Button In Settled Rounds
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Round Is Over"
    And I Go "To My Bets"
    And I Go "To The Bet Details"
    Then I Verify "The Functionality After Clicking The Details Button In Settled Rounds"

  @FunctionalityTest12
  Scenario: FT Test 12: Checking The Functionality Of Running Round In My Bets In The Menu
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Go "To My Bets"
    And I Click "The Running Tab"
    Then I Verify "The Functionality Of Running Round In My Bets In The Menu"

  @FunctionalityTest13
  Scenario: FT Test 13: Checking The Functionality Of Limits And Payouts In The Menu
    When I Enter The Dealer Table
    And I Go "To Limits And Payouts"
    Then I Verify "The Functionality After Clicking The Limits And Payouts In The Menu"

  @FunctionalityTest14
  Scenario: FT Test 14: Checking The Functionality Of Help In The Menu
    When I Enter The Dealer Table
    And I Go "To Help"
    Then I Verify "The Functionality After Clicking The Help In The Menu"

  @FunctionalityTest15
  Scenario: FT Test 15: Checking The Functionality On Each Category In The Menu
    When I Enter The Dealer Table
    And I Go "To Help"
    And I Click "On Each Category in Help"
    Then I Verify "The Functionality After Clicking Each Category In The Menu"
    When I Click "On Each Category in Help"
    Then I Verify "The Functionality After Re-clicking Each Category In The Menu"

  @FunctionalityTest16
  Scenario: FT Test 16: Checking The Functionality Of Settings In The Menu
    When I Enter The Dealer Table
    And I Go "To Settings"
    Then I Verify "The Functionality After Clicking The Settings In The Menu"

  @FunctionalityTest18
  Scenario: FT Test 18: Checking The Functionality Of The Switch Table Button
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    Then I Verify "The Functionality After Clicking The Switch Table Button"

  @FunctionalityTest19
  Scenario: FT Test 19: Checking The Functionality After Selecting Other Table In The Switch Table
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    And I Go "To Other Roulette Table"
    Then I Verify "The Functionality After Selecting Other Table In The Switch Table"

  @FunctionalityTest20
  Scenario: FT Test 20: Checking The Functionality After Selecting Other Product In The Switch Table
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    And I Go "To Other Live Products"
    Then I Verify "The Functionality After Selecting Other Product In The Switch Table"

  @FunctionalityTest21
  Scenario: FT Test 21: Checking The Functionality After Seating On Other Live Products Table
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    And I Go "To Other Live Products Table"
    Then I Verify "The Functionality After Seating On Other Live Products Table"

  @FunctionalityTest22
  Scenario: FT Test 22: Checking The Functionality Of The Table Limit Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Table Limit Button"
    Then I Verify "The Functionality After Clicking The Table Limit Button"

  @FunctionalityTest23
  Scenario: FT Test 23: Checking The Functionality After Selecting Other Table Limit
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Table Limit Button"
    And I Go "To Other Table Limit Table"
    Then I Verify "The Functionality After Selecting Other Table Limit"

  @FunctionalityTest25
  Scenario: FT Test 25: Checking The Functionality Of The Statistics Button
    When I Enter The Dealer Table
    And I Click "The Statistics Button"
    Then I Verify "The Functionality After Clicking The Statistics Button"

  @FunctionalityTest26
  Scenario: FT Test 26: Checking The Functionality Of The Expand Shrink Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Expand Shrink Button"
    Then I Verify "The Functionality After Clicking Expand Shrink Button"
    When I Click "The Expand Shrink Button"
    Then I Verify "The Functionality After Re-clicking Expand Shrink Button"

  @FunctionalityTest27
  Scenario: FT Test 27: Checking The Functionality Of The Edit Chips Button
    When I Enter The Dealer Table
    And I Check "The Default Chips"
    And I Click "The Edit Chips Button"
    Then I Verify "The Functionality After Clicking The Edit Chips Button"

  @FunctionalityTest28
  Scenario: FT Test 28: Checking The Functionality After Changing Betting Chips
    When I Enter The Dealer Table
    And I Click "The Edit Chips Button"
    And I Do "Remove Any Chips On My Chips"
    Then I Verify "The Functionality After Removing Betting Chips"
    When I Do "Select Any Chips On Chips Selections"
    Then I Verify "The Functionality After Adding Betting Chips"

  @FunctionalityTest29
  Scenario: FT Test 29: Checking The Functionality Of The Save Button In Chip Settings
    When I Enter The Dealer Table
    And I Click "The Edit Chips Button"
    And I Do "Replace Any Chip On My Chips"
    And I Click "The Save Button"
    Then I Verify "The Functionality After Clicking The Save Button In Chip Settings"

  @FunctionalityTest30
  Scenario: FT Test 30: Checking The Functionality Of The Undo Button
    When I Enter The Dealer Table
    And I Place "And Undo Any Betting Options"
    And I Place "A Bet On Two Or More Betting Options"
    And I Click "The Undo Button"
    Then I Verify "The Functionality After Clicking The Undo Button"

  @FunctionalityTest31
  Scenario: FT Test 31: Checking The Functionality Of Undo Button When Press And Hold
    When I Enter The Dealer Table
    And I Place "A Bet On Four Or More Betting Options"
    And I Do "Press And Hold The Undo Button"
    Then I Verify "The Functionality After Pressing And Holding The Undo Button"

  @FunctionalityTest32
  Scenario: FT Test 32: Checking The Functionality Of The Confirm Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Check "The Betting Chip"
    And I Click "The Confirm Button"
    Then I Verify "The Functionality After Clicking The Confirm Button"

  @FunctionalityTest33
  Scenario: FT Test 33: Checking The Functionality Of The Top up And Confirm Button
    When I Click "The High Table Limits"
    And I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    Then I Verify "The Functionality Of The Confirm Button"
    And I Click "The Confirm Button"
    Then I Verify "The Functionality After Clicking The Top Up And Confirm Button"

  @FunctionalityTest34
  Scenario: FT Test 34: Checking The Functionality Of The Switch Table When Betting In Multiple Tables
    When I Enter The Dealer Table
    And I Place "And Confirm Any Betting Options"
    And I Do "Switch And Join Another Table"
    And I Place "And Confirm Any Betting Options"
    Then I Verify "The Functionality Of The Switch Table When Betting In Multiple Tables"

  @FunctionalityTest35
  Scenario: FT Test 35: Checking The Functionality Of The Betting Timer Once It Starts
    When I Enter The Dealer Table
    And I Wait "Until Betting Timer Starts"
    Then I Verify "The Functionality Of The Betting Timer Once It Starts"

  @FunctionalityTest36
  Scenario: FT Test 36: Checking The Functionality Of The Betting Timer Once It Ends
    When I Enter The Dealer Table
    And I Wait "Until Betting Timer Ends"
    Then I Verify "The Functionality Of The Betting Timer Once It Ends"

  @FunctionalityTest37
  Scenario: FT Test 37: Checking The Functionality Of The Double Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Check "The Placed Bet"
    And I Click "The Double Button"
    Then I Verify "The Functionality After Clicking The Double Button"

  @FunctionalityTest38
  Scenario: FT Test 38: Checking The Functionality Of Total Balance After Confirming Any Bets
    When I Enter The Dealer Table
    And I Place "And Confirm Any Betting Options"
    Then I Verify "The Functionality Of Total Balance After Confirming Any Bets"

  @FunctionalityTest39
  Scenario: FT Test 39: Checking The Functionality Of Total Balance After Winning Round
    When I Enter The Dealer Table
    And I Place "And Confirm Any Betting Options"
    And I Wait "Until Bet Wins"
    Then I Verify "The Functionality Of Total Balance After Winning Round"

  @FunctionalityTest40
  Scenario: FT Test 40: Checking The Functionality After Betting Timer Reaches Last 10 Seconds And Not Confirming
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Wait "Until Betting Timer Reaches Last 10 Seconds"
    Then I Verify "The Functionality After Betting Timer Reaches Last 10 Seconds And Not Confirming"

  @FunctionalityTest41
  Scenario: FT Test 41: Checking The Functionality Of The Confirm Button On Popup Message
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Wait "Until Betting Timer Reaches Last 10 Seconds"
    And I Click "The Popup Confirm Button"
    Then I Verify "The Functionality After Clicking The Confirm Button On Popup Message"

  @FunctionalityTest42
  Scenario: FT Test 42: Checking The Functionality Of The Not Now Button On Popup Message
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Wait "Until Betting Timer Reaches Last 10 Seconds"
    And I Click "The Popup Not Now Button"
    Then I Verify "The Functionality After Clicking The Not Now Button On Popup Message"

  @FunctionalityTest44
  Scenario: FT Test 44: Checking The Functionality Of The Information Button On Statistics
    When I Enter The Dealer Table
    And I Click "The Statistics Button"
    And I Click "The Information Button On Statistics"
    Then I Verify "The Functionality After Clicking The Information Button On Statistics"

  @FunctionalityTest45
  Scenario: FT Test 45: Checking The Functionality Of The Close Button On Statistics Information
    When I Enter The Dealer Table
    And I Click "The Statistics Button"
    And I Click "The Information Button On Statistics"
    And I Click "The Close Button On Statistics Information"
    Then I Verify "The Functionality After Clicking The Close Button On Statistics Information"

  @FunctionalityTest46
  Scenario: FT Test 46: Checking The Functionality Of The Back Button On Statistics
    When I Enter The Dealer Table
    And I Click "The Statistics Button"
    And I Click "The Back Button On Statistics"
    Then I Verify "The Functionality After Clicking The Back Button On Statistics"

  @FunctionalityTest47
  Scenario: FT Test 47: Checking The Functionality Of The Back Button On Game
    When I Enter The Dealer Table
    And I Click "The Back Button On Game"
    Then I Verify "The Functionality After Clicking The Back Button On Game"