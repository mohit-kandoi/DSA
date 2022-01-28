package DynamicProgramming.Questions.LCS;

public class PrintLongestCommonSuperSequence {
    public static void main(String[] args) {
        String a = "HELLO";
        String b = "GEEk";
        System.out.println(lcs(a,b));
    }
    static StringBuilder lcs(String a, String b){
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <=m ; i++) {
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
        // Print lCS:
        StringBuilder lcs = new StringBuilder("");
        int i = x.length;
        int j = y.length;
        while(i>0 && j>0){
            if (x[i-1] == y[j-1]){
                lcs.append(x[i-1]);
                i--;
                j--;
            }else{
                if (table[i-1][j] > table[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }

        StringBuilder ans = new StringBuilder("");
        int aLength = 0;
        int bLength = 0;
        int lcsLength = lcs.length()-1;
//        int lcsLength = table[m][n];
        while(aLength < x.length && bLength < y.length){
            if (x[aLength] ==lcs.charAt(lcsLength) &&  y[bLength]==lcs.charAt(lcsLength)){
                ans.append(x[aLength]);
                aLength++;
                bLength++;
                lcsLength--;
                if(lcsLength < 0){
                    break;
                }
            }
            if(lcs.charAt(lcsLength) != x[aLength]){
                ans.append(x[aLength]);
                aLength++;
            }
            if(lcs.charAt(lcsLength) != y[bLength]){
                ans.append(y[bLength]);
                bLength++;
            }
        }
        while(aLength < a.length()){
            ans.append(x[aLength]);
            aLength++;
        }
        while(bLength < b.length()){
            ans.append(y[bLength]);
            bLength++;
        }
        return ans;
    }
}
