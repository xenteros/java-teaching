package tictactoe.model;

import static java.util.Arrays.fill;
import static tictactoe.model.FieldState.EMPTY;

/**
 * Created by agurgul on 03.07.2017.
 */
public class TicTacToeGame {

    public final static int BOARD_SIZE = 3;
    private FieldState[][] board;

    public TicTacToeGame() {
        board = new FieldState[3][];
        for (FieldState[] fieldStates : board) {
            fieldStates = new FieldState[BOARD_SIZE];
            fill(fieldStates, EMPTY);
        }
    }
}
