package RECURSION;
import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int ans = sumDigits(num);
        System.out.println(ans);
    }
    static int sumDigits(int num){

        if(num==0)
            return 0;
        int rem = num%10;
        num = num/10;
        return rem + sumDigits(num);
    }

}
