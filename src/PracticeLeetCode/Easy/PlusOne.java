package PracticeLeetCode.Easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {4,2,1};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] digits) {

        int i = digits.length-1;
        if (digits[i]+1 == 10){
            digits[i] += 1;
            while (digits[i] == 10){

                if (i==0 && (digits[i]+1==10 || digits[i] == 10)){
                    int[] ans = new int[digits.length+1];
                    ans[0] = 1;
                    for (int j = 1; j < ans.length; j++) {
                        ans[j] = 0;
                    }
                    return ans;
                }
                digits[i] = 0;
                digits[i-1] += 1;
                i--;
            }
        }
        else{
            digits[i] = digits[i]+1;
        }
        return digits;

    }

}
