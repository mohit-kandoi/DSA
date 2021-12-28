package RECURSION;

import java.util.Scanner;

public class CountZeroes {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int count = 0;
        int ans = countZero(num, count);
        System.out.println(ans);

    }
    static int countZero(int num, int count){

        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0)
            count++;

        return countZero(num/10, count);
    }

}
