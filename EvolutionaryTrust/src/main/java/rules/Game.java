package rules;

public class Game {


    public  Pair getPlayerScored(Player player1Type, Player player2Type) {

        return new RuleEngine().returnScoresUsingRules(player1Type.makeMove(), player2Type.makeMove());

    }
}
