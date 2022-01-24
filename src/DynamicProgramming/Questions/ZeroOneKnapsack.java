package DynamicProgramming.Questions;

public class ZeroOneKnapsack {
    public static void main(String[] args) {

        int N = 3;
        int W = 4;
        int[] values = {1,2,3};
        int[] weight = {4,5,1};
        System.out.println(knapSack(W,weight,values,N));

    }

    static int knapSack(int W, int wt[], int val[], int n)
    {
        if(W == 0 || n ==0){
            return 0;
        }
        if(wt[n-1] <= W){  // if item's weight is less than bag's capacity then we have a choice to put that object
            // in the bag or not.
           return Math.max(val[n-1]+knapSack(W-wt[n-1], wt, val, n-1), knapSack(W,wt,val,n-1));
        }
        else{
            // if item's weight is greater than bag's weight then item will directly rejected.
            return knapSack(W,wt,val,n-1);
        }
    }
}
