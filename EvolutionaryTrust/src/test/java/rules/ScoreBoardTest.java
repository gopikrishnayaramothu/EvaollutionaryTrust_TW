package rules;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreBoardTest {

    @Test
    public void shouldReturnUpdatedScoresOfTwoPlayers() {
        ScoreBoard scoreBoard = new ScoreBoard(0,0);
        scoreBoard.updateScores(2,2);
        assertEquals(2,scoreBoard.getPlayer1Score());
        assertEquals(2,scoreBoard.getPlayer2Score());
    }

}