package rules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;

public class ConsolePlayerBehaviourTest {

    private ByteArrayInputStream getSystem(String moveType)
    {
        return new ByteArrayInputStream(moveType.getBytes());
    }
    @Test
    public void shouldReturnCooperateMoveForCOInput()
    {
        System.setIn(getSystem("CO"));
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour();

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertEquals(MoveType.COOPERATE, moveTypes);
    }

    @Test
    public void shouldReturnCheatMoveForCHInput()
    {
        System.setIn(getSystem("CH"));
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour();

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertEquals(MoveType.CHEAT, moveTypes);
    }

    @Test
    public void shouldReturnNullMoveForCXInput()
    {
        System.setIn(getSystem("CX"));
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour();

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertNull( moveTypes);
    }
}
