package tictactoe.model;

import java.util.Arrays;
import java.util.Optional;

import static java.lang.String.format;
import static java.util.Arrays.fill;
import static java.util.Arrays.stream;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import static java.util.stream.Collectors.toList;
import static tictactoe.model.FieldState.EMPTY;

/**
 * Created by agurgul on 03.07.2017.
 */
public class TicTacToeGame {

    public final static int BOARD_SIZE = 3;
    private FieldState[][] board;

    public TicTacToeGame() {
        board = new FieldState[3][];
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[i] = new FieldState[BOARD_SIZE];
            fill(board[i], EMPTY);
        }
    }

    public boolean isMoveLegal(int x, int y) {
        try {
            return board[x][y].equals(EMPTY);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public void move(int x, int y, FieldState state) {
        if (isMoveLegal(x, y)) {
            board[x][y] = state;
        } else {
            throw new IllegalArgumentException(format("There is already %s on this field (%d, %d).", board[x][y].toString(), x, y));
        }
    }

    public Optional<FieldState> isGameWon() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                return of(board[i][0]);
            }
            if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                return of(board[0][i]);
            }
        }
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return of(board[0][0]);
        }
        if (board[0][2].equals(board[1][1]) && board[2][0].equals(board[0][2])) {
            return of(board[1][1]);
        }
        return empty();
    }

    public boolean isGameEnded() {
        return stream(board)
                .flatMap(Arrays::stream)
                .filter(FieldState::empty)
                .collect(toList())
                .isEmpty();
    }
}
