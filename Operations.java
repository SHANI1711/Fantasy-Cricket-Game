import java.util.ArrayList;

public class Operations {
    static ArrayList<Player> players  = Data.players;
    public static int playerTotalUser=0;
    public static int playerTotalSystem=0;
    ArrayList<Player> userSelected = new ArrayList<>();
    ArrayList<Player> systemSelected = new ArrayList<>();

    static enum boughtPlayerStatus {
        SUCCESS,
        INCORRECT_PLAYER_ID,
        PLAYER_ALREADY_SOLD,
        NOT_ENOUGH_CREDIT
    }
    static enum boughtPlayerForShaniStatus {
        SUCCESS,
        INCORRECT_PLAYER_ID,
        PLAYER_ALREADY_SOLD,
        NOT_ENOUGH_CREDIT
    }
//    ===================================================================================================================================

    public Player findPlayer(int playerId) {
        for(Player currentPlayer : players) {
            if (currentPlayer.getPlayerId() == playerId) {
                return currentPlayer;
            }
        }
        return null;
    }
//    ===================================================================================================================================
    //Player buy logic for user
    public boughtPlayerStatus buyPlayer(Player player, User user) {
        if(player == null) {

            return boughtPlayerStatus.INCORRECT_PLAYER_ID;
        }

        if (player.getIsSold()) {
            return  boughtPlayerStatus.PLAYER_ALREADY_SOLD;
        }
        if (user.getCredit() >= player.getPlayerCredit())
        {
            user.setCredit(user.getCredit()-player.getPlayerCredit());
            user.setPoints(user.getPoints()+player.getPlayerPoint());
            player.setIsSold(true);
            userSelected.add(player);
            playerTotalUser+=1;
            return boughtPlayerStatus.SUCCESS;
        }
        else {
            return boughtPlayerStatus.NOT_ENOUGH_CREDIT;
        }
    }

    //    ===================================================================================================================================
//Player buy logic for system
public boughtPlayerForShaniStatus buyPlayerForShani(Player player, User user) {
    if(player == null) {

        return boughtPlayerForShaniStatus.INCORRECT_PLAYER_ID;
    }
//    assert player != null;
    if (user.getCredit() >= player.getPlayerCredit())
    {
        if (player.getIsSold()) {
            return  boughtPlayerForShaniStatus.PLAYER_ALREADY_SOLD;

        }
        else if (user.getCredit()<player.getPlayerCredit()) {
            return  boughtPlayerForShaniStatus.NOT_ENOUGH_CREDIT;

        }
        else{
            user.setCredit(user.getCredit()-player.getPlayerCredit());
            user.setPoints(user.getPoints()+player.getPlayerPoint());
            player.setIsSold(true);
            systemSelected.add(player);
            playerTotalSystem+=1;
            return boughtPlayerForShaniStatus.SUCCESS;
        }
    }
    else {
        return boughtPlayerForShaniStatus.NOT_ENOUGH_CREDIT;
    }
}
//    ===================================================================================================================================
        public void userSelection(){
            for(Player p: userSelected){
                System.out.println("Id: " + p.getPlayerId() + "   " + "Name: " + p.getPlayerName() + "   " + "credit: " + p.getPlayerCredit());
            }
        }
//    ===================================================================================================================================
    public void systemSelection(){
        for(Player p: systemSelected){
            System.out.println("Id: " + p.getPlayerId() + "   " + "Name: " + p.getPlayerName() + "   " + "credit: " + p.getPlayerCredit());
        }
    }
//    ===================================================================================================================================
    public void changeStatus(ArrayList<Player> players){
        for(Player currentPlayer: players){
            currentPlayer.setIsSold(false);
        }
    }


}
