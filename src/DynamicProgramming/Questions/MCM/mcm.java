package DynamicProgramming.Questions.MCM;

public class mcm {
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int[][] table = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                table[i][j] = -1;
            }
        }
        System.out.println(mcm(arr,1,arr.length-1, table));

    }
    static int mcm(int[] arr, int i, int j, int[][] table){

        if (i >= j)
            return 0;
        if (table[i][j] != -1){
            return table[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {

            int tempAns = mcm(arr,i,k,table) + mcm(arr,k+1,j,table) + (arr[i-1]*arr[k]*arr[j]);
            if (tempAns < min) {
                min = tempAns;
            }
        }
        table[i][j] = min;
        return table[i][j];
    }
}
