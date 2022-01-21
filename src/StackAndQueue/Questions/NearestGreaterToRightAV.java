package StackAndQueue.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NearestGreaterToRightAV {
    public static void main(String[] args) {
//        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = nums2.length-1; i >= 0 ; i--) {
            if(stack.size() == 0){
                list.add(-1);
            }
            else if(stack.size() > 0 && stack.peek() > nums2[i]){
                list.add(stack.peek());
            }
            else if(stack.size() > 0 && stack.peek() <= nums2[i]){
                while(stack.size() != 0 && stack.peek() <= nums2[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    list.add(-1);
                }
                else{
                    list.add(stack.peek());
                }
            }
            stack.push(nums2[i]);
        }
        Collections.reverse(list);
        System.out.println(list);

        //FOR LEETCODE QUE(Extra part):

//        int[] ans = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            int check = nums1[i];
//            for (int j = 0; j < nums2.length; j++) {
//                if(check == nums2[j]){
//                    ans[i] = list.get(j);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ans));
    }
}
