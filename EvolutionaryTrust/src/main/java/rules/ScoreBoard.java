package rules;

import java.util.Objects;

public class ScoreBoard {

    private  int player1Score;
    private  int player2Score;

    public ScoreBoard(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public void updateScores(ScoreBoard scoreBoard) {
        this.player1Score += scoreBoard.player1Score;
        this.player2Score += scoreBoard.player2Score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScoreBoard)) return false;
        ScoreBoard that = (ScoreBoard) o;
        return player1Score == that.player1Score &&
                player2Score == that.player2Score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(player1Score, player2Score);
    }

    public void print(int currentRound) {
        System.out.println(currentRound + "  " + player1Score + "  " + player2Score);
    }
}
