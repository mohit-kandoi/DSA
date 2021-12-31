package RECURSION.patterns;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args){

        // This problem is exactly follow the concept of star Triangle pattern.

    int arr[] = {5,4,3,2,1};
    bubbleSort(arr, arr.length-1, 0);
    System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int row, int col){
        if (row == 0)
            return;
        if (col < row){
            if(arr[col] > arr[col+1]){
                int temp = arr[col+1];
                arr[col+1] = arr[col];
                arr[col] = temp;
            }
            bubbleSort(arr, row, col+1);
        }
        else{
            bubbleSort(arr,row-1,0);
        }
    }



}
