package DynamicProgramming.Questions;

import java.util.Arrays;
public class ZeroOneKnapsackMemoization {


    public static void main(String[] args) {

        int[] val = { 10,20,30 };
        int[] wt = {1,1,1};
        int W = 2;
        int n = wt.length;

        int[][] arr = new int[n+1][W+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                arr[i][j] = -1;
            }
        }

        System.out.println(memoization(wt, val,W,n,arr));


    }

    public static int memoization(int[] wt, int[] val, int W, int n,int[][] arr){

        if (n==0 || W==0){
            return 0;
        }
        if(arr[n][W] != -1){
            return arr[n][W];
        }

        if(wt[n-1] <= W){
            return arr[n][W] = Math.max(val[n-1]+memoization(wt,val,W-wt[n-1],n-1,arr), memoization(wt,val,W,n-1,arr));

        }
        else{
            return arr[n][W] = memoization(wt,val,W,n-1,arr);

        }
    }
}
