package DynamicProgramming.Questions.LCS;

public class ConvertStringAtoB {
    public static void main(String[] args) {
        String a= "heap";
        String b = "pea";

    }
    static int LCS(String a, String b){
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
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
        int lcsLength = table[m][n];

        // To convert String a to b, first convert A to LCS so we have to delete some character
        // which will be equal to:
        int deletion = a.length() - lcsLength;

        //Now, convert LCS into string B for which we have to insert some char:

        int insert  = b.length() - lcsLength;

        int ans = deletion+insert;
        return ans;
    }
}
