package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class RuleEngineTest {

    RuleEngine RuleEngine = new RuleEngine();
    @Test
    public void testCheatCheat() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(CHEAT,CHEAT);
        assertEquals(new ScoreBoard(0, 0), scores);
    }

    @Test
    public void testCooperateCooperate() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE);
        assertEquals(new ScoreBoard(2, 2), scores);
    }

    @Test
    public void testCheatCooperate() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE);
        assertEquals(new ScoreBoard(3, -1), scores);
    }

    @Test
    public void testCooperateCheat() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT);
        assertEquals(new ScoreBoard(-1, 3), scores);
    }

}