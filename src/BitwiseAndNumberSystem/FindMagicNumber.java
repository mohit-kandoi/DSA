package BitwiseAndNumberSystem;
import java.util.*;
import java.util.Scanner;

public class FindMagicNumber {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = magicNumber(n);
        System.out.println(ans);

    }
    static int magicNumber(int n){

        int result = 0;
        int base = 5;
        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            result = result + (last*base);
            base = base*5;
        }
        return result;
    }

}
