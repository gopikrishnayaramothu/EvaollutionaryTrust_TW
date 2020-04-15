package rules;

import java.util.Scanner;

public class ConsolePlayerBehaviour implements PlayerBehaviour{

    @Override
    public MoveType getMoveType() {
        System.out.println("Please Enter Your Move");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return MoveType.getMoveType(input);
    }
}
