package rules;


public class RuleEngine {

    private static final String CHEAT = MoveType.CHEAT.getMoveType();
    private static final String COOPERATE = MoveType.COOPERATE.getMoveType();
    private static final int COOPERATE_SCORE = 2;
    private static final int CHEAT_SCORE_PLAYER1 = -1;
    private static final int CHEAT_SCORE_PLAYER2 = 3;
    private static final int CHEAT_SCORE = 0;

    public  Pair returnScoresUsingRules(String player1Move, String player2Move) {
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
