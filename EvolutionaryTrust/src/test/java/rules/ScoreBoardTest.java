package rules;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreBoardTest {

    @Test
    public void shouldReturnUpdatedScoresOfTwoPlayers() {
        ScoreBoard scoreBoard = new ScoreBoard(0,0);
        scoreBoard.updateScores(new ScoreBoard(2,2));
        assertEquals(new ScoreBoard(2, 2), scoreBoard);
    }
}
