package ConditionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        char proceed = 'y';
//        while (proceed != 'x' && proceed != 'X'){
//            System.out.println("Enter two values: ");
//            int a = in.nextInt();
//            int b = in.nextInt();
//
//            System.out.println("Enter sign of operation of your choice(+,-,*,/): ");
//            char ch = in.next().trim().charAt(0);
//
//            if(ch == '+'){
//                System.out.println(a + b);
//            }else if(ch == '-'){
//                System.out.println(a - b);
//            }else if(ch == '*'){
//                System.out.println(a * b);
//            }else{
//                if(b != 0){
//                    System.out.println(a / b);
//                }else{
//                    System.out.println("denominator can not be zero");
//                }
//            }
//            System.out.println("press y to continue and press x to exit: ");
//            proceed = in.next().trim().charAt(0);
//
//        }
        int answer = 0;
        while(true){
            System.out.print("Enter operation: ");
            char ch = in.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter values: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if(ch == '+'){
                    answer = a+b;
                    System.out.println("answer is: " + answer);
                }
                if(ch == '-'){
                    answer = a-b;
                    System.out.println("answer is: " + answer);
                }
                if(ch == '*'){
                    answer = a*b;
                    System.out.println("answer is: " + answer);
                }
                if(ch == '/'){
                    if(b != 0){
                        answer = a/b;
                        System.out.println("answer is: " + answer);
                    }
                    else{
                        System.out.println("remainder cannot be zero.");
                    }
                }
                if(ch == '%'){
                    answer = a%b;
                    System.out.println("answer is: " + answer);
                }

            }else if(ch == 'x' || ch == 'X'){
                break;
            }else{
                System.out.println("invalid operation.");
            }
            System.out.println("press x to exit!");
        }
    }
}
