package kunal_recursion.backtracking;

import java.util.*;

public class NKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(0, 0, board, n));
    }

    static int knights(int row, int col, boolean[][] board, int knights)
    {
        if(knights == 0)
        {
            display(board);
            return 1;
        }
        if(row == board.length)
        {
            return 0;
        }
        if(col == board.length)
        {
            return knights(row + 1, 0, board, knights);
        }
        int count = 0;
        if(isValid(row, col, board))
        {
            board[row][col] = true;
            count += knights(row, col + 1, board,knights - 1); // place the knight
            board[row][col] = false;
        }
        count += knights(row, col + 1, board, knights); // even if valid, do not place the knight, move to next
        return count;
    }

    static boolean isValid(int row, int column, boolean[][] board)
    {
        if(isValidIndex(row - 1, column - 2, board))
            if(board[row - 1][column - 2])
                return false;

        if(isValidIndex(row + 1, column - 2, board))
            if(board[row + 1][column - 2])
                return false;

        if(isValidIndex(row - 2, column - 1, board))
            if(board[row - 2][column - 1])
                return false;

        if(isValidIndex(row + 2, column - 1, board))
            if(board[row + 2][column - 1])
                return false;

        if(isValidIndex(row - 1, column + 2, board))
            if(board[row - 1][column + 2])
                return false;

        if(isValidIndex(row + 1, column + 2, board))
            if(board[row + 1][column + 2])
                return false;

        if(isValidIndex(row - 2, column + 1, board))
            if(board[row - 2][column + 1])
                return false;

        if(isValidIndex(row + 2, column + 1, board))
            if(board[row + 2][column + 1])
                return false;

        return true;
    }

    static boolean isValidIndex(int row, int column, boolean[][] board)
    {
        if(row >= 0 && row < board.length && column >= 0 && column < board.length)
            return true;
        return false;
    }

    static void display(boolean[][] matrix) {
        for(boolean[] arr: matrix)
        {
            for(boolean bool: arr)
            {
                if(bool)
                    System.out.print("K ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
