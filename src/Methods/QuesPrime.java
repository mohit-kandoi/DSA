package Methods;

import java.util.Scanner;

public class QuesPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(IsPrime(num));
    }

     static boolean IsPrime(int num) {

//        if(num <= 1)
//            return false;
//
//        int i = 2;                            Using WHILE loop
//        while(i*i <= num){
//            if(num%i == 0){
//                return false;
//            }
//            i++;
//        }
//         return i * i > num;

         if(num <= 1){
             return false;                      //using FOR loop
         }
         int n=0;
         for(int i = 2; i*i <= num; i++){
             if(num % i == 0){
                 return false;
             }
            n = i+1;
         }
         return n*n > num;
    }
}
