package rules;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameIntegrationTest {

    private Player player1;
    private CooperateBehaviour cooperateBehaviour = new CooperateBehaviour();
    private CheatBehaviour cheatBehaviour = new CheatBehaviour();
    private Player player2;

    @Test
    public void shouldReturnScoreWhenBothPlayersAreCooperate() throws IOException {
        player1 = new Player(cooperateBehaviour);
        player2 = new Player(cooperateBehaviour);
        ScoreBoard scores = new Game(1).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(2, 2), scores);
    }

    @Test
    public void shouldReturnScoreWhenBothPlayersAreCheat() throws IOException {
        player1 = new Player(cheatBehaviour);
        player2 = new Player(cheatBehaviour);
        ScoreBoard scores = new Game(1).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(0, 0), scores);
    }

//    @Test
//    public void shouldReturnScoreWhenBothConsolePlayersAreCheat() throws IOException {
//        System.setIn(new ByteArrayInputStream("CO".getBytes()));
//        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
//        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferReader);
//        player1 = new Player(consolePlayer);
//        player2 = new Player(consolePlayer);
//        ScoreBoard scores = new Game(1).getPlayerScored(player1, player2);
//
//        assertEquals(new ScoreBoard(0, 0), scores);
//    }

    @Test
    public void shouldReturnScoreWhenBothConsolePlayersAreCooperate() throws IOException {
        BufferedReader bufferReader = mock(BufferedReader.class);
        when(bufferReader.readLine()).thenReturn("CO");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferReader);
        player1 = new Player(consolePlayer);
        player2 = new Player(consolePlayer);
        ScoreBoard scores = new Game(1).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(2, 2), scores);
    }

    @Test
    public void shouldReturnScoreWhenOneConsolePLayerIsCooperateAnotherIsCheat() throws IOException {
        BufferedReader bufferReader = mock(BufferedReader.class);
        when(bufferReader.readLine()).thenReturn("CO").thenReturn("CH");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferReader);
        player1 = new Player(consolePlayer);
        player2 = new Player(consolePlayer);
        ScoreBoard scores = new Game(1).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(-1, 3), scores);
    }

    @Test
    public void shouldReturnScoreWhenOneCopyCatPlayerAnotherCheatPlayer() throws IOException {
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        player1 = new Player(copyCatPlayer);
        player2= new Player(cheatBehaviour);
        ScoreBoard scores = new Game(2).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(-1, 3).toString(), scores.toString());
    }

    @Test
    public void shouldReturnScoreWhenOneCopyCatPlayerAnotherCooperatePLayer() throws IOException {
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        player1 = new Player(copyCatPlayer);
        player2= new Player(cooperateBehaviour);
        ScoreBoard scores = new Game(2).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(4, 4).toString(), scores.toString());
    }

    @Test
    public void shouldReturnScoreWhenOneCheatPlayerAnotherCopyCatPlayer() throws IOException {
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        player1 = new Player(cheatBehaviour);
        player2= new Player(copyCatPlayer);
        ScoreBoard scores = new Game(2).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(3, -1).toString(), scores.toString());
    }

    @Test
    public void shouldReturnScoreWhenOneCooperatePLayerAnotherCopyCatPlayer() throws IOException {
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        player1 = new Player(cooperateBehaviour);
        player2= new Player(copyCatPlayer);
        ScoreBoard scores = new Game(2).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(4, 4).toString(), scores.toString());
    }

    @Test
    public void shouldReturnScoreWhenOneConsolePLayerAnotherCopyCatPlayer() throws IOException {
        BufferedReader bufferReader = mock(BufferedReader.class);
        when(bufferReader.readLine()).thenReturn("CO").thenReturn("CH");
        ConsolePlayerBehaviour consolePlayer = new ConsolePlayerBehaviour(bufferReader);
        player1 = new Player(consolePlayer);
        player2 = new Player(new CopyCatPlayer());
        ScoreBoard scores = new Game(2).getPlayerScored(player1, player2);

        assertEquals(new ScoreBoard(5, 1), scores);
    }
}
