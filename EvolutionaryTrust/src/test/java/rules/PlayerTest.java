package rules;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static rules.MoveType.*;

public class PlayerTest {

    BufferedReader bufferedReader;
    @Before
    public void setUp()
    {
        bufferedReader = mock(BufferedReader.class);
    }
    @Test
    public void shouldMakeMoveShouldAlwaysReturnCooperateMove() throws IOException {
        Player cooperatePlayer = new Player(new CooperateBehaviour());
        assertEquals(COOPERATE,cooperatePlayer.makeMove());
    }

    @Test
    public void shouldMakeCheatMoveForCheatPlayer() throws IOException {
        Player cheatPlayer = new Player(new CheatBehaviour());
        assertEquals(CHEAT, cheatPlayer.makeMove());
    }

    @Test
    public void shouldMakeCooperateMoveForConsolePlayerWithCOAsInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("CO");
        Player consolePlayer = new Player(new ConsolePlayerBehaviour(bufferedReader));

        assertEquals(COOPERATE,consolePlayer.makeMove());

    }

    @Test
    public void shouldMakeCheatMoveForConsolePlayerWithCHAsInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("CH");
        Player consolePlayer = new Player(new ConsolePlayerBehaviour(bufferedReader));

        assertEquals(CHEAT,consolePlayer.makeMove());

    }

}