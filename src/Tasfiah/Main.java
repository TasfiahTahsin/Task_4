//Name: Tasfiah Tahsin Ahsan
//ID: 2012020258   Sec: F
//email: cse_2012020258@lus.ac.bd
//Date: 12/09/2021

package Tasfiah ;

public class Main {

    public static void main(String[] args)
    {
        Football football = new Football();
        Player player = new Player ("Shakib",75 );
        Cricket cricket = new Cricket("International match",20, player);

        cricket.display();

    }
}