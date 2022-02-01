package StackAndQueue.Questions;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class test {
    static class Pair{
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    public static void main(String[] args) {

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(2,0));

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

    }
}
