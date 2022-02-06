package ExtraQuestions;
import java.util.ArrayList;
import java.util.Collections;

public class x {
    public static void main(String[] args) {
        int temp = 0;
        int num = 50678;
        String s = num+"";
        findsubsequences(s, "");
//        ArrayList<Integer> numlist = new ArrayList<>();
        for(String item: list) {
			if(item != "") {
                temp = Integer.parseInt(item);
                isPrime(temp);
            }
        }
//        System.out.println(primelist);
        Collections.sort(primelist);
        System.out.println(primelist.get(primelist.size()-1));

    }


    static ArrayList<Integer> primelist = new ArrayList<>();
    static void isPrime(int temp) {

        int i = 2;
        boolean flag = true;
        while(i*i <= temp) {

            if(temp%i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        if(flag) {
            primelist.add(temp);
        }

    }

    static ArrayList<String> list = new ArrayList<>();
    private static void findsubsequences(String s, String ans)
    {
        if (s.length() == 0) {
//			 int number = Integer.parseInt(ans);
            list.add(ans);
            return;
        }

        findsubsequences(s.substring(1), ans + s.charAt(0));

        findsubsequences(s.substring(1), ans);
    }
}
