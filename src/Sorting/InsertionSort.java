package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){

        int[] arr = {5,3,4,1,2,23,5,46,50};

        for (int i = 0; i < arr.length-1; i++) {

            int pick = i+1;
            for (int j = arr.length-(arr.length-i); j >= 0  ; j--) {

                if(arr[pick] < arr[j]){
                    int temp = arr[pick];
                    arr[pick] = arr[j];
                    arr[j] = temp;

                    pick = j;
                }else{
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
