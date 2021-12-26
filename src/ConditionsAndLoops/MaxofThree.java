package ConditionsAndLoops;

import java.util.Scanner;

public class MaxofThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Method 1

//        if(a > b){
//            if(b > c) {
//                System.out.println("a");
//            }
//        }else if(b > c){
//            if(c > a) {
//                System.out.println("b");
//            }
//        }else{
//            System.out.println("c");
//        }

        // Method 2

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);


        //Method 3

          int max = Math.max(a , Math.max(b , c));
        System.out.println(max);

    }
}
