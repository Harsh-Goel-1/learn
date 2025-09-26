package kunal_recursion.backtracking;

public class sudoku_solver {

    static boolean solve(char[][] board)
    {
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                if(board[r][c] == '.')
                {
                    for(char i = '1'; i <= '9'; i++)
                    {
                        if(isValid(board, r, c, i))
                        {
                            board[r][c] = i;
                            if(solve(board))
                                return true;
                            else
                                board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] board, int row, int column, char num)
    {
        for(int i = 0; i < 9; i++)
        {
            if(board[row][i] == num)
                return false;
            if(board[i][column] == num)
                return false;
            if(board[3*(row/3) + i/3][3*(column/3) + i%3] == num)
                return false;
        }
        return true;
    }
}
