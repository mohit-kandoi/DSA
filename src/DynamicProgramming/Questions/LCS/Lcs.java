package DynamicProgramming.Questions.LCS;

public class Lcs {
    public static void main(String[] args) {

        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;
//        System.out.println(count2(s1,s2));

//        int[][] table = new int[m+1][n+1];
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j <= n; j++) {
//                table[i][j] = -1;
//            }
//        }
        System.out.println(TopDown(X,Y,m,n));

    }

    static int count1(char[] X, char[] Y, int m, int n){

        if (m == 0 || n==0){
            return 0;
        }
        if (X[m-1] == Y[n-1]){
            return (1+count1(X,Y,m-1,n-1));
        }else{
            return Math.max(count1(X,Y,m-1,n), count1(X,Y,m,n-1));
        }

    }

    static int count2(String s1, String s2){
        if (s1.length() ==0 || s2.length()==0){
            return 0;
        }
        if (s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            return (1 + count2(s1.substring(0,s1.length()-1), s2.substring(0,s2.length()-1)));
        }else{
            return Math.max(count2(s1, s2.substring(0,s2.length()-1)),
                    count2(s1.substring(0,s1.length()-1), s2));
        }
    }

    static int memoization(char[] X, char[] Y, int m, int n,int[][] table){
        if (m == 0 || n==0){
            return 0;
        }
        if(table[m][n] != -1){
            return table[m][n];
        }
        if (X[m-1] == Y[n-1]){
            return table[m][n] = (1+count1(X,Y,m-1,n-1));
        }else{
            return table[m][n] = Math.max(count1(X,Y,m-1,n), count1(X,Y,m,n-1));
        }
    }

    static int TopDown(char[] X, char[] Y, int m, int n){
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 || j == 0){
                    table[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]){
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        return table[m][n];
    }
}
