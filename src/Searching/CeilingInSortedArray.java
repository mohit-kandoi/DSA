package Searching;

public class CeilingInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,7,8,9,10};
        int target = 5;
        int ans = CeilingSearch(arr, target);
        System.out.println(ans);

    }
    static int CeilingSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target > arr[arr.length-1]) {
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
        return arr[start];
        }
    }
