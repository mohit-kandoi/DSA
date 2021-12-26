package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int elmts = in.nextInt();
        int[] arr = new int[elmts];
        System.out.println("enter elements: ");
        for (int i = 0; i < elmts; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter element which you want to find: ");
        int find = in.nextInt();

        int ans = Search(elmts,arr,find);
        System.out.println("element found at index: "+ans);


    }
    static int Search(int elmts, int[] arr, int find){

        if(arr.length == 0){
            return -1;
        }
//        int index = -1;
        for (int i = 0; i < elmts; i++) {

            if(find == arr[i]){
                return i;
//                index = i;
//                System.out.println("element present at index: "+index);
//                break;
            }
        }
        return -1;
//        if(index == -1){
//            System.out.println("element not found!");
//        }
    }
}
