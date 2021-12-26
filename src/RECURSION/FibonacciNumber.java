package RECURSION;
import java.util.*;
public class FibonacciNumber {

    public static void main(String[] args){

//        int a = 0;
//        int b = 1;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.print(a+" "+b);
//        fibonacci(a,b,n);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to find fibonacci number: ");
        int n = in.nextInt();
//        int ans = fibo(n);
//        System.out.println(ans);

        System.out.println(fiboformula(n));

    }

    // Fibonacci by formula:

    static int fiboformula(int n){
        return (int)(((Math.pow( ((1+Math.sqrt(5)) / 2 ), n)) - (Math.pow( ((1-Math.sqrt(5)) / 2 ), n)))/ Math.sqrt(5));
    }

    // Kunal's approach:

    static int fibo(int n){

        if(n<2)
            return n;

        return fibo(n-1)+fibo(n-2);

    }

    //My Approach

    static void fibonacci(int a, int b, int n){
        int temp = a+b;
        a = b;
        b = temp;
//        System.out.print(" "+b);
        if(n-3 > 0){
            n--;
            fibonacci(a,b,n);
        }
        else
            System.out.println(b);
            return;
    }



}
