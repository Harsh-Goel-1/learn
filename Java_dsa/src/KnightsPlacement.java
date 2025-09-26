import java.util.Scanner;

public class KnightsPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int knights = sc.nextInt();  // Number of knights to place
        boolean[][] board = new boolean[n][n];
        System.out.println("Number of valid ways to place " + knights + " knights on a " + n + "x" + n + " board: " + knights(0, 0, board, knights));
    }

    static int knights(int row, int col, boolean[][] board, int knights) {
        if (knights == 0) {
            display(board);
            return 1;  // Found a valid configuration
        }
        if (row == board.length) {
            return 0;  // Reached the end of the board without placing all knights
        }
        if (col == board[0].length) {
            return knights(row + 1, 0, board, knights);  // Move to the next row
        }

        int count = 0;

        // Place the knight if it's a valid position
        if (isValid(row, col, board)) {
            board[row][col] = true;
            count += knights(row, col + 1, board, knights - 1);  // Place the knight and move to the next column
            board[row][col] = false;  // Backtrack
        }

        // Try the next column without placing a knight
        count += knights(row, col + 1, board, knights);

        return count;
    }

    // Check if it's valid to place a knight at board[row][col]
    static boolean isValid(int row, int col, boolean[][] board) {
        // Check all possible knight move positions to ensure no knights attack this position
        int[][] directions = {
                {-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValidIndex(newRow, newCol, board) && board[newRow][newCol]) {
                return false;  // A knight can attack this position
            }
        }
        return true;  // Safe to place a knight here
    }

    // Check if the given position is within the bounds of the board
    static boolean isValidIndex(int row, int col, boolean[][] board) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    // Display the current board configuration
    static void display(boolean[][] matrix) {
        for (boolean[] row : matrix) {
            for (boolean cell : row) {
                if (cell) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

