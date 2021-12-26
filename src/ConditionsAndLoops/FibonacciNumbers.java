package ConditionsAndLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i <= num; i++){
            int temp = a+b;
            a = b;
            b = temp;
            System.out.print((b) + " ");
        }

    }

}
