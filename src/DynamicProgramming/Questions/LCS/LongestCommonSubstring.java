package DynamicProgramming.Questions.LCS;

public class LongestCommonSubstring {
    public static void main(String[] args) {

        String S1 = "adac";
        String S2 = "adadac";
        System.out.println(longestCommonSubstr(S1,S2));

    }
    static int longestCommonSubstr(String S1, String S2){
        char[] text1 = S1.toCharArray();
        char[] text2 = S2.toCharArray();

        int[][] table = new int[text1.length+1][text2.length+1];


        for(int i = 0; i <= text1.length; i++ ){
            for(int j = 0; j <= text2.length; j++){

                if (i == 0 || j == 0){
                    table[i][j] = 0;
                }
                else if (text1[i-1] == text2[j-1]){
                    table[i][j] = 1 + table[i-1][j-1];
                }else{
//                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                    table[i][j] = 0;
                }
            }
        }
        for (int i = 0; i <= text1.length; i++) {
            for (int j = 0; j <= text2.length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        return table[text1.length][text2.length];
    }
}
