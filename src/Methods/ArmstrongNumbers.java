package Methods;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumbers {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
            Armstrong();

    }

    static void Armstrong() {

        int num = 0;
        for (int i = 100; i < 1000; i++) {
            int changes = i;
            int ans = 0;

            for (int j = 1; j <= 3; j++) {
                num = changes % 10;
                changes = changes / 10;
                ans = ans + (num*num*num);
            }
            if(i == ans){
                System.out.print(i + " ");
            }
            }
        }
    }

