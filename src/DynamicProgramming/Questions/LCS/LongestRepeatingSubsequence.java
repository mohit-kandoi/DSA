package DynamicProgramming.Questions.LCS;

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String a = "AABEBCDD";
        System.out.println(LongestRepeatingSubsequence(a));
    }

    public static int LongestRepeatingSubsequence(String a)
    {
        String b = a;
        char[] X = a.toCharArray();
        char[] Y = b.toCharArray();
        int m = X.length;
        int n = m;
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 || j == 0){
                    table[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1] && i!=j){ // MINOR CHANGE in LCS (i!==j);
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }
        return table[m][n];

    }
}
