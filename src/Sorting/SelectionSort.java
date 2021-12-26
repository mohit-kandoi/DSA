package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = {5,3,1,2,4,6,15,10,0};

        for (int i = 0; i < arr.length; i++) {

            int max = 0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[max];
            arr[max] = temp;

        }
        System.out.println(Arrays.toString(arr));
        
    }
    
}
