package Sorting;
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {6,4,2,1,5,3};
        boolean exit = true;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    exit = false;
                }
            }
            if (exit) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
