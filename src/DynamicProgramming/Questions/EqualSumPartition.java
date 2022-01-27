package DynamicProgramming.Questions;

//IMPORTANT QUESTION:

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1};
        System.out.println(sum(nums));
    }
    static boolean sum(int[] nums){

        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total +=nums[i];
        }
        if (total%2 != 0)
            return false; //sum is odd, so we cannot divide this array into two parts.
        else{
            return subsetSum(nums, (int)total/2);
        }
    }
    static boolean subsetSum(int[] nums, int sum){

        boolean[][] table = new boolean[nums.length+1][sum+1];
        // initially by default all the boxes will be false.

        //Initializing i==0 and j==0:
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0){
                    table[i][j] = true;
                }
            }
        }

        // Fill the table:
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (nums[i-1] <= j){
                    table[i][j] = table[i-1][j - nums[i-1]] || table[i-1][j];
                }
                else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[nums.length][sum];
    }
}
