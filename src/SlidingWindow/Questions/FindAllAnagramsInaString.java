package SlidingWindow.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInaString {
    public static void main(String[] args) {

       String s =  "aaaaaaaaaa";
       String p = "aaaaaaaaaaaaa";
        System.out.println(findAnagrams(s,p));

    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> ptrnMap = new HashMap<>();
        HashMap<Character,Integer> matchingMap = new HashMap<>();

        int k = p.length();
        if(p.length() > s.length()){
            return list;
        }
        for (char ch = 0; ch < k; ch++){
            ptrnMap.put(p.charAt(ch), ptrnMap.getOrDefault(p.charAt(ch),0)+1);
        }
//        int count = 0;
        for (int i = 0; i < k; i++) {
            matchingMap.put(s.charAt(i), matchingMap.getOrDefault(s.charAt(i),0)+1);
        }
        if(ptrnMap.equals(matchingMap)){
//            count++;
            list.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            if(matchingMap.get(s.charAt(i-k)) == 1){
                matchingMap.remove(s.charAt(i-k));
            }else{
                matchingMap.put(s.charAt(i-k), matchingMap.getOrDefault(s.charAt(i-k),0)-1);
            }

            matchingMap.put(s.charAt(i), matchingMap.getOrDefault(s.charAt(i),0)+1);

            if(ptrnMap.equals(matchingMap)){
//            count++;
                list.add(i-k+1);
            }
        }

        return list;
    }
}
