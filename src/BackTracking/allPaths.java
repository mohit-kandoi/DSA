package BackTracking;
import java.util.Arrays;
import java.util.ArrayList;

public class allPaths {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int row, int col){
        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[row][col] == false){
            return;
        }

        // we are considering this block in our path.so,
        maze[row][col] = false;

        if (row < maze.length-1){
            allPath(p+"D", maze,row+1,col);
        }
        if (col < maze[0].length-1){
            allPath(p+"R", maze, row, col+1);
        }

        if (row > 0){
            allPath(p+"U", maze, row-1, col);
        }

        if (col > 0){
            allPath(p+"L", maze, row, col-1);
        }

        // at this line function will be over.
        // so before function get removed, also remove the changes that were made by that function.
        maze[row][col] = true;

        return;

    }


    static void allPathPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if (row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[row][col] == false){
            return;
        }

        // we are considering this block in our path.so,
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length-1){
            allPathPrint(p+"D", maze,row+1,col, path, step+1);
        }
        if (col < maze[0].length-1){
            allPathPrint(p+"R", maze, row, col+1, path, step+1);
        }

        if (row > 0){
            allPathPrint(p+"U", maze, row-1, col, path, step+1);
        }

        if (col > 0){
            allPathPrint(p+"L", maze, row, col-1, path, step+1);
        }

        // at this line function will be over.
        // so before function get removed, also remove the changes that were made by that function.
        maze[row][col] = true;
        path[row][col] = 0;

        return;

    }
}
