package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Player cooperatePlayer1 = new Player();
    Player cooperatePlayer2 = new Player();
    private ScoreBoard scores;

    @Test
    public void bothCooperateWillReturnScores() {
        scores = new Game(1).getPlayerScored(cooperatePlayer1, cooperatePlayer2);
        assertEquals(new ScoreBoard(2, 2), scores);
    }

    @Test
    public void returnScoreForNRounds() {
        scores = new Game(3).getPlayerScored(cooperatePlayer1, cooperatePlayer2);
        assertEquals(new ScoreBoard(6, 6), scores);
    }
}