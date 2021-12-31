package RECURSION.patterns;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args){
        // This will also follow the same process of star triangle pattern...
        int arr[] = {6,5,4,3,2,1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int row, int col){
        if (row == 0)
            return;
        int max = arr[0];
        if (col < row){
            if(max > arr[col+1]){
                int temp = arr[col+1];
                arr[col+1] = arr[col];
                arr[col] = temp;
            }
            sort(arr, row, col+1);
        }
        else{
            sort(arr,row-1,0);
        }
    }

}
