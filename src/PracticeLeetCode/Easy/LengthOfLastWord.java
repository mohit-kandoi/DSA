package PracticeLeetCode.Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(length(s));

    }

    static int length(String s) {
        int length = s.trim().length()-1;
        StringBuilder str = new StringBuilder(s.trim());
        int index = 0;
        for (int i = length; i >= 0 ; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                index = i+1;
                break;
            }
        }
        String ans = s.substring(index, length+1);
        return ans.length();
    }
}
