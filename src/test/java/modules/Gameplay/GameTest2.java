package modules.Gameplay;

import pages.GameLobby;

public class GameTest2 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        verifyDisplay(GameLobby.Label.FirstNumberInRoadMap);

        System.out.println();
    }

}
