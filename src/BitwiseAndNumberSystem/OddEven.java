package BitwiseAndNumberSystem;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

}
