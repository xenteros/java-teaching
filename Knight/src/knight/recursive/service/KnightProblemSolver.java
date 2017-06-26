package knight.recursive.service;

/**
 * Created by agurgul on 26.06.2017.
 */
/**
 * Moves stored in array, to maximally 'simplify' the code for students.
 */
public class KnightProblemSolver {

    private int[] movesX;
    private int[] movesY;

    public KnightProblemSolver() {
        this.movesX = new int[]{1,  1, 2,  2, -1, -1, -2, -2};
        this.movesY = new int[]{2, -2, 1, -1,  2, -2,  1, -1};
    }

    public int[][] solve(int[][] board, int lastX, int lastY) {

        int n = board[lastX][lastY] + 1;
        int size = board.length;
        if (size * size == n-1) {
            return board;
        }

        for (int i = 0; i < movesX.length; i++) {
            int newX = lastX + movesX[i];
            int newY = lastY + movesY[i];
            if (newX < size && newY < size && newX >=0 && newY >=0 && board[newX][newY] == 0) {
                int[][] boardClone = new int[size][size];
                for (int j = 0; j < board.length; j++) {
                    boardClone[j] = board[j].clone();
                }
                boardClone[newX][newY] = n;
                boardClone = solve(boardClone, newX, newY);
                if (boardClone != null) {
                    return boardClone;
                }
            }
        }

        return null;
    }
}
