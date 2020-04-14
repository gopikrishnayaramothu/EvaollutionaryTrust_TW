package rules;

import org.junit.Test;

import static org.junit.Assert.*;
import static rules.MoveType.*;

public class MoveTypeTest {

    @Test
    public void testGetMoveTypeAlwaysReturnCooperate() {

        assertEquals("COOPERATE",COOPERATE.getMoveType());
    }
}