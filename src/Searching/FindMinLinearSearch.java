package Searching;

import java.util.Scanner;

public class FindMinLinearSearch {
    public static void main(String[] args) {
        int[] arr = {-221,5,6,7,-1,0,-78};
        System.out.println(MinValue(arr));
    }
    static int MinValue(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
