package Revision;

import java.util.Arrays;
import java.util.HashMap;

public class subarrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        System.out.println(Arrays.toString(sum(arr, k)));

    }
    static int[] sum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int sum = 0;
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (map.containsKey(sum-k)) {
                ans[0] = map.get(sum-k) + 1;
                ans[1] = i;
            }
            map.put(sum, i);
        }
        return ans;
    }
}
