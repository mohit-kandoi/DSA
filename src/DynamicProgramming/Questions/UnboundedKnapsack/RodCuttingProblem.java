package DynamicProgramming.Questions.UnboundedKnapsack;

public class RodCuttingProblem {
    public static void main(String[] args) {
        int[] prices = {1 ,5 ,8, 9 ,10 ,17 ,17 ,20};
        int n = 8;
        System.out.println(cutRod(prices,n));
    }
    public static int cutRod(int price[], int n) {
        int[] pieces = new int[price.length];
        for(int i=1; i<=pieces.length; i++){
            pieces[i-1] = i;
        }

        int[][] table = new int[n+1][pieces.length+1];
        for(int i =0 ; i<= n; i++){
            for(int j = 0; j<=pieces.length; j++){
                if(i ==0 && j==0){
                    table[i][j] = 0;
                }
                else if(i!=0 && pieces[i-1] <= j){
                    table[i][j] = Math.max(price[i-1]+table[i][j-pieces[i-1]], table[i-1][j]);
                }
                else if(i!=0 && pieces[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= pieces.length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        return table[n][pieces.length];
    }
}
