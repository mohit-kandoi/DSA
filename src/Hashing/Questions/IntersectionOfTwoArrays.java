package Hashing.Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int item : nums1){
            set.add(item);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int item : nums2){
            if(set.contains(item)){
                list.add(item);
                set.remove(item);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
