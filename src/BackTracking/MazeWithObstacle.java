package BackTracking;

public class MazeWithObstacle {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazeObstacle1("", maze,0,0);
    }

    // My APPROACH:
    static void mazeObstacle(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if (row > 1 && !(row == 2 && col ==2)){
            mazeObstacle(p+"D", row-1, col);
        }
        if (col > 1 && !(row == 2 && col ==2)){
            mazeObstacle(p+"R", row, col-1);
        }

        return;
    }
    // Kunal's approach:

    static void mazeObstacle1(String p, boolean[][] maze ,int row, int col){
        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[row][col] == false){
            return;
        }
        if (row < maze.length-1){
            mazeObstacle1(p+"D", maze,row+1, col);
        }
        if (col < maze[0].length-1){
            mazeObstacle1(p+"R", maze,row, col+1);
        }
        return;
    }
}
