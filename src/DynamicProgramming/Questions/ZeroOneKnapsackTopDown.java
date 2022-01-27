package DynamicProgramming.Questions;

public class ZeroOneKnapsackTopDown {

    public static void main(String[] args) {

        int[] wt = {10,20,30};
        int[] val = {60,100,120};
        int w = 50;
        int n = wt.length;
        System.out.println(TopDown(wt,val,w,n));

    }

    static int TopDown(int[] wt,int[] val, int w, int n){
        int[][] arr = new int[n+1][w+1];

        //Initialization:
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                // Initializing elements:
                if(i==0 || j==0){
                    arr[i][j] = 0;
                }
                // Filling rest of the matrix:
                else if (wt[i-1] <= j){
                    arr[i][j] = Math.max(val[i-1] + arr[i-1][j-wt[i-1]], arr[i-1][j]);
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr[n][w];
    }

}
