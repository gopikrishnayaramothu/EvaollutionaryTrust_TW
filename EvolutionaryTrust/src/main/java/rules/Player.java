package rules;

import static rules.MoveType.*;

public class Player {

    MoveType playerType;

    public Player(MoveType playerType) {
        this.playerType = playerType;
    }

    public MoveType makeMove() {
        return playerType;
    }
}
