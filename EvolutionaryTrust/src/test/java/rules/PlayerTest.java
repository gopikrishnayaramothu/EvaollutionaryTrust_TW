package rules;

import org.junit.Test;

import static org.junit.Assert.*;
import static rules.MoveType.*;

public class PlayerTest {

    @Test
    public void testMakeMoveShouldAlwaysReturnCooperateMove() {
        Player cooperatePlayer = new Player(COOPERATE);
        assertEquals(COOPERATE,cooperatePlayer.makeMove());
    }
}