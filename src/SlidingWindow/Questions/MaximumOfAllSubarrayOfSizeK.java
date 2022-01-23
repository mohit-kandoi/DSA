package SlidingWindow.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {

       int[] nums = {1,3,-1,-3,5,3,6,7};
       int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[arr.length-k+1];
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }
        ans[0] = Collections.max(list);

        for (int i = k; i < arr.length; i++) {
            list.remove(0);
            list.add(arr[i]);
            ans[i-k+1] = Collections.max(list);
        }
        return ans;
    }
}
