package rules;

public class CooperateBehaviour implements  PlayerBehaviour {

    @Override
    public MoveType getMoveType(){
        return MoveType.COOPERATE;
    }

}
