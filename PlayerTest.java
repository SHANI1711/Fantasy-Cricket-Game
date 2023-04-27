public class PlayerTest {
//---------------------------------------------------------------------------
    public void setPlayerNameTest() {
        Player p = new Player("Shani");
        p.setPlayerName("sunny");

        if (p.getPlayerName().equals("sunny")) {
            System.out.println("    setPlayerNameTest - PASS");
        } else {
            System.out.println("    setPlayerNameTest - FAIL");
        }
    }

    public void setIncorrectPlayerNameTest() {
        Player p = new Player("Shani");
        p.setPlayerName(" ");

        if (p.getPlayerName().equalsIgnoreCase(" ")) {
            System.out.println("    setIncorrectPlayerNameTest - PASS");
        } else {
            System.out.println("    setIncorrectPlayerNameTest - FAIL");
        }
    }

    public void getPlayerNameTest() {
        Player p = new Player("Shani");

        if (p.getPlayerName().equals("Shani")) {
            System.out.println("    getPlayerNameTest - PASS");
        } else {
            System.out.println("    getPlayerNameTest - FAIL");
        }
    }
//---------------------------------------------------------------------------

    public void setPlayerIdTest(){
        Player p = new Player("Shani");
        p.setPlayerId(17);

        if(p.getPlayerId() == 17){
            System.out.println("    setPlayerIdTest - PASS");
        }
        else{
            System.out.println("    setPlayerIdTest - FAIL");
        }
    }

    public void setIncorrectPlayerIdTest(){
        Player p = new Player("Shani");
        p.setPlayerId(0);

        if(p.getPlayerId() == 0 || p.getPlayerId()<0){
            System.out.println("    setIncorrectPlayerIdTest - PASS");
        }
        else{
            System.out.println("    setIncorrectPlayerIdTest - FAIL");
        }
    }

    public void getPlayerIdTest(){
        Player p = new Player("shani", 12, 100, 11);

        if(p.getPlayerId() == 11)
        {
            System.out.println("    getPlayerIdTest - PASS");
        }
        else {
            System.out.println("    getPlayerIdTest - FAIL");
        }
    }
//---------------------------------------------------------------------------

    public void setPlayerCreditTest(){
        Player p = new Player("shani", 12, 100, 11);
        p.setPlayerCredit(9);

        if(p.getPlayerCredit() == 9){
            System.out.println("    setPlayerCreditTest - PASS");
        }
        else{
            System.out.println("    setPlayerCreditTest - FAIL");
        }
    }

    public void setIncorrectPlayerCreditTest(){
        Player p = new Player("shani", 12, 100, 11);
        p.setPlayerCredit(0);

        if(p.getPlayerCredit() == 0 || p.getPlayerCredit() < 0){
            System.out.println("    setIncorrectPlayerCreditTest - PASS");
        }
        else{
            System.out.println("    setIncorrectPlayerCreditTest - FAIL");
        }

    }

    public void getPlayerCreditTest(){
        Player p = new Player("shani", 12, 100, 11);

        if(p.getPlayerCredit() == 12)
        {
            System.out.println("    getPlayerCreditTest - PASS");
        }
        else {
            System.out.println("    getPlayerCreditTest - FAIL");
        }
    }
//---------------------------------------------------------------------------

    public void setPlayerPointTest(){
        Player p = new Player("shani", 12, 100, 11);
        p.setPlayerPoint(150);

        if(p.getPlayerPoint() == 150){
            System.out.println("    setPlayerPointTest - PASS");
        }
        else{
            System.out.println("    setPlayerPointTest - FAIL");
        }

    }

    public void setIncorrectPlayerPointTest(){
        Player p = new Player("shani", 12, 100, 11);
        p.setPlayerPoint(0);

        if(p.getPlayerPoint() == 0 || p.getPlayerPoint() < 0){
            System.out.println("    setIncorrectPlayerPointTest - PASS");
        }
        else{
            System.out.println("    setIncorrectPlayerPointTest - FAIL");
        }

    }

    public void getPlayerPointTest(){
        Player p = new Player("shani", 12, 100, 11);

        if(p.getPlayerPoint() == 100)
        {
            System.out.println("    getPlayerCreditTest - PASS");
        }
        else {
            System.out.println("    getPlayerCreditTest - FAIL");
        }
    }
//---------------------------------------------------------------------------

    public void setIsSoldTest() {
        Player p = new Player("Shani");
        p.setIsSold(true);

        if (p.getIsSold() == true) {
            System.out.println("    setIsSoldTest - PASS");
        } else {
            System.out.println("    setIsSoldTest - FAIL");
        }
    }


    public void getIsSoldTest() {
        Player p = new Player("Shani");

        if (p.getIsSold() == false) {
            System.out.println("    getIsSoldTest - PASS");
        } else {
            System.out.println("    getIsSoldTest - FAIL");
        }
    }
    //---------------------------------------------------------------------------


}