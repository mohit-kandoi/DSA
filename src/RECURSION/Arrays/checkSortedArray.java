package RECURSION.Arrays;

public class checkSortedArray {

    public static void main(String[] args){
        int[] arr = {1,2,4,6,7,11,10};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int index){
        if (arr[index] == arr[arr.length-1]){
            return true;
        }
        if (arr[index] > arr[index+1]){
            return false;
        }
        index++;
        return sorted(arr, index);
    }

}
