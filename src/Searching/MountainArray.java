package Searching;

public class MountainArray {

    public static void main(String[] args){

        int[] arr = {0,1,2,4,5,4,1};
        int target = 3;
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        int index = start;

         int start1 = 0;
         int end1 = index;
         int check1=Integer.MAX_VALUE;

        while(start1 <= end1){
            int mid = start1 + (end1-start1)/2;
            if(target > arr[mid]){
                start1 = mid+1;
            }else if(target < arr[mid]){
                end1 = mid-1;
            }else{
                check1 = mid;
                break;
            }
        }

        int start2 = index;
        int end2 = arr.length-1;
        int check2=Integer.MAX_VALUE;

        while(start2 <= end2){
            int mid = start2+(end2-start2)/2;
            if(target > arr[mid]){
                end2 = mid-1;
            }else if(target < arr[mid]){
                start2 = mid+1;
            }else{
                check2=mid;
                break;
            }
        }
        if(check1 > check2){
            System.out.println(check2);
        }else if(check1 < check2){
            System.out.println(check1);
        }else{
            System.out.println("not found.");
        }

    }
}
