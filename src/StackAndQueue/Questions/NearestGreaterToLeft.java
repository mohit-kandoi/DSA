package StackAndQueue.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
        int[] nums2 = {1,3,2,4};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums2.length ; i++) {
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
//        Collections.reverse(list); no need to reverse.
        System.out.println(list);
    }
}
