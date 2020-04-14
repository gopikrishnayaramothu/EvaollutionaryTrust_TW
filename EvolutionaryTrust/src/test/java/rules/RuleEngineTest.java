package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class RuleEngineTest {

    RuleEngine RuleEngine = new RuleEngine();
    @Test
    public void testCheatCheat() {
        Pair scores = RuleEngine.returnScoresUsingRules(CHEAT,CHEAT);
        assertEquals(Integer.valueOf(0),scores.getScore1());
        assertEquals(Integer.valueOf(0),scores.getScore2());
    }

    @Test
    public void testCooperateCooperate() {
        Pair scores = RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE);
        assertEquals(Integer.valueOf(2),scores.getScore1());
        assertEquals(Integer.valueOf(2),scores.getScore2());
    }

    @Test
    public void testCheatCooperate() {
        Pair scores = RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE);
        assertEquals(Integer.valueOf(3),scores.getScore1());
        assertEquals(Integer.valueOf(-1),scores.getScore2());
    }

    @Test
    public void testCooperateCheat() {
        Pair scores = RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT);
        assertEquals(Integer.valueOf(-1),scores.getScore1());
        assertEquals(Integer.valueOf(3),scores.getScore2());
    }

}