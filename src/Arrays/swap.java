package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,3,5,7,9};
        System.out.println("enter index which you want to swap: ");
        int i = in.nextInt();
        int j = in.nextInt();
        swap(arr,i ,j);
    }
    static void swap(int[] arr, int i, int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
//        for (int k = 0; k < 5; k++) {
//            System.out.print(arr[k]+" ");
//        }

    }
}
