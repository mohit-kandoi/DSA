package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,4,6,7,8,10,17};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        int check = 0;
        while(start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == target) {
                System.out.println("At index number: " + mid);
                check = 1;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        if(check == 0){
            System.out.println("item not found");
        }

    }
}
