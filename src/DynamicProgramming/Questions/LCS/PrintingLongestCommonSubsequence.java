package DynamicProgramming.Questions.LCS;

import java.util.Collections;

public class PrintingLongestCommonSubsequence {
    public static void main(String[] args) {

        String s1 = "AATCC";
        String s2= "ACACG";
        System.out.println(LCS(s1,s2));

    }
    static StringBuilder LCS(String s1, String s2){
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int[][] table = new int[X.length+1][Y.length+1];

        for (int i = 0; i <= X.length; i++) {
            for (int j = 0; j <= Y.length; j++) {
                if (i==0 || j==0){
                    table[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]){
                    table[i][j] = 1 + table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }

        StringBuilder ans = new StringBuilder("");
        int i = X.length;
        int j = Y.length;
        while (i>0 && j>0){
            if (X[i-1] == Y[j-1]){
                ans = ans.append(X[i-1]);
                j--;
                i--;
            }
            else{
                if (table[i-1][j] > table[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }
        }
        ans.reverse();
        return ans;
    }
}
