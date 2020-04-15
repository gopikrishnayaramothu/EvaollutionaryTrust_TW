package rules;

import java.io.IOException;

public class Player {

    PlayerBehaviour playerType;

    public Player(PlayerBehaviour playerType) {
        this.playerType = playerType;
    }

    public MoveType makeMove() throws IOException {
        return playerType.getMoveType();
    }
}

