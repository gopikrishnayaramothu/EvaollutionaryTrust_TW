package rules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player(new CheatBehaviour());
        Player player2 = new Player(new CopyCatPlayer());

        try {
            new Game(2).getPlayerScored(player1, player2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
