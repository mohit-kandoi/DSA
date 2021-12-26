package Arrays;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 3056, 50, 2,56};
//        max(arr);
        reverse(arr);
    }

    static void reverse(int[] arr) {
        if (arr.length % 2 == 0) {
            int i = 0;
            int j = arr.length - 1;
            for (int k = 0; k < (arr.length) / 2; k++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }

        if (arr.length % 2 == 1) {
            int i = 0;
            int j = arr.length - 1;
            for (int k = 0; k < (arr.length - 1) / 2; k++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

//    static void max(int[] arr){
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}
