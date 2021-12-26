package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println(plus());
    }
    static int plus(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        int sum = a+b;
        return sum;
    }
}
