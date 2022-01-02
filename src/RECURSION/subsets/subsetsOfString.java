package RECURSION.subsets;

import java.util.ArrayList;

public class subsetsOfString {
    public static void main(String[] args) {

            String original = "abc";
            String creatingNew = "";
            ArrayList<String> list = subsetsASCII(creatingNew, original);
            System.out.println(list);
    }
    static void subsets(String creatingNew, String original){
        if (original.isEmpty()){
            System.out.println(creatingNew);
            return;
        }
        char ch = original.charAt(0);

        subsets(creatingNew + ch , original.substring(1));
        subsets(creatingNew , original.substring(1));
    }

    // IMPORTANT:
    // FOR Returning an ARRAYLIST into the body of the function:-
    static ArrayList<String> subsets1(String creatingNew, String original){
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(creatingNew);
            return list;
        }
        char ch = original.charAt(0);

        ArrayList<String> left = subsets1(creatingNew + ch , original.substring(1));
        ArrayList<String> right = subsets1(creatingNew , original.substring(1));

        left.addAll(right);
        return left;
    }

    // With ASCII value:-
    static ArrayList<String> subsetsASCII(String creatingNew, String original){
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(creatingNew);
            return list;
        }
        char ch = original.charAt(0);

        ArrayList<String> first = subsetsASCII(creatingNew + ch , original.substring(1));
        ArrayList<String> second = subsetsASCII(creatingNew , original.substring(1));
        ArrayList<String> third = subsetsASCII(creatingNew + (ch+0) , original.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
