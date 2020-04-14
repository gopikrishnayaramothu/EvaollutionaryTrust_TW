package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class RuleEngineTest {

    private static final String CHEAT = "CHEAT";
    private static final String COOPERATE = "COOPERATE";

    @Test
    public void testCheatCheat() {
        int[] expectedScores = {0,0};
        Pair scores = RuleEngine.returnScoresUsingRules(CHEAT,CHEAT);
        assertEquals(Integer.valueOf(0),scores.getScore1());
        assertEquals(Integer.valueOf(0),scores.getScore2());
    }

    @Test
    public void testCooperateCooperate() {
        int[] expectedScores = {2,2};
        Pair scores = RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE);
        assertEquals(Integer.valueOf(2),scores.getScore1());
        assertEquals(Integer.valueOf(2),scores.getScore2());
    }

    @Test
    public void testCheatCooperate() {
        int[] expectedScores = {3,-1};
        Pair scores = RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE);
        assertEquals(Integer.valueOf(3),scores.getScore1());
        assertEquals(Integer.valueOf(-1),scores.getScore2());
    }

    @Test
    public void testCooperateCheat() {
        int[] expectedScores = {-1,3};
        Pair scores = RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT);
        assertEquals(Integer.valueOf(-1),scores.getScore1());
        assertEquals(Integer.valueOf(3),scores.getScore2());
    }

    @Test
    public void testInvalidMoves() {
        int[] expectedScores = {-1,-1};
        Pair scores = RuleEngine.returnScoresUsingRules("TEST1","TEST@");
        assertEquals(Integer.valueOf(-1),scores.getScore1());
        assertEquals(Integer.valueOf(-1),scores.getScore2());
    }

}