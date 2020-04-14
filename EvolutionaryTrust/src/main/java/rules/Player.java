package rules;

public class Player {

    String move = MoveType.COOPERATE.getMoveType();

//    public Player(String personType)
//    {
//        this.move = personType;
//    }
//
//    public Player()
//    {
//
//    }
    public String makeMove() {
        return move;
    }
}
