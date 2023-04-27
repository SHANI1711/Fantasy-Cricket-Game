import java.util.ArrayList;

public class Data {
    public static ArrayList<Player> players = new ArrayList<>() {
        {
            add(new Player("V Kohli", 10, 100, 1));
            add(new Player("MS Dhoni", 19, 110, 2));
            add(new Player("R Sharma", 10, 100, 3));
            add(new Player("KL Rahul", 9, 95, 4));
            add(new Player("D Kartihk", 7, 80, 5));
            add(new Player("R Pant", 8, 95, 6));
            add(new Player("S Dhavan", 8, 80, 7));
            add(new Player("S Gill", 7, 80, 8));
            add(new Player("S Raina", 8, 85, 9));
            add(new Player("S Yadav", 8, 80, 10));
            add(new Player("R Jadeja", 8, 85, 11));
            add(new Player("R Ashvin", 8, 80, 12));
            add(new Player("S Iyer", 8, 80, 13));
            add(new Player("D Hooda", 7, 75, 14));
            add(new Player("S Tendulkar", 10, 110, 15));
            add(new Player("Y Chahal", 8, 85, 16));
            add(new Player("R Bishnoi", 7, 75, 17));
            add(new Player("K Yadav", 7, 75, 18));
            add(new Player("Y Singh", 8, 85, 19));
            add(new Player("A Singh", 7, 75, 20));
            add(new Player("H Pandya", 8, 95, 21));
            add(new Player("S Harbhajan", 7, 80, 22));
            add(new Player("Z Khan", 9, 90, 23));
            add(new Player("M Shami", 9, 95, 24));
            add(new Player("B Kumar", 8, 90, 25));
            add(new Player("J Bumrah", 10, 110, 26));

        }
    };


    public static void printPlayer() {
        Player p;
        String s;
        for (int i = 0; i < players.size(); ++i) {
            p = players.get(i);
            if (p.getIsSold()) {
                s = "SOLD";
            } else {
                s = "AVAILABLE";
            }
            System.out.println("Id: " + p.getPlayerId() + "   " + "Name: " + p.getPlayerName() + "   " + "credit: " + p.getPlayerCredit() + "   " + " Status: " + s);
        }
    }
}




