package rules;

import java.io.IOException;

public class CopyCatPlayer implements PlayerBehaviour {

    private int count = 1;

    @Override
    public MoveType getMoveType() throws IOException {
        if (count == 1) {
            count++;
            return MoveType.COOPERATE;
        }
        else
            return MoveType.COPY;
    }
}
