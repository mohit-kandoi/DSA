package RECURSION.Sortings;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);  // new objects of array is created every time. so original array is unchanged
                               // so to update original array: arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j< second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
                k++;
            }else{
                mix[k] = second[j];
                j++;
                k++;
            }
        }
        // now, it may be possible that 1 of the array may not complete.
        // So, add all the remaining element of that array.

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
