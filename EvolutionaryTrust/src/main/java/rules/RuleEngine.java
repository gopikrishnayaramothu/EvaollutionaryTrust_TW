package rules;

import com.sun.tools.javac.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class RuleEngine {

    private static final String CHEAT = "CHEAT";
    private static final String COOPERATE = "COOPERATE";
    private static final int COOPERATE_SCORE = 2;
    private static final int CHEAT_SCORE_PLAYER1 = -1;
    private static final int CHEAT_SCORE_PLAYER2 = 3;
    private static final int CHEAT_SCORE = 0;

    public static Pair returnScoresUsingRules(String player1Move, String player2Move) {
        if (player1Move.equals(CHEAT) && player2Move.equals(CHEAT)) {
            return new Pair(CHEAT_SCORE, CHEAT_SCORE);
        } else if (player1Move.equals(CHEAT) && player2Move.equals(COOPERATE)) {
            return new Pair(CHEAT_SCORE_PLAYER2, CHEAT_SCORE_PLAYER1);
        } else if (player1Move.equals(COOPERATE) && player2Move.equals(CHEAT)) {
            return new Pair(CHEAT_SCORE_PLAYER1, CHEAT_SCORE_PLAYER2);
        } else if (player1Move.equals(COOPERATE) && player2Move.equals(COOPERATE)) {
            return new Pair(COOPERATE_SCORE, COOPERATE_SCORE);
        }
        return new Pair(-1, -1);
    }
}

/*
cheat cheat -> 0 0   (cheatcheat,{0,0})
cheat cooperate -> 3 -1
cooperate cheat -> -1 3
cooerate coperate -> 2 2
 */

/*
p1 -> 0,3,2,4
p2->  0,-1,2,4
 */