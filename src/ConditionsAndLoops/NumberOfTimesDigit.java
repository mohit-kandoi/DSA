package ConditionsAndLoops;

import java.util.Scanner;

public class NumberOfTimesDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int digit = in.nextInt();
        int ans = 0;
        long rem = 0;

        while(num > 0 ) {
            rem = num % 10;
            num = num / 10;
            if(digit == rem){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
