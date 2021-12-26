package Searching;

public class FloorInSortedArray {
    public static void main(String[] args) {

        int[] arr = {-2,-1,2,4,5,62,70,81,89,789};
        int target = -3;
        int ans = CeilingSearch(arr, target);
        System.out.println(ans);

    }
    static int CeilingSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (target < arr[0]) {
                return -1;
            }
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        if(arr[start] > target){
            return arr[start-1];
        }else{
            return arr[start];
        }

    }
}
