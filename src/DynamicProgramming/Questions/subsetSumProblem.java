package DynamicProgramming.Questions;

public class subsetSumProblem {

    public static void main(String[] args) {

       int[] arr = {3, 34, 4, 12, 5, 2};
       int sum = 9;
       subsetSum(arr, sum);


    }
    static void subsetSum(int[] arr, int sum){
        boolean[][] table = new boolean[arr.length+1][sum+1];

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if(j == 0){
                    table[i][j] = true;
                }
//                else if(i == 0){
//                    table[i][j] = false;
//                }
                else if(i != 0 && arr[i-1] <= j){
                    table[i][j] = table[i-1][j - arr[i-1]] || table[i-1][j];
                }
                else if(i != 0 && arr[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
            }
        }

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(table[arr.length][sum]);
    }

}
