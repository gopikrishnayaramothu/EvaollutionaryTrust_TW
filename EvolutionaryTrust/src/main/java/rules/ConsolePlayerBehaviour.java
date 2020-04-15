package rules;

import java.util.Scanner;

public class ConsolePlayerBehaviour implements PlayerBehaviour{

    public MoveType getMoveTypeForTest(String input) {
        //return input == "CH" ? MoveType.CHEAT : (input == "CO" ? MoveType.COOPERATE : null);
        return MoveType.getMoveType(input);
    }

    @Override
    public MoveType getMoveType() {
        System.out.println("Please Enter Your Move");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return getMoveTypeForTest(input);
    }
}
