package rules;

import java.io.IOException;

public interface PlayerBehaviour {
    public MoveType getMoveType() throws IOException;
}
