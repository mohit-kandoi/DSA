package ExtraQuestions;

import java.util.Arrays;

public class ValidPalindromeLeetCode {
    public static void main(String[] args) {
        String s = "OP";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder("");
        String lowerCase = s.toLowerCase();
        char[] x = lowerCase.toCharArray();

        for(int i = 0; i<x.length; i++){
            if(x[i] >= 'a' && x[i] <='z' || x[i] >= '0' && x[i] <='9'){
                ans.append(x[i]);
            }
        }
        int n = 0;
        if(ans.length() % 2 == 0){
            n = ans.length()/2;
        }else
            n = (ans.length()/2)+1;

        for (int i = 0; i < n; i++) {
            if(ans.charAt(i) != ans.charAt(ans.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
