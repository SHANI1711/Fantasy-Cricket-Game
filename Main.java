import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length > 0)
        //Running Tests
        {
            if (args[0].equalsIgnoreCase("Test")) {

                //Player Tests
                PlayerTest pt = new PlayerTest();
                pt.setPlayerNameTest();
                pt.setIncorrectPlayerNameTest();
                pt.getPlayerNameTest();
                pt.setPlayerIdTest();
                pt.setIncorrectPlayerIdTest();
                pt.getPlayerIdTest();
                pt.setPlayerCreditTest();
                pt.setIncorrectPlayerCreditTest();
                pt.getPlayerCreditTest();
                pt.setPlayerPointTest();
                pt.setIncorrectPlayerPointTest();
                pt.getPlayerPointTest();
                pt.setIsSoldTest();
                pt.getIsSoldTest();

                //User Tests
                UserTest ut = new UserTest();
                ut.setUserNameTest();
                ut.setIncorrectUserNameTest();
                ut.getUserNameTest();
                ut.setUserIdTest();
                ut.setIncorrectUserIdTest();
                ut.getUserIdTest();
                ut.setTeamNameTest();
                ut.setIncorrectTeamNameTest();
                ut.getTeamNameTest();
                ut.setCreditTest();
                ut.setIncorrectCreditTest();
                ut.getCreditTest();
                ut.setPointTest();
                ut.setIncorrectPointTest();
                ut.getPointsTest();
                ut.createUserSuccessTest();
                ut.createIncorrectUserTest();

                //Operations Test
                OperationTest ot = new OperationTest();

                ot.findPlayerTest();
                ot.findPlayerIncorrectTest();
                ot.changeStatusTest();
                ot.buyPlayerSuccessTest();
                ot.buyPlayerIncorrectPlayerIdTest();
                ot.buyPlayerAlreadySoldTest();
                ot.buyPlayerNotEnoughCreditTest();

                ot.buyPlayerForShaniSuccessTest();
                ot.buyPlayerForShaniIncorrectPlayerIdTest();
                ot.buyPlayerForShaniAlreadySoldTest();
                ot.buyPlayerForShaniNotEnoughCreditTest();

            } else {
                System.out.println(" please enter valid argument");
            }
        } else
        //Running Main program
        {

            boolean firstloop = true;
            while (firstloop) {

                //Initial options for play or quit.
                System.out.println("\n************************************************************************************\n");
                System.out.println("\n1. Start this wonderful game.\n2. Quit.");
                System.out.println("\n************************************************************************************\n");
                System.out.println("Enter choice:");
                int choice = scanner.nextInt();
                scanner.nextLine();

                //main program control
                switch (choice) {
                    case 1:
                        System.out.println("\n************************************************************************************\n");

                        System.out.println(

                                "\n>>>>>>>>>>>>>>>>>>> Let's understand the rules to play this game <<<<<<<<<<<<<<<<<<<\n" +
                                        "\n1. In this game, we will be given 100 credits." +
                                        "\n2. From this 100 credits, we have to buy 11 players from the total players available." +
                                        "\n3. Each players have different credits and different points according to their status." +
                                        "\n4. Obviously the points will be hidden, However we can check total points at any time." +
                                        "\n5. We will get chance one by one to buy a player at a time." +
                                        "\n6. After each purchase according to player's credit, that credit will be deducted from our initial 100 credit." +
                                        "\n7. The credits of our selected player will be added to out account." +
                                        "\n8. We must have to complete our purchase of 11 players within this 100 credit limit." +
                                        "\n9. Make sure to check available credits after each purchase." +
                                        "\n10. After 11th purchase, whoever has the more points will win this game." +
                                        "\n\n11.That's all. We are good to start.!!");

                        System.out.println("\n************************* Please introduce yourself first **************************\n");

                        System.out.println("Enter your name:");
                        String userName = scanner.nextLine();

                        System.out.println("\n************************************************************************************\n");

                        System.out.println("Enter your team name:");
                        String teamName = scanner.nextLine();

                        User user1 = new User(userName, teamName);
                        User user2 = new User();
                        user2.setUserName("SHANI KACHHADIYA");
                        user2.setTeamName("Shani's playing 11");
                        user1.createUser(new UserMockDB());
                        user2.createUser(new UserMockDB());

                        //printing user data
                        System.out.println("\n************************************************************************************\n");
                        System.out.println("your user name is : " + user1.getUserName());
                        System.out.println("your user Id is : " + user1.getUserId());
                        System.out.println("your team name is : " + user1.getTeamName());
                        System.out.println("your available credit is : " + user1.getCredit());
                        System.out.println("your point collection is : " + user1.getPoints());
                        System.out.println("\n************************************************************************************\n");

                        //Printing computer user data
                        System.out.println("My user name is : " + user2.getUserName());
                        System.out.println("my user Id is : " + user2.getUserId());
                        System.out.println("my team name is : " + user2.getTeamName());
                        System.out.println("my available credit is : " + user2.getCredit());
                        System.out.println("my point collection is : " + user2.getPoints());

                        System.out.println("\n******************** Here is the list of all available players *********************\n");
                        Data.printPlayer();
                        System.out.println("\n************************************************************************************\n");


                        boolean secondloop = true;
                        Operations operations = new Operations();

                        while (secondloop) {
                            System.out.println(" \n1. Buy Player. \n2. Show available credit. \n3. Show Statistics. \n4. Show available players \n5. Show my player selection \n6. Show SHANI's player selection \n7. Find who is the winner!!! \n8. Return to main menu.");

                            int choiceNew = scanner.nextInt();

                            switch (choiceNew) {

                                case 1:
                                    Operations.boughtPlayerStatus result1 = null;
                                    Operations.boughtPlayerForShaniStatus result2;
                                    System.out.println("\n************************************************************************************\n");
                                    boolean B = true;
                                    while (B) {

                                        do {
                                            System.out.println("Enter the Id of player you want to buy.");
                                            int playerId = scanner.nextInt();
                                            System.out.println("\n************************************************************************************\n");
                                            System.out.println(user1.getUserName() + "'s purchase. ");
                                            Player p = operations.findPlayer(playerId);
                                            result1 = operations.buyPlayer(p, user1);

                                            if (result1 == Operations.boughtPlayerStatus.NOT_ENOUGH_CREDIT) {
                                                System.out.println("You do not have enough credit to buy this player!!");
                                                B = false;
                                            } else if (result1 == Operations.boughtPlayerStatus.PLAYER_ALREADY_SOLD) {
                                                System.out.println("Player is already sold!!");
                                                System.out.println("\n************************************************************************************\n");
                                                B = false;
                                            } else if (result1 == Operations.boughtPlayerStatus.INCORRECT_PLAYER_ID) {
                                                System.out.println("\n********************************** Player not found **********************************");
                                                System.out.println("\nPlease enter Player ID between 1 to 26");
                                                System.out.println("\n************************************************************************************\n");
                                            } else {
                                                System.out.println("\nSelected Player is " + p.getPlayerName() + " with " + p.getPlayerCredit() + " credits.");
                                                System.out.println("\n************************************************************************************\n");
                                            }
                                        } while (result1 == Operations.boughtPlayerStatus.INCORRECT_PLAYER_ID);

                                        B = false;
                                    }

                                    if (result1 == Operations.boughtPlayerStatus.SUCCESS) {

                                        boolean shaniSelection = true;
                                        boolean isPrinted = true;
                                        while (shaniSelection) {
                                            Random random = new Random();
                                            int shaniId = random.nextInt(25) + 1;
                                            Player p = operations.findPlayer(shaniId);

                                            if (isPrinted) {
                                                System.out.println(user2.getUserName() + "'s purchase. ");
                                                isPrinted = false;

                                                result2 = operations.buyPlayerForShani(p, user2);
                                                if (result2 == Operations.boughtPlayerForShaniStatus.SUCCESS) {
                                                    shaniSelection = false;
                                                    System.out.println("\nSelected Player is " + p.getPlayerName() + " with " + p.getPlayerCredit() + " credits.");
                                                    System.out.println("\n************************************************************************************\n");
                                                }
                                            } else {
                                                result2 = operations.buyPlayerForShani(p, user2);
                                                if (result2 == Operations.boughtPlayerForShaniStatus.SUCCESS) {
                                                    System.out.println("\nSelected Player is " + p.getPlayerName() + " with " + p.getPlayerCredit() + " credits.");
                                                    System.out.println("\n************************************************************************************\n");


                                                    shaniSelection = false;
                                                }
                                            }
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("\n************************************************************************************\n");
                                    System.out.println(user1.getUserName() + "'s available credit: ");
                                    System.out.println(user1.getCredit());
                                    System.out.println("\n************************************************************************************\n");

                                    System.out.println(user2.getUserName() + "'s available credit: ");
                                    System.out.println(user2.getCredit());
                                    System.out.println("\n************************************************************************************\n");

                                    break;

                                case 3:
                                    System.out.println("\n************************************************************************************\n");

                                    System.out.println(user1.getUserName() + "'s Statistics\n");
                                    System.out.println("Total players baught : " + Operations.playerTotalUser);
                                    System.out.println("Total credit used : " + (100 - user1.getCredit()));
                                    System.out.println("Total credit available : " + user1.getCredit());
                                    System.out.println("Total points collection : " + (Operations.playerTotalUser <= 7 ? user1.getPoints() + "(Only available till selection of 7 players)" : " Surprise "));
                                    System.out.println("\n************************************************************************************\n");

                                    System.out.println("\n" + user2.getUserName() + "'s Statistics\n");
                                    System.out.println("Total players baught : " + Operations.playerTotalSystem);
                                    System.out.println("Total credit used : " + (100 - user2.getCredit()));
                                    System.out.println("Total credit available : " + user2.getCredit());
                                    System.out.println("Total points collection : " + (Operations.playerTotalSystem <= 7 ? user2.getPoints() + "(Only available till selection of 7 players)" : " Surprise "));


                                    System.out.println("\n************************************************************************************\n");
                                    break;

                                case 4:
                                    System.out.println("\n********************* Here is the list of all available players ********************\n");
                                    Data.printPlayer();
                                    System.out.println("\n************************************************************************************\n");
                                    break;

                                case 5:
                                    System.out.println("********************************** Your selection **********************************\n");
                                    operations.userSelection();
                                    System.out.println("\n************************************************************************************\n");

                                    break;

                                case 6:
                                    System.out.println("*********************************** My selection ***********************************\n");
                                    operations.systemSelection();
                                    System.out.println("\n************************************************************************************\n");


                                    break;

                                case 7:
                                    if (Operations.playerTotalUser == 11) {
                                        if (user1.getPoints() > user2.getPoints()) {
                                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Voila !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                                            System.out.println("Congratulations!! You are the winner\n");
                                            System.out.println("Your total point collection is : " + user1.getPoints());
                                            System.out.println("My total point collection is : " + user2.getPoints());
                                            System.out.println("\nYou won by " + (user1.getPoints() - user2.getPoints()) + " points.");
                                            System.out.println("\n************************************************************************************\n");

                                        } else if (user1.getPoints() < user2.getPoints()) {
                                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Better luck next time !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                                            System.out.println("HaHa!! I am the winner\n");
                                            System.out.println("Your total point collection is : " + user1.getPoints());
                                            System.out.println("My total point collection is : " + user2.getPoints());
                                            System.out.println("\nI won by " + (user2.getPoints() - user1.getPoints()) + " points.");
                                            System.out.println("\n************************************************************************************\n");


                                        } else {
                                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! It's a tie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                                            System.out.println(">>>>>>> We both won <<<<<<<");
                                            System.out.println("\nOur total point collection is : " + user1.getPoints());
                                            System.out.println("\n************************************************************************************\n");

                                        }
                                    } else {
                                        System.out.println("\n************************************************************************************\n");
                                        System.out.println("Please select all 11 players first.!!!!");
                                        System.out.println("\n************************************************************************************\n");

                                    }
                                    break;

                                case 8:
                                    System.out.println("******************************* Thank you for paying ********************************\n");
                                    System.out.println("     >>>>>>>>>>>>>>>>>>>>>> Want to play another round <<<<<<<<<<<<<<<<<<<<<<");
                                    operations.changeStatus(Data.players);
                                    Operations.playerTotalUser=0;
                                    Operations.playerTotalSystem=0;
                                    secondloop = false;
                                    break;
                            }
                        }
                        break;
                    case 2:

                        System.out.println("******************** Thank you for paying this game with me.!! *********************\n");
                        firstloop = false;
                        break;
                }
            }
        }
    }
}
