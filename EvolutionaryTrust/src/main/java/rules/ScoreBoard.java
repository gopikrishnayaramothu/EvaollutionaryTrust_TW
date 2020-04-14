package rules;

import java.util.Objects;

public class ScoreBoard {

    private  int player1Score;
    private  int player2Score;

    public ScoreBoard(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public void updateScores(int player1Score, int player2Score) {
        this.player1Score += player1Score;
        this.player2Score += player2Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
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
}
