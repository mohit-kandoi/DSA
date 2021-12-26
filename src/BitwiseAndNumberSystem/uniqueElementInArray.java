package BitwiseAndNumberSystem;

import java.util.Scanner;

// In an array each number appears twice but only 1 number appears once. Find that number.

public class uniqueElementInArray {
    public static void main(String[] args){

        int[] arr = {3,4,5,1,7,3,5,1,4};
        int ans = unique(arr);
        System.out.println(ans);
    }
    static int unique(int[] arr){
        int unique = 0;
        for(int i: arr){
            unique = unique ^ i;
        }
        return unique;
    }
}
