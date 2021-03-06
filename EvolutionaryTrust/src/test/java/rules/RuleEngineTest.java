package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class RuleEngineTest {

    RuleEngine RuleEngine = new RuleEngine();
    @Test
    public void shouldReturnTwoCheatPlayersScore() {
        ScoreBoard scores = RuleEngine.scores(CHEAT,CHEAT);
        assertEquals(new ScoreBoard(0, 0), scores);
    }

    @Test
    public void shouldReturnTwoCooperatePlayersScore() {
        ScoreBoard scores = RuleEngine.scores(COOPERATE,COOPERATE);
        assertEquals(new ScoreBoard(2, 2), scores);
    }

    @Test
    public void shouldReturnCheatPLayerScoreCooperatePlayerScore() {
        ScoreBoard scores = RuleEngine.scores(CHEAT,COOPERATE);
        assertEquals(new ScoreBoard(3, -1), scores);
    }

    @Test
    public void shouldReturnCooperatePlayerScoreCheatPLayerScore() {
        ScoreBoard scores = RuleEngine.scores(COOPERATE,CHEAT);
        assertEquals(new ScoreBoard(-1, 3), scores);
    }

}