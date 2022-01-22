package PracticeLeetCode.ContestQuestions;

public class CounttheHiddenSequences {

    public static void main(String[] args) {
        int[] differences = {1,-3,4};
        int lower = 1;
        int upper = 6;
        System.out.println(numberOfArrays(differences,lower, upper));
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {

        int count = 0;

        for (int i = lower; i <= upper; i++) {
            int[] arr = new int[differences.length+1];
            boolean check = true;
            arr[0] = i;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1]+differences[j-1] <= upper && arr[j-1]+differences[j-1] >= lower){
                    arr[j] = arr[j-1]+differences[j-1];
                }else{
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }

        }
        return count;
    }

}
