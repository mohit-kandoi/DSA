package PracticeLeetCode.Medium;

public class Subsets {

    public static void main(String[] args) {

        String s = "abc";
        solve("",s);

        int[] arr = {1,2,3};
    }

    static void solve(String create, String original){
        if(original.isEmpty()){
            System.out.println(create);
            return;
        }

        char ch = original.charAt(0);

        solve(create+ch, original.substring(1));
        solve(create, original.substring(1));


    }
}
