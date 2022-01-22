package SlidingWindow.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumSumSubarrayofsizeK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(max(arr, k));
    }

    static int max(int[] Arr, int K){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum = sum + Arr[i];
        }
        list.add(sum);

        for (int i = K; i < Arr.length; i++) {
            sum = sum - Arr[i-K];
            sum = sum + Arr[i];
            list.add(sum);
        }
        return Collections.max(list);
    }
}
