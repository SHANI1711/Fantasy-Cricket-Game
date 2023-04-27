import java.util.ArrayList;

public class Player{
    private String playerName;
    private int playerId;
    private int playerCredit;
    private int playerPoint;
    private boolean isSold;

//---------------------------------------------------------------------------
// Constructors
    Player(String playerName, int playerCredit, int playerPoint, int playerId){
        this.playerName=playerName;
        this.playerCredit=playerCredit;
        this.playerPoint=playerPoint;
        this.playerId= playerId;
        this.isSold = false;
    }

    Player(String playerName, boolean isSold){
        this.playerName= playerName;
        this.isSold=isSold;
    }

    public Player(String playerName){
        this.playerName=playerName;
        this.isSold = false;
    }
//---------------------------------------------------------------------------
    public void setPlayerName(String playerName) {
        if (!playerName.equals("")){
            this.playerName = playerName;
        }
    }
    public String getPlayerName() {
        return playerName;
    }
    //---------------------------------------------------------------------------
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
//        if(playerId >0 && playerId < 27){
            this.playerId = playerId;
//        }
    }
    //---------------------------------------------------------------------------


    public int getPlayerCredit() {
        return playerCredit;
    }

    public void setPlayerCredit(int playerCredit) {
//        if(playerCredit > 0 && playerCredit <12){
            this.playerCredit = playerCredit;
//        }
    }
    //---------------------------------------------------------------------------
    public int getPlayerPoint() {
        return playerPoint;
    }
    public void setPlayerPoint(int playerPoint) {
//        if (playerPoint >0 && playerPoint < 130){
            this.playerPoint = playerPoint;
//        }
    }
    //---------------------------------------------------------------------------
    public boolean getIsSold() {
        return isSold;
    }
    public void setIsSold(boolean sold) {
        isSold = sold;
    }
}
//---------------------------------------------------------------------------

