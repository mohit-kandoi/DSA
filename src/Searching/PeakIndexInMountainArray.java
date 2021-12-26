package Searching;

public class PeakIndexInMountainArray {

    public static void main(String[] args){

//        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int[] arr = {2};
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
            // start == end, because at last both will point towards the maximum element
        }
        System.out.println(start);
//        return start;

    }
}
