package MathsQuestions;

import java.sql.SQLOutput;

public class PrimeNumber {

    public static void main(String[] args){

        int number = 40;
        for (int i = 1; i <= 40; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int number){

        if(number <= 1)
            return false;
        int c = 2;
        while (c*c <= number){
            if (number % c == 0)
                return false;

            c++;
        }
        return true;

    }

}
