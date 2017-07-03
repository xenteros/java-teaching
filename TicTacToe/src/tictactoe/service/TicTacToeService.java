package tictactoe.service;

import tictactoe.model.FieldState;
import tictactoe.model.TicTacToeGame;

/**
 * Created by agurgul on 03.07.2017.
 */
public class TicTacToeService {

    private TicTacToeGame board;
    private boolean xMoves;

    public TicTacToeService() {
        board = new TicTacToeGame();
        xMoves = true;
    }

    public void move(int x, int y, FieldState state) {
        if (board.isMoveLegal(x, y)) {
            board.move(x, y, state);
        }
    }
}
