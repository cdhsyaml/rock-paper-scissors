import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class GameTest {

    @Test
    public void computerChooses_shouldBeAStringCombination1_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 1 wins!";
        assertEquals(expectedOutput , testGame.runGame("paper" , "rock") );
    }

    @Test
    public void computerChooses_shouldBeAStringCombination2_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 2 wins!";
        assertEquals(expectedOutput , testGame.runGame("rock" , "paper") );
    }

    @Test
    public void computerChooses_shouldBeAStringCombination3_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 1 wins!";
        assertEquals(expectedOutput , testGame.runGame("rock" , "scissors") );
    }

    @Test
    public void computerChooses_shouldBeAStringCombination4_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 2 wins!";
        assertEquals(expectedOutput , testGame.runGame("scissors" , "rock") );
    }

    @Test
    public void computerChooses_shouldBeAStringCombination5_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 1 wins!";
        assertEquals(expectedOutput , testGame.runGame("scissors" , "paper") );
    }

    @Test
    public void computerChooses_shouldBeAStringCombination6_String() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "Player 2 wins!";
        assertEquals(expectedOutput , testGame.runGame("paper" , "scissors") );
    }
}