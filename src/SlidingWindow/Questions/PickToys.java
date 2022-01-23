package SlidingWindow.Questions;

import java.util.HashMap;

public class PickToys {
    public static void main(String[] args) {

        //same as longest substring with k unique characters:

        // Question asked in interview.

    }

    public static int max(String s,int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxtoy = 0;
        int rmvindex = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

            int count = 0;
            if(map.size() == k) {
                for(int item : map.values()){
                    count = count + item;
                }
            }

            while(map.size() > k){

                if(map.get(s.charAt(i)) == 1){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)-1);
                }
                rmvindex++;
            }
            maxtoy = Math.max(maxtoy,count);
        }

        return maxtoy;
    }
}
