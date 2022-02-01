package Revision;

import java.util.HashMap;

public class largestSubarrayWithBinaryDigit {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,0,0};
        int target = 0;
        System.out.println(largest(arr,target));

    }
    static int largest(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = -1;
            }
        }
        map.put(0,-1);
        int sum = 0;
        int start = 0;
        int end = -1;
        int max = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(map.containsKey(sum-target)){
                start = map.get(sum-target)+1;
                end = i;
                length = end-start+1;
            }
            max = Math.max(length,max);
        }
        return max;
    }
}
