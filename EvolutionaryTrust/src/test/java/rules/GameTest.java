package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class GameTest {

    Player cooperatePlayer = new Player(new CooperateBehaviour());
    Player cheatPlayer = new Player(new CheatBehaviour());

    private ScoreBoard scores;

    @Test
    public void returnScoreForOneRound() {
        scores = new Game(1).getPlayerScored(cooperatePlayer, cheatPlayer);
        assertEquals(new ScoreBoard(-1, 3), scores);
    }

    @Test
    public void returnScoreForNRounds() {
        scores = new Game(3).getPlayerScored(cooperatePlayer, cheatPlayer);
        assertEquals(new ScoreBoard(-3, 9), scores);
    }
}