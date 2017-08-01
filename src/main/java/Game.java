import javax.print.DocFlavor;

/**
 * Created by Guest on 8/1/17.
 */
public class Game {

    public String rock;
    public String paper;
    public String scissors;
    public int player1 , player2;

    public String runGame(String inputString1, String inputString2){
        String theWinner="";
        if (inputString1.equals("paper") && inputString2.equals("rock")){
            theWinner = "Player 1 wins!";
        }
        else if (inputString1.equals("rock") && inputString2.equals("paper")){
            theWinner = "Player 2 wins!";
        }
        else if (inputString1.equals("rock") && inputString2.equals("scissors")){
            theWinner = "Player 1 wins!";
        }
        else if (inputString1.equals("scissors") && inputString2.equals("rock")){
            theWinner = "Player 2 wins!";
        }
        else if (inputString1.equals("paper") && inputString2.equals("scissors")){
            theWinner = "Player 2 wins!";
        }
        else if (inputString1.equals("scissors") && inputString2.equals("paper")){
            theWinner = "Player 1 wins!";
        }
        return theWinner;
    }

}
