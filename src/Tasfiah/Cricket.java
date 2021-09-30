//Name: Tasfiah Tahsin Ahsan
//ID: 2012020258   Sec: F
//email: cse_2012020258@lus.ac.bd
//Date: 12/09/2021

package Tasfiah;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match Type: " + matchType);
        System.out.println("Over: " + over);
        System.out.println("Player Name: " + player.playerName);
        System.out.println("Player Jersey Number: " + player.jerseyNumber);

    }
}