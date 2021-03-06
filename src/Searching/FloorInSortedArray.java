package Searching;

public class FloorInSortedArray {
    public static void main(String[] args) {

        int[] arr = {-2,-1,2,4,5,62,70,81,89,789};
        int target = 4;
        int ans = CeilingSearch(arr, target);
        System.out.println(ans);

    }
    static int CeilingSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
