package PracticeLeetCode.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(commonPrefix(strs));
    }

    static String commonPrefix(String[] strs){
        Arrays.sort(strs);
        if(strs.length == 0){
            return "";
        }
        String ans = "";
        boolean bool = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char check = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (check != strs[j].charAt(i)){
                    bool = false;
                    break;
                }
            }
            if (bool) {
                ans = ans + check;
            }else{
                break;
            }
        }
        return ans;

    }

}
