package PracticeLeetCode.Easy;

import java.util.Arrays;

public class FindDifference {
    public static void main(String[] args) {
        String s = "adcb";
        String t = "abcde";
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);
        System.out.println(Arrays.toString(sa));
    }
}
