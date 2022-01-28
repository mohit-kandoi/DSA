package DynamicProgramming.Questions.LCS;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {

        String a = "agbcba";
        System.out.println(lcs(a));
    }
    static int lcs(String a){
        String b = "";
        for (int i = a.length()-1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n ; j++) {
                if (i==0 || j==0){
                    table[i][j] = 0;
                }
                else if (x[i-1] == y[j-1]){
                    table[i][j] = 1 + table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        return table[m][n];
    }
}
