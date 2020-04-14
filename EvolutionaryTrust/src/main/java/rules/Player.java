package rules;

public class Player {

    PlayerBehaviour playerType;

    public Player(PlayerBehaviour playerType) {
        this.playerType = playerType;
    }

    public MoveType makeMove() {
        return playerType.getMoveType();
    }
}

