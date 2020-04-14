package rules;

import org.junit.Test;
import static rules.MoveType.*;
import static org.junit.Assert.*;

public class RuleEngineTest {

    RuleEngine RuleEngine = new RuleEngine();
    @Test
    public void testCheatCheat() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(CHEAT,CHEAT);
        assertEquals(0,scores.getPlayer1Score());
        assertEquals(0,scores.getPlayer2Score());
    }

    @Test
    public void testCooperateCooperate() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE);
        assertEquals(2,scores.getPlayer1Score());
        assertEquals(2,scores.getPlayer2Score());
    }

    @Test
    public void testCheatCooperate() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE);
        assertEquals(3,scores.getPlayer1Score());
        assertEquals(-1,scores.getPlayer2Score());
    }

    @Test
    public void testCooperateCheat() {
        ScoreBoard scores = RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT);
        assertEquals(-1,scores.getPlayer1Score());
        assertEquals(3,scores.getPlayer2Score());
    }

}