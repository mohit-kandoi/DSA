package Sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};

    //MY APPROACH
//        for (int i = 0; i < arr.length; i++) {
//
//            while(arr[i] != i+1){
//                int temp = arr[arr[i]-1];
//                arr[arr[i]-1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int i = 0;
        while(i < arr.length){

            if(arr[i] != arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
