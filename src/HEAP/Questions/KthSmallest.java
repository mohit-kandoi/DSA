package HEAP.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;

        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.remove();
            }
        }
        System.out.println(queue.peek());

    }
}
