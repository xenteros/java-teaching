package tictactoe;

import tictactoe.model.FieldState;
import tictactoe.service.TicTacToeService;

/**
 * Created by agurgul on 03.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        TicTacToeService service = new TicTacToeService();
        service.move(0,0, FieldState.X);
        service.move(0,0,FieldState.O);
    }
}
