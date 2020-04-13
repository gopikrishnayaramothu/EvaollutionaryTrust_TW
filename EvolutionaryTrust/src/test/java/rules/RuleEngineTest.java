package rules;

import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class RuleEngineTest {

    private static final String CHEAT = "CHEAT";
    private static final String COOPERATE = "COOPERATE";

//    @Test
//    public void testCheatCheat() {
//        int[] expectedScores = {0,0};
//        assertArrayEquals(expectedScores,RuleEngine.returnScoresUsingRules(CHEAT,CHEAT));
//    }
//
//    @Test
//    public void testCooperateCooperate() {
//        int[] expectedScores = {2,2};
//        assertArrayEquals(expectedScores,RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE));
//    }
//
//    @Test
//    public void testCheatCooperate() {
//        int[] expectedScores = {3,-1};
//        assertArrayEquals(expectedScores,RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE));
//    }
//
//    @Test
//    public void testCooperateCheat() {
//        int[] expectedScores = {-1,3};
//        assertArrayEquals(expectedScores,RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT));
//    }
//
//    @Test
//    public void testInvalidMoves() {
//        int[] expectedScores = {-1,-1};
//        assertArrayEquals(expectedScores,RuleEngine.returnScoresUsingRules("TEST1","TEST@"));
//    }

    @Test
    public void testCheatCheat() {
        int[] expectedScores = {0,0};
        Pair<Integer,Integer> scores = RuleEngine.returnScoresUsingRules(CHEAT,CHEAT);
        assertEquals(new Pair(0,0),scores);
    }

    @Test
    public void testCooperateCooperate() {
        int[] expectedScores = {2,2};
        assertEquals(new Pair(2,2),RuleEngine.returnScoresUsingRules(COOPERATE,COOPERATE));
    }

    @Test
    public void testCheatCooperate() {
        int[] expectedScores = {3,-1};
        assertEquals(new Pair(3,-1),RuleEngine.returnScoresUsingRules(CHEAT,COOPERATE));
    }

    @Test
    public void testCooperateCheat() {
        int[] expectedScores = {-1,3};
       assertEquals(new Pair(-1,3),RuleEngine.returnScoresUsingRules(COOPERATE,CHEAT));
    }

    @Test
    public void testInvalidMoves() {
        int[] expectedScores = {-1,-1};
        assertEquals(new Pair(-1,-1),RuleEngine.returnScoresUsingRules("TEST1","TEST@"));
    }

}