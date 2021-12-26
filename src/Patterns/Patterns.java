package Patterns;
import java.util.*;
import java.util.Scanner;

public class Patterns {

    public static void main(String[] args){

        System.out.println("Enter the number of rows: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        InterestingPattern(rows);
    }

    static void pattern1(int rows){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int rows){

        for (int i = 0; i < rows; i++) {
//            int n = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
//                n++;
            }
            System.out.println();
        }
    }

    static void pattern3(int rows){

        for (int i = 0; i < 2*rows-1; i++) {
            if(i < rows){
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                int col = (2*rows)-i-2;
                for (int j = 0; j <= col; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void pattern4(int rows) {
        for (int i = 0; i < 2 * rows - 1; i++) {
            if (i < rows) {
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 0; j--) {
                    System.out.print("  * ");
                }
                System.out.println();
            } else {
                int col = (2 * rows) - i-2;
                for (int j = 0; j < i - rows + 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= col; j++) {
                    System.out.print("  * ");
                }
                System.out.println();
            }

        }
    }
    static void pattern5(int rows) {
        for (int i = 0; i < 2 * rows - 1; i++) {
            if (i < rows) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 2*rows-i; j <= 2*rows; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                int col = (2 * rows) - i-1;
                for (int j = 0; j < col; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i - rows + 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i+2; j <= 2*rows; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    static void pattern6(int rows){
        for (int i = 0; i <  rows ; i++) {
            int leftvalue = i+1;
            int rightvalue = 2;
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    if(j < i+1){
                        System.out.print(leftvalue);
                        leftvalue--;
                    }else{
                        System.out.print(rightvalue);
                        rightvalue++;
                    }
                }
                System.out.println();
        }
    }

    static void InterestingPattern(int n){

        int originalN = n;
        int N = 2*n;
        for (int row = 1; row < N; row++) {
            for (int col = 1; col < N; col++) {

                int print = originalN - Math.min(Math.min(col-1, N-col-1), Math.min(row-1, N-row-1));
                System.out.print(print+ " ");
            }
            System.out.println();
        }

    }

}
