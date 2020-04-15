package rules;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsolePlayerBehaviour implements PlayerBehaviour{

    BufferedReader bufferedReader ;

    public ConsolePlayerBehaviour(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public MoveType getMoveType() throws IOException {
        System.out.println("Please Enter Your Move");
        String input = bufferedReader.readLine();
        return MoveType.getMoveType(input);
    }
}
