package ExtraQuestions;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        // BRUTE FORCED but can be done in O(n) using HASHMAPs.

        int[] nums = {1,-1,0};
        int k = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
