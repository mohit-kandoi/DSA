package Hashing.Questions;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 30, 10};
        Set<Integer> set = new HashSet<>();
        for(int item : arr){
            set.add(item);
        }
        System.out.println(set);
    }

}

