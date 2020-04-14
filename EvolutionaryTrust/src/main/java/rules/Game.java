package rules;


public class Game {

    RuleEngine ruleEngineInstance = new RuleEngine();
    int numberOfRounds ;
    ScoreBoard scoreBoard;

    public Game(int numberOfRounds) {
            this.numberOfRounds = numberOfRounds;
            scoreBoard = new ScoreBoard(0,0);
    }

    public ScoreBoard getPlayerScored(Player player1Type, Player player2Type) {
        System.out.println("Round" + "  " +"Player1" + "  " +"Player2");
        for(int currentRound=1;currentRound <=numberOfRounds ; currentRound++){
            ScoreBoard roundScores = ruleEngineInstance.returnScoresUsingRules(player1Type.makeMove(), player2Type.makeMove());
            scoreBoard.updateScores(roundScores);
            scoreBoard.print(currentRound);
        }
        return scoreBoard;
    }
}
