package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,4,6,7,8,10,17};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        boolean check = false;
        while(start <= end) {
            int mid = (start+end)/2; // to optimize mid = s + (e-s)/2
            if (arr[mid] == target) {
                System.out.println("At index number: " + mid);
                check = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        if(!check){
            System.out.println("item not found");
        }

    }
}
