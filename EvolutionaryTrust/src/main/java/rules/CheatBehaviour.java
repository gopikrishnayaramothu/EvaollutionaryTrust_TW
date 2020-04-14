package rules;

public class CheatBehaviour implements PlayerBehaviour {

    @Override
    public MoveType getMoveType() {
        return MoveType.CHEAT;
    }
}
