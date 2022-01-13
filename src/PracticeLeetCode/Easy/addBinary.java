package PracticeLeetCode.Easy;

import java.sql.Statement;

public class addBinary {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(binaryAdd(a, b));
    }

    static String binaryAdd(String a, String b){
        long sum1 = 0;
        for (int i = a.length()-1; i >= 0 ; i--) {
            int ch = a.charAt(i);
            int num = 0;
            if (ch == '1'){
                num = 1;
            }
            sum1 = (long) (sum1 + (num*Math.pow(2, a.length()-i-1)));
        }

        long sum2 = 0;
        for (int i = b.length()-1; i >= 0 ; i--) {
            int ch = b.charAt(i);
            int num = 0;
            if (ch == '1'){
                num = 1;
            }
            sum2 = (long) (sum2 + (num*Math.pow(2, b.length()-i-1)));
        }
        long total = sum1+sum2;
        return remainder(total);
    }

    private static String remainder(long total) {
        if(total == 0){
            return "";
        }
        long rem = total%2;
        String remain = ""+rem;
        String ans = remainder(total/2) + remain;
        return ans;
    }
}
