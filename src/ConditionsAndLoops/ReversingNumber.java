package ConditionsAndLoops;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;
        int remainder = 0;

        while(num > 0){
            remainder = num%10;
            num /= 10;

            reverse = (reverse*10)+remainder;
        }
        System.out.println(reverse);
    }
}
