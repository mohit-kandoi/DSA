package ExtraQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int lengthN = input.nextInt();
            int limitM = input.nextInt();
            int[] arr = new int[lengthN];
            for (int i = 0;i<lengthN ;i++ ){
                arr[i] = input.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<limitM; i++){
                if(isPrime(i)){
                    list.add(i);
                }
            }

            int count = 1;
            for(int i = 0; i < lengthN; i++){
                for(int j = 0; j<list.size(); j++){
                    if(list.get(j)%arr[i] == 0){
                        count++;
                        list.remove(j);
                    }
                }
            }
            System.out.println(count);
        }
    }
    static boolean isPrime(int number){
        if(number <= 1 ){
            return false;
        }
        int c = 2;
        while(c*c <= number){
            if(number%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
