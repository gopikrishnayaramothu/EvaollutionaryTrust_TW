import org.junit.Test;
import rules.MoveType;
;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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

    @Test
    public void shouldReturnNullIfTheKeyIsInvalid() {
        MoveType move = MoveType.getMoveType("INVALID");

        assertNull(move);
    }

    @Test
    public void shouldReturnCOIFTheMOveTypeIsCOOPERATE() {
        String cooperateMoveValue = MoveType.getMoveType(MoveType.COOPERATE);

        assertEquals("CO",cooperateMoveValue);
    }
}
