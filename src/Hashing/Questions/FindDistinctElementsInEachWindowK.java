package Hashing.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindDistinctElementsInEachWindowK {

    public static void main(String[] args) {

        int[] A = {1,2,2,1,3,1,1,3};
        int k = 4;

        // MY APPROACH: (CORRECT but TLE)
        // Using HashSet:

        ArrayList<Integer> list = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i <= A.length-k; i++) {
//            set.clear();
//            for (int j = i; j < i+k; j++) {
//                set.add(A[j]);
//            }
//            list.add(set.size());
//        }
//        System.out.println(list);


        // Anuj Bhaiya's APPROACH(Using HashMap)

        HashMap<Integer, Integer> map = new HashMap<>();

        //For staring window:
        for (int i = 0; i < k; i++) {
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        list.add(map.size());

        //on observing we find that everytime window shift forward only one element get discarded and only one new
        //element added. so we'll make only that change instead of running the loop for complete window.
        for(int i = k; i < A.length; i++){
            if(map.get(A[i-k]) == 1){
                map.remove(A[i-k]);
            }
            else{
                map.put(A[i-k], map.get(A[i-k])-1);
            }

            map.put(A[i], map.getOrDefault(A[i],0)+1);
            list.add(map.size());
        }
        System.out.println(list);

    }

}
