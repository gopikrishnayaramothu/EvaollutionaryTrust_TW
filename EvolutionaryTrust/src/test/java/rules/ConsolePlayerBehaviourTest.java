package rules;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsolePlayerBehaviourTest {

    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void shouldReturnCooperateMoveForCOInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("CO");
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour(bufferedReader);

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertEquals(MoveType.COOPERATE, moveTypes);
    }

    @Test
    public void shouldReturnCheatMoveForCHInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("CH");
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour(bufferedReader);

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertEquals(MoveType.CHEAT, moveTypes);
    }

    @Test
    public void shouldReturnNullMoveForCXInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("CX");
        ConsolePlayerBehaviour consolePlayerBehaviour = new ConsolePlayerBehaviour(bufferedReader);

        MoveType moveTypes = consolePlayerBehaviour.getMoveType();

        assertNull( moveTypes);
    }
}
