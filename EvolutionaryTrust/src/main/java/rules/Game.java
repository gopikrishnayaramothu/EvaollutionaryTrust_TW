package rules;

import java.beans.PropertyChangeSupport;
import java.io.IOException;

public class Game {

    private RuleEngine ruleEngineInstance = new RuleEngine();
    private int numberOfRounds;
    private ScoreBoard scoreBoard;
    //private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private MoveType lastMove;

    public Game(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
        scoreBoard = new ScoreBoard(0, 0);
        //propertyChangeSupport.addPropertyChangeListener(new CopyCatPlayer());
    }

    public ScoreBoard getPlayerScored(Player player1Type, Player player2Type) throws IOException {
        System.out.println("Round" + "  " + "Player1" + "  " + "Player2");

        for (int currentRound = 1; currentRound <= numberOfRounds; currentRound++) {
            MoveType player1Move = player1Type.makeMove();
            MoveType player2Move = player2Type.makeMove();
            if (!(player1Type.playerType instanceof CopyCatPlayer)) {
                prepareToStoreLastMove(player1Move);
            } else if (!(player2Type.playerType instanceof CopyCatPlayer)) {
                prepareToStoreLastMove(player2Move);
            }
            ScoreBoard roundScores = new ScoreBoard(0, 0);
            if ((player1Type.playerType instanceof CopyCatPlayer)) {
                roundScores = ruleEngineInstance.scores(takeLastMove(currentRound, player1Move), player2Move);
            } else if ((player2Type.playerType instanceof CopyCatPlayer)) {
                roundScores = ruleEngineInstance.scores(player1Move, takeLastMove(currentRound, player2Move));
            } else {
                roundScores = ruleEngineInstance.scores(player1Move, player2Move);
            }
            scoreBoard.updateScores(roundScores);
            scoreBoard.print(currentRound);
        }
        return scoreBoard;
    }

    private void storeLastMove(MoveType playerMove) {
        // propertyChangeSupport.firePropertyChange("MoveTypeChange", this, playerMove);
        this.lastMove = playerMove;
    }

    private MoveType takeLastMove(int currentRound, MoveType playerMove) throws IOException {
        if (currentRound == 1) {
            return playerMove;
        } else {
            return this.lastMove;
        }
    }

    private void prepareToStoreLastMove(MoveType playerMove) throws IOException {
        storeLastMove(playerMove);
    }


}
