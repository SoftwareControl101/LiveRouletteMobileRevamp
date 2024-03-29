package modules.UserInterface;

import pages.GameLobby;

public class UITest3 extends UserInterface {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 3");
        System.out.println("Actual Results: ");

        verifyDisplay(GameLobby.Button.TableLimits);
        verifyDisplay(GameLobby.Container.DealerTables);
        verifyDisplay(GameLobby.Button.Back);
        verifyDisplay(GameLobby.Button.HideShowBalance);
        verifyDisplay(GameLobby.Label.BalanceText);
        verifyDisplay(GameLobby.Container.DealerPhotos);
        verifyDisplay(GameLobby.Label.DealerNames);
        verifyDisplay(GameLobby.Label.TableNames);
        verifyDisplay(GameLobby.Container.RoadMaps);
        verifyDisplay(GameLobby.Label.RedCounters);
        verifyDisplay(GameLobby.Label.BlackCounters);
        verifyDisplay(GameLobby.Label.ZeroCounters);
        verifyDisplay(GameLobby.Label.TotalRoundCounters);

        System.out.println();
    }

}
