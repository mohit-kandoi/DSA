package ExtraQuestions;

public class RegExMatching {
    public static void main(String[] args) {
        String s = "coaltar";
        String p = "^coal";
    }
    static int check(String s, String p){
        if(p.charAt(0) == '^'){

            for (int i = 1; i < p.length(); i++) {
                if (p.charAt(i) != s.charAt(i-1)){
                    return 0;
                }
            }
            return 1;
            
        }
        else if(p.charAt(p.length()-1) == '$'){

            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(p.length()-1-i) != s.charAt(s.length()-1-i)){
                    return 0;
                }
            }
            return 1;
            
        }
        else{
            int start = 0;
            int end = p.length();
            for (int i = 0; i < s.length(); i++) {
                while (p.charAt(start) == s.charAt(i)){
                    start++;
                    i++;
                    if(start == end){
                        return 1;
                    }
                }
                start = 0;
            }
            return 0;
        }
    }
}
