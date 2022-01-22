package SlidingWindow.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {

        long[] A = {12, -1, -7, 8, -15, 30, 16, 28};
        int K = 3;
        int N = A.length;
        System.out.println(Arrays.toString(printFirstNegativeInteger(A, N, K)));;

    }
    public static long[] printFirstNegativeInteger(long[] A, int N, int K)
    {
        long[] arr = new long[A.length-K+1];
        Queue<Long> queue = new LinkedList<>();

        for (int i = 0; i < K; i++) {
            if(A[i] < 0){
                queue.add(A[i]);
            }
        }
        arr[0] = queue.peek();

        for (int i = K; i < A.length; i++) {
            if(A[i-K] < 0){
                queue.remove();
            }
            if(A[i] < 0){
                queue.add(A[i]);
            }
            if (queue.size() == 0){
                arr[i-K+1] = 0;
            }else{
                arr[i-K+1] = queue.peek();
            }
        }

        return arr;
    }
}
