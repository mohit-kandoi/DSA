package Hashing.Questions;

import java.util.HashMap;

public class equalZeroOneTwo {
    public static void main(String[] args) {
        String  str = "01020120102012";
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        int countZ = 0;
        int countOne = 0;
        int countTwo = 0;
        int delta10 = countOne-countZ;
        int delta21 = countTwo-countOne;
        String key = delta21 + "*" + delta10;
        map.put(key,0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0'){
                countZ++;
            }
            else if (str.charAt(i) == '1'){
                countOne++;
            }
            else{
                countTwo++;
            }
            delta10 = countOne-countZ;
            delta21 = countTwo-countOne;
            key = delta21 + "*" + delta10;
//            System.out.println(key);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + map.get(key)+1);
            }else map.put(key, 0);
        }
        for(String item: map.keySet()){
//            ans += item;

            System.out.println(item + "-" + map.get(item));
        }
        System.out.println(ans);
    }
}
