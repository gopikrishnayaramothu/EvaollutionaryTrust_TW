package rules;


import java.io.IOException;

public class Game {

    RuleEngine ruleEngineInstance = new RuleEngine();
    int numberOfRounds;
    ScoreBoard scoreBoard;

    public Game(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
        scoreBoard = new ScoreBoard(0, 0);
    }

    public ScoreBoard getPlayerScored(Player player1Type, Player player2Type) throws IOException {
        System.out.println("Round" + "  " + "Player1" + "  " + "Player2");
        for (int currentRound = 1; currentRound <= numberOfRounds; currentRound++) {
            MoveType[] movesArray = saveLastMove(player1Type.makeMove(), player2Type.makeMove());
            ScoreBoard roundScores = ruleEngineInstance.scores(movesArray[0], movesArray[1]);
            scoreBoard.updateScores(roundScores);
            scoreBoard.print(currentRound);
        }
        return scoreBoard;
    }

    private MoveType[] saveLastMove(MoveType player1, MoveType player2) {
        if (player1 == MoveType.COPY && player2 == MoveType.COPY) {
            player1 = player2 = MoveType.COOPERATE;
        } else if (player2 == MoveType.COPY) {
            player2 = player1;
        } else if (player1 == MoveType.COPY) {
            player1 = player2;
        }

        return new MoveType[]{player1, player2};
    }

}
