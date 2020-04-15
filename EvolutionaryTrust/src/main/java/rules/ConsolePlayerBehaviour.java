package rules;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsolePlayerBehaviour implements PlayerBehaviour {

    private BufferedReader bufferedReader;

    public ConsolePlayerBehaviour(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public MoveType getMoveType() throws IOException {
        System.out.println("Please Enter Your Move");
        String input = bufferedReader.readLine();
        MoveType returnMove = MoveType.getMoveType(input);
        try {
            if (null == returnMove) throw new Exception();
        } catch (Exception e) {
            System.out.println("Invalid Move so exiting the Game");
            System.exit(0);
        }
        return returnMove;
    }
}
