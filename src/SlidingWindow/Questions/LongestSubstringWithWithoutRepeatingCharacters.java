package SlidingWindow.Questions;

import java.util.HashMap;

public class LongestSubstringWithWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String S) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int rmvIndex = 0;

        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            map.put(S.charAt(i), map.getOrDefault(S.charAt(i),0)+1);

            if(map.size() == i-rmvIndex+1 ){

                count++;
//                int count = 0;
//                if(map.size() == k){
//                    for (int item : map.values()){
//                        count = count + item;
//                    }
//                }
//                maxLength = Math.max(count,maxLength);
            }
            maxLength = Math.max(maxLength,count);
            while(map.size() < i-rmvIndex+1 && map.size() > 1){
                if(map.size() == i-rmvIndex+1){
                    break;
                }
                if(map.get(S.charAt(rmvIndex)) == 1){
                    map.remove(S.charAt(rmvIndex));
                }else{
                    map.put(S.charAt(rmvIndex), map.getOrDefault(S.charAt(rmvIndex),0)-1);
                }
                rmvIndex++;
                count = i-rmvIndex+1;
            }
            maxLength = Math.max(maxLength,count);
        }
        return maxLength;
    }
}
