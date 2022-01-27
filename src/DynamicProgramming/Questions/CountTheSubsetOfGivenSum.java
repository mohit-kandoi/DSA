package DynamicProgramming.Questions;

public class CountTheSubsetOfGivenSum {
    public static void main(String[] args) {

       int arr[] = {2, 3, 5, 6, 8, 10};
       int sum = 10;
        System.out.println(count(arr,sum));

    }
    static int count(int[] arr, int sum){
        int[][] table = new int[arr.length+1][sum+1];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if(j == 0 ){
                    table[i][j] = 1;
                }
                else if(i!=0 && arr[i-1] <= j){
//                    table[i][j] = Math.max(arr[i-1]+table[i-1][j - arr[i-1]], table[i-1][j]);
                    table[i][j] = table[i-1][j - arr[i-1]]+table[i-1][j];
                }
                else if(i!=0 && arr[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
            }
        }

        return table[arr.length][sum];

    }
}
