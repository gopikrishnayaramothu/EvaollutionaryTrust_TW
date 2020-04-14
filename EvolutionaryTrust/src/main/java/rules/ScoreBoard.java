package rules;

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
}
