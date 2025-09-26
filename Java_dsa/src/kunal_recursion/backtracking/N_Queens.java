package kunal_recursion.backtracking;

import java.util.*;

// N queens on a N*N board
public class N_Queens {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows on board: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n]; // by default has false
        System.out.println(queens(0, board));
        sc.close();
    }

    static void display(boolean[][] matrix) {
        for(boolean[] arr: matrix)
        {
            for(boolean bool: arr)
            {
                if(bool)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int queens(int row, boolean[][] matrix)
    {
        if(row == matrix.length) {
            display(matrix);
            return 1;
        }
        int count = 0;
        for(int col = 0; col < matrix[0].length; col++)
        {
            if(isSafe(row, col, matrix)) {
                matrix[row][col] = true;
                count += queens(row + 1, matrix);
                matrix[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(int row, int col, boolean[][] matrix) {
        //queen on same column
        for(int i = row - 1; i >= 0; i--)
        {
            if(matrix[i][col])
                return false;
        }

        //queen on left diagonal
        int k = Math.min(row, col);
        for(int i = 1; i <= k; i++)
        {
            if(matrix[row - i][col - i])
                return false;
        }

        //queen on right diagonal
        k = Math.min(row, matrix[0].length - col - 1);
        for(int i = 1; i <= k; i++)
        {
            if(matrix[row - i][col + i])
                return false;
        }

        return true;
    }
}
