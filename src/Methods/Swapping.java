package Methods;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a , b);

    }
    static void swap(int n1 , int n2){

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("swapped value is: " + n1 + " " + n2);

    }


}

