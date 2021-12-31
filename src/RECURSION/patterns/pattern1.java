package RECURSION.patterns;

public class pattern1 {

    public static void main(String[] args){
        int n = 4;
        patternKunal(n , 0);
    }

    // MY APPROACH:

    static void pattern(int n){
        if (n==0)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        pattern(--n);
    }

    // KUNAL's APPROACH:

    static void patternKunal(int row, int col){
        if (row == 0)
            return;
        if (col < row){
            System.out.print("*"+" ");
            patternKunal(row, col+1);
        }
        else{
            System.out.println();
            patternKunal(row-1,0);
        }
    }

}
