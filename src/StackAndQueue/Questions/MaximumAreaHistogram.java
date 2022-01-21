package StackAndQueue.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int[] heights = {2,4};

        int[] right = nsr(heights);
        int[] left = nsl(heights);

        int[] width = new int[heights.length];
        int[] area = new int[heights.length];
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            width[i] = right[i]-left[i]-1;
            area[i] = heights[i]*width[i];
            if(area[i] > maxArea){
                maxArea = area[i];
            }
        }

        System.out.println(maxArea);

    }

    private static int[] nsl(int[] height) {
        Stack<Integer> stackValue = new Stack<>();
        Stack<Integer> stackIndex = new Stack<>();
        int[] ans = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            if(stackValue.size() == 0){
                ans[i] = -1;
            }
            else if(stackValue.size() > 0 && stackValue.peek() < height[i]){
                ans[i] = stackIndex.peek();
            }
            else if(stackValue.size() > 0 && stackValue.peek() >= height[i]){
                while(stackValue.size() > 0 && stackValue.peek() >= height[i]){
                    stackValue.pop();
                    stackIndex.pop();
                }
                if(stackValue.size() == 0){
                    ans[i] = -1;
                }
                else{
                    ans[i] = stackIndex.peek();
                }
            }
            stackValue.push(height[i]);
            stackIndex.push(i);
        }
        return ans;
    }

    private static int[] nsr(int[] height) {

        Stack<Integer> stackValue = new Stack<>();
        Stack<Integer> stackIndex = new Stack<>();
        int[] ans = new int[height.length];

        for (int i = height.length-1; i >= 0; i--) {
            if(stackValue.size() == 0){
                ans[i] = height.length;
            }
            else if(stackValue.size() > 0 && stackValue.peek() < height[i]){
                ans[i] = stackIndex.peek();
            }
            else if(stackValue.size() > 0 && stackValue.peek() >= height[i]){
                while(stackValue.size() > 0 && stackValue.peek() >= height[i]){
                    stackValue.pop();
                    stackIndex.pop();
                }
                if(stackValue.size() == 0){
                    ans[i] = height.length;
                }
                else{
                    ans[i] = stackIndex.peek();
                }
            }
            stackValue.push(height[i]);
            stackIndex.push(i);
        }
        Collections.reverse(Arrays.asList(ans));
        return ans;

    }
}
