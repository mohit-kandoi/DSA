package RECURSION.Strings;
import java.util.*;
public class skipCharacterFromString {
    public static void main(String[] args){
        String name = "bapplecca";

//        String ans = "";
//        String result = modify(name, ans, 0);

//        String result = modify2(name);
//        System.out.println(result);

        String result = skip(name);
        System.out.println(result);
    }

    // Taking extra arguments other than original string:
    static String modify(String name, String ans, int index){
        if (index == name.length()){
            return ans;
        }
        if (name.charAt(index) != 'a'){
            ans = ans + name.charAt(index);
        }
        index++;
        return modify(name, ans, index);
    }
    // Taking only original argument:

    static String modify2(String name){
        if (name.isEmpty()){
            return "";
        }
        char ch = name.charAt(0);
        if(ch == 'a'){
//            name = name.substring(1);
            return modify2(name.substring(1));
        }
        else{
//            name = name.substring(1);
            return ch + modify2(name.substring(1));
        }
    }
    // skip a particular string instead of a character:
    static String skip(String name){
        if (name.isEmpty()){
            return "";
        }
        if(name.startsWith("apple")){
            return skip(name.substring(5));
        }
        else{
            return name.charAt(0) + skip(name.substring(1));
        }
    }

}
