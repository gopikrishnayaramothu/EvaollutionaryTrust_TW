package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void bothCooperateWillReturnScores()
    {
        Player cooperatePlayer1 = new Player();
        Player cooperatePlayer2 = new Player();
        Pair scores = new Game().getPlayerScored(cooperatePlayer1, cooperatePlayer2);
        assertEquals(Integer.valueOf(2),scores.getScore1());
        assertEquals(Integer.valueOf(2),scores.getScore2());
    }
}