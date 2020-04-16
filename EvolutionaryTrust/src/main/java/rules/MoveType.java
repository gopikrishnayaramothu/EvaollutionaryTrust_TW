package rules;

public enum MoveType {
    COOPERATE("CO"),CHEAT("CH"),COPY("CP");
    String key;

    MoveType(String key) {
        this.key = key;
    }

    public static MoveType getMoveType(String input)
    {
        MoveType[] moveTypes = MoveType.values();
        for(MoveType moveType : moveTypes)
        {
            if(moveType.key.equals(input))
                return moveType;
        }
        return null;
    }

    public static String getMoveType(MoveType input)
    {
        MoveType[] moveTypes = MoveType.values();
        for(MoveType moveType : moveTypes)
        {
            if(moveType == input)
                return moveType.key;
        }
        return null;
    }
}
