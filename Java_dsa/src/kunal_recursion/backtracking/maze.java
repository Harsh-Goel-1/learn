package kunal_recursion.backtracking;

import java.util.Arrays;

// backtracking has not started yet, just moving down, right and diagonal, not all directions
public class maze {
    public static void main(String[] args) {
        maze1(3,3, "");
        System.out.println();

        maze1_diagonal(3,3, "");
        System.out.println();

        maze1_obstacle(3,3, "");
        System.out.println();

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        // passing starting indices
        maze(0, 0, maze, "");
        System.out.println();

        int[][] path = new int[3][3];
        mazePrintPath(0, 0, maze, "", path, 1);
        System.out.println();
    }

    // rows and columns from 1 to n, top row being n,
    // you start from (n,1) and go to (1,n), you can only go R(right) and D(down)
    public static void maze1(int row, int column, String str){
        if(row == 1 && column == 1) {
            System.out.print(str + " ");
            return;
        }
        if(row > 1)
            maze1(row - 1, column, str + "D");
        if(column > 1)
            maze1(row, column - 1, str + "R");
    }

    // can move diagonal in maze1
    public static void maze1_diagonal(int row, int column, String str){
        if(row == 1 && column == 1) {
            System.out.print(str + " ");
            return;
        }
        if(row > 1)
            maze1_diagonal(row - 1, column, str + "D");
        if(column > 1)
            maze1_diagonal(row, column - 1, str + "R");
        if(row > 1 && column > 1)
            maze1_diagonal(row - 1, column - 1, str + "L");
    }

    // this time 3*3 matrix has a river on cell (2,2) i.e. the middle
    // maze is just a boolean matrix
    public static void maze1_obstacle(int row, int column, String str){
        if(row == 2 && column == 2)
            return;
        if(row == 1 && column == 1) {
            System.out.print(str + " ");
            return;
        }
        if(row > 1)
            maze1_obstacle(row - 1, column, str + "D");
        if(column > 1)
            maze1_obstacle(row, column - 1, str + "R");
        if(row > 1 && column > 1)
            maze1_obstacle(row - 1, column - 1, str + "L");
    }

    // backtracking --> reverting the changes we made in the recursive call when coming back up in the tree
    // we want to reach 2,2 from 0,0 for this case using all arrow keys
    public static void maze(int row, int column, boolean[][] matrix, String str)
    {
        if (!matrix[row][column]) {
            return;
        }

        if(row == 2 && column == 2) {
            System.out.print(str + " ");
            return;
        }

        // putting the square as marked
        matrix[row][column] = false;

        if(row < matrix.length - 1) {
            maze(row + 1, column, matrix, str + "D");
        }

        if(column < matrix[0].length - 1) {
            maze(row , column + 1, matrix, str + "R");
        }

        if(row > 0) {
            maze(row - 1, column, matrix, str + "U");
        }

        if(column > 0) {
            maze(row, column - 1, matrix, str + "L");
        }

        // the function and its child calls end here, so put the square back to unmarked
        matrix[row][column] = true;
    }

    public static void mazePrintPath(int row, int column, boolean[][] matrix, String str, int[][] path, int count)
    {
        if (!matrix[row][column]) {
            return;
        }

        if(row == 2 && column == 2) {
            path[row][column] = count;
            System.out.println(str + " ");
            for(int[] arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }

        path[row][column] = count;
        matrix[row][column] = false;

        if(row < matrix.length - 1) {
            mazePrintPath(row + 1, column, matrix, str + "D", path, count + 1);
        }

        if(column < matrix[0].length - 1) {
            mazePrintPath(row , column + 1, matrix, str + "R", path, count + 1);
        }

        if(row > 0) {
            mazePrintPath(row - 1, column, matrix, str + "U", path, count + 1);
        }

        if(column > 0) {
            mazePrintPath(row, column - 1, matrix, str + "L", path, count + 1);
        }

        path[row][column] = 0;
        matrix[row][column] = true;
    }
}
