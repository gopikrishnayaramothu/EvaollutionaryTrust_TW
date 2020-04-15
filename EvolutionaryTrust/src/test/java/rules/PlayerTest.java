package rules;

import org.junit.Test;

import static org.junit.Assert.*;
import static rules.MoveType.*;

public class PlayerTest {

    @Test
    public void shouldMakeMoveShouldAlwaysReturnCooperateMove() {
        Player cooperatePlayer = new Player(new CooperateBehaviour());
        assertEquals(COOPERATE,cooperatePlayer.makeMove());
    }

    @Test
    public void shouldMakeCheatMoveForCheatPlayer() {
        Player cheatPlayer = new Player(new CheatBehaviour());
        assertEquals(CHEAT, cheatPlayer.makeMove());
    }

}