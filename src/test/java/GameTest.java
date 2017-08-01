import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class GameTest {


    @Test
    public void computerChooses_shouldBeAString_true() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "scissors";
        assertEquals(expectedOutput , testGame.runGame("scissors") );
    }

    @Test
    public void computerChooses_shouldBeAStringTwo_true() throws Exception{
        Game testGame = new Game();
        String expectedOutput = "paper";
        assertEquals(expectedOutput , testGame.runGame("paper") );
    }

}