package RECURSION;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int power = helper(num)-1;
        int ans = reverse(num,power);
        System.out.println(ans);

    }
    static int helper(int num){
        int digits = ((int)Math.log10(num))+1; //formula to calculate number of digits.
        return digits;
    }
    static int reverse(int num, int power){

        if(num%10 == num)
            return num;
        int rem = num%10;
//        num = num/10;
        return (int) ((rem*Math.pow(10, power))+reverse(num/10, power-1));
    }

}
