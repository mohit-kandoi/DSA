package Hashing.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class FindLargestSubarrayWithBinaryDigits {
    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,0,0};
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int start = 0;
        int end = -1;
        int length = 0;
        map.put(sum, -1);

        for (int i=0; i< arr.length; i++){
            sum = sum + arr[i];
            if(map.containsKey(sum-target)){
                start = map.get(sum-target)+1;
                end = i;
                if(length < end-start+1){
                    length = end-start+1;
                }
            }
            if(map.containsKey(sum)){
                map.put(Integer.MIN_VALUE, i);
            }else{
                map.put(sum,i);
            }

        }
        if(end== -1){
            System.out.println("Length: "+length);
        }else{
            System.out.println("Length: "+length);
        }


    }
}
