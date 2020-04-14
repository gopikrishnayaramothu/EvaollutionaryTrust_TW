package rules;

public enum MoveType {

    COOPERATE("COOPERATE"),CHEAT("CHEAT");
    private String value;

    MoveType(String value)
    {
        this.value = value;
    }

    public String getMoveType() {
        return value;
    }
}
