package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testMakeMoveShouldAlwaysReturnCooperateMove() {
        Player cooperatePlayer = new Player();
        assertEquals(MoveType.COOPERATE.getMoveType(),cooperatePlayer.makeMove());
    }
}