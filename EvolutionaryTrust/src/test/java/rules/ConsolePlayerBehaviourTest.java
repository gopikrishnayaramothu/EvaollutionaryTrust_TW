package rules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.mockito.*;

public class ConsolePlayerBehaviourTest {

    @Test
    public void shouldReturnCheatMoveForCHInputFromPlayer() {
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour();

        MoveType moveTypes = consolePlayerBehaviour.getMoveTypeForTest("CH");

        assertEquals(MoveType.CHEAT, moveTypes);
    }

    @Test
    public void shouldReturnCooperateMoveForCOInputFromPlayer() {
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour();
        Mockito.spy(consolePlayerBehaviour);
        Mockito.doReturn(MoveType.COOPERATE).when(consolePlayerBehaviour.getMoveType());

        MoveType moveTypes = consolePlayerBehaviour.getMoveTypeForTest("CO");

        assertEquals(MoveType.COOPERATE, moveTypes);
        assertEquals(MoveType.COOPERATE, consolePlayerBehaviour.getMoveType());
    }
}