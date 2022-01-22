package Hashing.Questions;

import java.util.HashMap;

public class FindSubarrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1,2,5,7,5};
        int s = 12;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1); // first is SUM and second value is INDEX:

        int start = 0;
        int end = -1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum == s){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(sum - s)){
                start = map.get(sum - s)+1;
                end = i;
                break;
            }
            map.put(sum, i);
        }
        if(end == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(start+" "+end);
        }

    }
}
