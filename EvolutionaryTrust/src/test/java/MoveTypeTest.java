import org.junit.Test;
import rules.MoveType;
;import static org.junit.Assert.assertEquals;

public class MoveTypeTest {
    @Test
    public void shouldReturnCheatIfTheKeyIsCheat() {
        MoveType move = MoveType.getMoveType("CH");

        assertEquals(MoveType.CHEAT,move);
    }

    @Test
    public void shouldReturnCorporateIfTheKeyIsCooperate() {
        MoveType move = MoveType.getMoveType("CO");

        assertEquals(MoveType.COOPERATE,move);
    }
}
