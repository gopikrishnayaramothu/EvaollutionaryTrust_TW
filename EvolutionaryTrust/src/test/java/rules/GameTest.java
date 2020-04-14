package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class GameTest {

    Player cooperatePlayer1 = new Player(COOPERATE);
    Player cooperatePlayer2 = new Player(CHEAT);

    private ScoreBoard scores;

    @Test
    public void bothCooperateWillReturnScores() {
        scores = new Game(1).getPlayerScored(cooperatePlayer1, cooperatePlayer2);
        assertEquals(new ScoreBoard(-1, 3), scores);
    }

    @Test
    public void returnScoreForNRounds() {
        scores = new Game(3).getPlayerScored(cooperatePlayer1, cooperatePlayer2);
        assertEquals(new ScoreBoard(-3, 9), scores);
    }
}