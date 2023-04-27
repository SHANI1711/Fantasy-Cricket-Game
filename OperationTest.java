import java.util.ArrayList;
public class OperationTest {

    public void findPlayerTest() {
        Operations operations = new Operations();
        Player player = operations.findPlayer(1);
        if (player != null) {
            System.out.println("\n    findPlayerTest - PASS");
        } else {
            System.out.println("    findPlayerTest - FAIL");
        }
    }

    public void findPlayerIncorrectTest() {
        Operations operations = new Operations();
        Player player = operations.findPlayer(30);
        if (player == null) {
            System.out.println("    findPlayerIncorrectTest - PASS");
        } else {
            System.out.println("    findPlayerIncorrectTest - FAIL");
        }
    }
//    ===================================================================================================================================


    public void changeStatusTest() {
        ArrayList<Player> players = new ArrayList<>() {
            {
                add(new Player("ABC", true));
                add(new Player("DEF", false));
                add(new Player("GHI", true));
            }
        };
        Operations operations = new Operations();
        operations.changeStatus(players);
        boolean flag = false;

        for (Player currentPlayer : players) {
            if (currentPlayer.getIsSold()) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("    changeStatusTest - FAIL");
        } else {
            System.out.println("    changeStatusTest - PASS");
        }

    }
//    ===================================================================================================================================

    public void buyPlayerSuccessTest() {
        Player player = new Player("ABC", 11, 110, 25);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerStatus status = operations.buyPlayer(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerStatus.SUCCESS) {
            System.out.println("    buyPlayerSuccessTest - PASS");
        } else {
            System.out.println("    buyPlayerSuccessTest - FAIL");

        }
    }
    public void buyPlayerIncorrectPlayerIdTest(){
        Player player = new Player("ABC", 11, 110, 30);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerStatus status = operations.buyPlayer(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerStatus.INCORRECT_PLAYER_ID)
        {
            System.out.println("    buyPlayerIncorrectPlayerIdTest - PASS");
        } else {
            System.out.println("    buyPlayerIncorrectPlayerIdTest - FAIL");

        }
    }
    public void buyPlayerAlreadySoldTest(){
        Player player = Data.players.get(0);
        player.setIsSold(true);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerStatus status = operations.buyPlayer(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerStatus.PLAYER_ALREADY_SOLD)
        {
            System.out.println("    buyPlayerAlreadySoldTest - PASS");
        } else {
            System.out.println("    buyPlayerAlreadySoldTest - FAIL");

        }
    }

    public void buyPlayerNotEnoughCreditTest(){
        Player player = Data.players.get(0);
        player.setPlayerCredit(500);
        player.setIsSold(false);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerStatus status = operations.buyPlayer(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerStatus.NOT_ENOUGH_CREDIT)
        {
            System.out.println("    buyPlayerNotEnoughCreditTest - PASS");
        } else {
            System.out.println("    buyPlayerNotEnoughCreditTest - FAIL");
        }
    }
//    ===================================================================================================================================

    public void buyPlayerForShaniSuccessTest() {
        Player player = new Player("ABC", 11, 110, 17);
        User user = new User();
        Operations operations = new Operations();
        player.setIsSold(false);
        Operations.boughtPlayerForShaniStatus status = operations.buyPlayerForShani(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerForShaniStatus.SUCCESS) {
            System.out.println("    buyPlayerForShaniSuccessTest - PASS");
        } else {
            System.out.println("    buyPlayerForShaniSuccessTest - FAIL");

        }
    }
    public void buyPlayerForShaniIncorrectPlayerIdTest(){
        Player player = new Player("ABC", 11, 110, 170);

        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerForShaniStatus status = operations.buyPlayerForShani(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerForShaniStatus.INCORRECT_PLAYER_ID)
        {
            System.out.println("    buyPlayerForShaniIncorrectPlayerIdTest - PASS");
        } else {
            System.out.println("    buyPlayerForShaniIncorrectPlayerIdTest - FAIL");

        }
    }
    public void buyPlayerForShaniAlreadySoldTest(){
        Player player = Data.players.get(1);
        player.setIsSold(true);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerForShaniStatus status = operations.buyPlayerForShani(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerForShaniStatus.PLAYER_ALREADY_SOLD)
        {
            System.out.println("    buyPlayerForShaniAlreadySoldTest - PASS");
        } else {
            System.out.println("    buyPlayerForShaniAlreadySoldTest - FAIL");

        }
    }

    public void buyPlayerForShaniNotEnoughCreditTest(){
        Player player = Data.players.get(0);
        player.setPlayerCredit(500);
        player.setIsSold(false);
        User user = new User();
        Operations operations = new Operations();
        Operations.boughtPlayerForShaniStatus status = operations.buyPlayerForShani(operations.findPlayer(player.getPlayerId()), user);
        if (status == Operations.boughtPlayerForShaniStatus.NOT_ENOUGH_CREDIT)
        {
            System.out.println("    buyPlayerForShaniNotEnoughCreditTest - PASS");
        } else {
            System.out.println("    buyNotPlayerForShaniEnoughCreditTest - FAIL");
        }
    }

//    public void userSelectionTest(){}
    
}
