package Strings;
import java.util.Arrays;
public class ReverseWordsInString {
    public static void main(String[] args) {

        String s = "  Bob    Loves  Alice   ";
        String m = s.strip();
        String[] arr = m.split(" ");
//        System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i].equals("")) {
                //i--;
            } else {
                ans = ans + arr[i];
                if (i > 0) {
                    ans = ans + " ";
                }
            }
        }
        System.out.println(ans);
    }

}
