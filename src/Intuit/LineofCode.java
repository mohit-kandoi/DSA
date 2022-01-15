package Intuit;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class LineofCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mLines = sc.nextInt();
        int cf = sc.nextInt();
        int pf = sc.nextInt();
        int codeL = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int cmplt = 0;
        int partial = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (codeL != 0) {
                if (codeL >= mLines - arr[i]) {
                    codeL = codeL - (mLines - arr[i]);
                    arr[i] = mLines;
                    cmplt++;
                } else {
                    int start = i;
                    while (codeL != 0) {

                        arr[start] = arr[start] + 1;
                        codeL = codeL - 1;
                        if(start == 0){
                            partial = arr[0];
                        }else {
                            partial = arr[start-1];
                        }
                        start--;

                        if (start < 0 && codeL != 0) {
                            start = i;
                        }
                    }

                }
            }
        }
        int max = (cf * cmplt) + (partial * pf);
        System.out.println(max);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}