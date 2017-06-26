package knight.recursive;
import knight.recursive.service.KnightProblemSolver;

/**
 * Created by agurgul on 26.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        KnightProblemSolver knightProblemSolver = new KnightProblemSolver();
        int[][] board = new int[6][6];
        board[0][0] = 1;
        board = knightProblemSolver.solve(board, 0,0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%2d ",board[i][j]);
            }
            System.out.println();
        }
    }
}
