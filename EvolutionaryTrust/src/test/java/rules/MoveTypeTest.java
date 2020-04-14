package rules;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveTypeTest {

    @Test
    public void testGetMoveTypeAlwaysReturnCooperate() {

        assertEquals("COOPERATE",MoveType.COOPERATE.getMoveType());
    }
}