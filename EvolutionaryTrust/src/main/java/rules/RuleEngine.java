package rules;

import static rules.MoveType.*;

public class RuleEngine {

    private static final int COOPERATE_SCORE = 2;
    private static final int CHEAT_SCORE_PLAYER1 = -1;
    private static final int CHEAT_SCORE_PLAYER2 = 3;
    private static final int CHEAT_SCORE = 0;

    public  ScoreBoard scores(MoveType player1Move, MoveType player2Move) {
        if (player1Move.equals(CHEAT) && player2Move.equals(CHEAT)) {
            return new ScoreBoard(CHEAT_SCORE, CHEAT_SCORE);
        } else if (player1Move.equals(CHEAT) && player2Move.equals(COOPERATE)) {
            return new ScoreBoard(CHEAT_SCORE_PLAYER2, CHEAT_SCORE_PLAYER1);
        } else if (player1Move.equals(COOPERATE) && player2Move.equals(CHEAT)) {
            return new ScoreBoard(CHEAT_SCORE_PLAYER1, CHEAT_SCORE_PLAYER2);
        } else if (player1Move.equals(COOPERATE) && player2Move.equals(COOPERATE)) {
            return new ScoreBoard(COOPERATE_SCORE, COOPERATE_SCORE);
        }
        return new ScoreBoard(-1, -1);
    }
}
