package RECURSION;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int ans = fact(n);
        System.out.println(ans);

    }
    static int fact(int n){

        if(n==1)
            return 1;

        return n*fact(n-1);

    }

}
