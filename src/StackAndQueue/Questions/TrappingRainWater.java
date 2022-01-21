package StackAndQueue.Questions;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {3,0,0,2,0,4};

        int[] maxLeftOfArray = left(arr);
        int[] maxRightOfArray = right(arr);

        // the level at which water can fill maximum
        // min = MinimumOf(maxLeftOfArray, maxRightOfArray)
        int[] min = new int[arr.length];
        int[] water = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            min[i] = Math.min(maxRightOfArray[i], maxLeftOfArray[i]);
            water[i] = min[i] - arr[i];
            sum += water[i];
        }
        System.out.println(sum);

    }

    private static int[] right(int[] arr) {
        int[] maxRightOfArray = new int[arr.length];

        maxRightOfArray[arr.length-1] = arr[arr.length-1];
        int max = arr[arr.length-1];

        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > maxRightOfArray[i+1]){
                maxRightOfArray[i] = arr[i];
                max = arr[i];
            }
            else{
                maxRightOfArray[i] = max;
            }
        }
        return maxRightOfArray;
    }

    private static int[] left(int[] arr) {
        int[] maxLeftOfArray = new int[arr.length];
        maxLeftOfArray[0] = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxLeftOfArray[i-1]){
                maxLeftOfArray[i] = arr[i];
                max = arr[i];
            }
            else{
                maxLeftOfArray[i] = max;
            }
        }
        return maxLeftOfArray;
    }

}
