@Gameplay @Maintenance
Feature: Gameplay

  Background:
    Given I Go To The Live Casino
    And I Join Live Roulette Revamp

  @GameplayTest2
  Scenario: GP Test 2: Checking The Behavior Of Sliding Bar In Lobby
    When Do "Move The Sliding Bar"
    Then Verify "The Behavior Of Sliding Bar In Lobby"

  @GameplayTest3
  Scenario: GP Test 3: Checking The Behavior Of The Game After Joining Table
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game After Joining Table"

  @GameplayTest4
  Scenario: GP Test 4: Checking The Behavior Of The Game After Joining Table With Betting Phase Open
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game After Joining Table With Betting Phase Open"

  @GameplayTest5
  Scenario: GP Test 5: Checking The Behavior Of The Game After Joining Table With Betting Phase Close
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game After Joining Table With Betting Phase Close"

  @GameplayTest6
  Scenario: GP Test 6: Checking The Behavior Of Chips After Clicking On Each Chips
    When I Enter The Dealer Table
    And Click "On Each Chip"
    Then Verify "The Behavior Of Chips After Clicking On Each Chips"

  @GameplayTest7
  Scenario: GP Test 7: Checking The Behavior Of The Game When New Round Is Started
    When I Enter The Dealer Table
    And Wait "Until New Round Starts"
    Then Verify "The Behavior Of The Game When New Round Is Started"

  @GameplayTest8
  Scenario: GP Test 8: Checking The Behavior Of The Game When Placed Bet On Each Betting Options
    When I Enter The Dealer Table
    And Place "A Bet On Each Betting Option"
    Then Verify "The Behavior Of The Game When Placed Bet On Each Betting Options"

  @GameplayTest9
  Scenario: GP Test 9: Checking The Behavior Of The Game When Placed Bet On Any Betting Option
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    Then Verify "The Behavior Of The Game When Placed Bet On Any Betting Option"

  @GameplayTest10
  Scenario: GP Test 10: Checking The Behavior Of Action Buttons When Placed Bet
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    Then Verify "The Behavior Of Action Buttons When Placed Bet"

  @GameplayTest11
  Scenario: GP Test 11: Checking The Behavior Of The Game When Confirmed Bet Then Place And Confirm Bet Again
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Place "And Confirm Bet Again"
    Then Verify "The Behavior Of The Game When Confirmed Bet Then Place And Confirm Bet Again"

  @GameplayTest12
  Scenario: GP Test 12: Checking The Behavior Of The Game When Betting Phase Closed
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game When Betting Phase Closed"

  @GameplayTest13
  Scenario: GP Test 13: Checking The Behavior Of The Game When Placed Bet And Did Not Confirm
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    Then Verify "The Behavior Of The Game When Placed Bet And Did Not Confirm"

  @GameplayTest14
  Scenario: GP Test 14: Checking The Behavior Of The Game When Placed Bet And Did Not Confirm Until Less Than 10 Seconds
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    And Wait "Until Timer Less Than Ten Seconds"
    Then Verify "The Behavior Of The Game When Placed Bet And Did Not Confirm Until Less Than 10 Seconds"

  @GameplayTest15
  Scenario: GP Test 15: Checking The Behavior Of The Game When Drawing Phase Done
    When I Enter The Dealer Table
    And Wait "Until Drawing Phase Done"
    Then Verify "The Behavior Of The Game When Drawing Phase Done"

  @GameplayTest16
  Scenario: GP Test 16: Checking The Behavior Of The Game When Wins Round
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Wait "Until Bet Wins"
    Then Verify "The Behavior Of The Game When Wins Round"

  @GameplayTest17
  Scenario: GP Test 17: Checking The Behavior Of The Game When Loses Round
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Wait "Until Bet Loses"
    Then Verify "The Behavior Of The Game When Loses Round"

  @GameplayTest19
  Scenario: GP Test 19: Checking The Behavior Of The Game When Did Not Bet For 8 Rounds
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Do "Not Bet For 8 Consecutive Rounds"
    Then Verify "The Behavior Of The Game When Did Not Bet For 8 Rounds"

  @GameplayTest20
  Scenario: GP Test 20: Checking The Behavior Of The Game When Did Not Bet For 9 Rounds
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Do "Not Bet For 9 Consecutive Rounds"
    Then Verify "The Behavior Of The Game When Did Not Bet For 9 Rounds"

  @GameplayTest21
  Scenario: GP Test 21: Checking The Behavior Of The Game When Placed Bet That Exceed Maximum Limit
    When I Enter The Dealer Table
    And Place "A Bet That Exceeds Maximum Bet"
    Then Verify "The Behavior Of The Game When Placed Bet That Exceed Maximum Limit"

  @GameplayTest22
  Scenario: GP Test 22: Checking The Behavior Of Double Button When Placed Minimum Bet On Any Betting Options
    When I Enter The Dealer Table
    And Place "A Minimum Bet On Any Betting Options"
    Then Verify "The Behavior Of Double Button When Placed Minimum Bet On Any Betting Options"

  @GameplayTest23
  Scenario: GP Test 23: Checking The Behavior Of Double Button When Placed Maximum Bet On Any Betting Options
    When I Enter The Dealer Table
    And Place "A Maximum Bet On Any Betting Options"
    Then Verify "The Behavior Of Double Button When Placed Maximum Bet On Any Betting Options"

  @GameplayTest25
  Scenario: GP Test 25: Checking The Behavior Of The Game When Click Back Button While Confirmed Bet
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Click "The Back Button"
    Then Verify "The Behavior Of The Game When Click Back Button While Confirmed Bet"

  @GameplayTest28
  Scenario: GP Test 28: Checking The Behavior Of Betting Timer When Its 10 Seconds Below
    When I Enter The Dealer Table
    And Wait "Until Timer Less Than Ten Seconds"
    Then Verify "The Behavior Of Betting Timer When Its 10 Seconds Below"