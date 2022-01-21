package StackAndQueue.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {68, 735, 101, 770, 525, 279, 559, 563, 465, 106, 146, 82, 28, 362, 492, 596, 743, 28, 637, 392, 20,5, 703, 154, 293, 383, 622, 317, 519, 696, 648, 127, 372, 339, 270, 713, 68, 700, 236, 295, 704, 612, 123};
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(stack1.size() == 0){
                list.add(1);
            }
            else if(stack1.size() > 0 && stack1.peek() > arr[i]){
                list.add(1);
            }
            else if(stack1.size() > 0 && stack1.peek() <= arr[i]){
                while(stack1.size() != 0 && stack1.peek() <= arr[i]){
                    stack1.pop();
                    stack2.pop();
                }
                if (stack1.size() == 0){
                    list.add(i+1);
                }
                else{
                    list.add(i-stack2.peek());
                }
            }
            stack1.push(arr[i]);
            stack2.push(i);
        }
        System.out.println(list);
    }
}
