package rules;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    private Player cooperatePlayer = new Player(new CooperateBehaviour());
    private Player cheatPlayer = new Player(new CheatBehaviour());
    private ScoreBoard scores;
    private RuleEngine ruleEngine;

    @Before
    public void setUp() throws Exception {
        ruleEngine = mock(RuleEngine.class);
    }

    @Test
    public void shouldReturnCooperatePlayerCheatPlayerScoreForOneRound() throws IOException {
        ScoreBoard scoreBoard = new ScoreBoard(-1, 3);
        when(ruleEngine.scores(MoveType.COOPERATE,MoveType.CHEAT)).thenReturn(scoreBoard);

        scores = new Game(1).getPlayerScored(cooperatePlayer, cheatPlayer);

        assertEquals(scoreBoard, scores);
    }

    @Test
    public void shouldReturnCooperatePlayerCooperatePlayerScoreForNRounds() throws IOException {
        ScoreBoard scoreBoard = new ScoreBoard(2, 2);
        when(ruleEngine.scores(MoveType.COOPERATE,MoveType.COOPERATE)).thenReturn(scoreBoard);

        scores = new Game(3).getPlayerScored(cooperatePlayer, cooperatePlayer);

        ScoreBoard scoreBoardAfterThreeRounds = new ScoreBoard(6, 6);
        assertEquals(scoreBoardAfterThreeRounds, scores);
    }

    @Test
    public void shouldReturnCooperatePlayerCheatPlayerScoreForNRounds() throws IOException {
        ScoreBoard scoreBoard = new ScoreBoard(-1, 3);
        when(ruleEngine.scores(MoveType.COOPERATE,MoveType.CHEAT)).thenReturn(scoreBoard);

        scores = new Game(3).getPlayerScored(cooperatePlayer, cheatPlayer);

        ScoreBoard scoreBoardAfterThreeRounds = new ScoreBoard(-3, 9);
        assertEquals(scoreBoardAfterThreeRounds, scores);
    }
}