package SlidingWindow.Questions;

import java.util.HashMap;

public class longestSubstringWithKuniqueChar {
    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s,k));
    }

    public static int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int rmvIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            if(map.size() <= k ){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
                int count = 0;
                if(map.size() == k){
                    for (int item : map.values()){
                        count = count + item;
                    }
                }
                maxLength = Math.max(count,maxLength);
            }
            while(map.size() > k){
                if(map.get(s.charAt(rmvIndex)) == 1){
                    map.remove(s.charAt(rmvIndex));
                }else{
                    map.put(s.charAt(rmvIndex), map.getOrDefault(s.charAt(rmvIndex),0)-1);
                }
                rmvIndex++;
            }
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        return maxLength;
    }
}
