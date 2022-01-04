package ExtraQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueNumberofOccurrences {

    public static void main(String[] args){
        int[] arr = {1,2,2,3,1};
        boolean ans =uniqueOccurance(arr);
        System.out.println(ans);
    }
    static boolean uniqueOccurance(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            count = 1;
            int n = i;
            while(n < arr.length-1 && arr[n] == arr[n+1]){
                count++;
                n++;
            }
            i = n;
            list.add(count);
        }
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++){
            if (i < list.size()-1 && list.get(i).equals(list.get(i+1))){
                return false;
            }
        }
        return true;

    }

}
