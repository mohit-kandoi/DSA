package Strings;

public class PalindromeString {

    public static void main(String[] args){

        String s = "abcdtcba";

        // MY APPROACH

//        StringBuilder builder = new StringBuilder();
//        int i = 0;
//        while(i < s.length()){
//            builder.append(s.charAt(i));
//            i++;
//        }
//        builder.reverse();
//        String ss = builder.toString();
//        if(ss.equals(s)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }

        // LAVESH SIR's APPROACH

        int start = 0;
        int end = s.length()-1;
        boolean check = true;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("Not palindrome");
                check = false;
                break;
            }else{
                start++;
                end--;
            }
        }
        if(check){
            System.out.println("palindrome");
        }
    }
}
