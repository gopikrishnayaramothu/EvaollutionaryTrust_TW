package rules;


public class Game {

    RuleEngine ruleEngineInstance = new RuleEngine();

    public  Pair getPlayerScored(Player player1Type, Player player2Type) {

        return ruleEngineInstance.returnScoresUsingRules(player1Type.makeMove(), player2Type.makeMove());

    }
}
