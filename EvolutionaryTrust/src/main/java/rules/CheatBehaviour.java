package rules;

public class CheatBehaviour implements PlayerBehaviour {

    @Override
    public MoveType getMoveType() {
        return MoveType.CHEAT;
    }
}


// ConsolePLayer
// CH CO
// input from the player
// we should ready with the move