package BackTracking;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class MAZE {
    public static void main(String[] args){

        int row = 3;
        int col = 3;
//        String ans = mazePATHprint("",row, col);
//        System.out.println(ans);

//        ArrayList<String> ans =  mazeArraylist("", row, col);
//        System.out.println(ans);

        mazePATHprintDiagonal("", row, col);

    }

    // Counting the PATH:
    static int mazePathCount(int row, int col){
        if (row == 1 || col == 1)
            return 1;

        int left = mazePathCount(row-1, col);
        int right = mazePathCount(row, col-1);

        return left+right;
    }

    // Printing the PATH: IMPORTANT
    static void mazePATHprint(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if (row > 1){
            mazePATHprint(p+"D", row-1, col);
        }
        if (col > 1){
           mazePATHprint(p+"R", row, col-1);
        }

        return;
    }

    // Returning the Arraylist: IMPORTANT
    static ArrayList<String> mazeArraylist(String p, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();
        // instead of taking two arraylist, create one list and add all the element in that only.

        if (row > 1){
            left.addAll(mazeArraylist(p+"D", row-1, col));
        }
        if (col > 1){
            left.addAll(mazeArraylist(p+"R", row, col-1));
        }
        return left;
    }

    // Adding Diagonal PATHs:

    static void mazePATHprintDiagonal(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if (row > 1){
            mazePATHprintDiagonal(p+"Down ", row-1, col);
        }
        if (col > 1){
            mazePATHprintDiagonal(p+"Right ", row, col-1);
        }
        if (row > 1 && col > 1){
            mazePATHprintDiagonal(p+"Diagonal ", row-1, col-1);
        }

        return;
    }
}
