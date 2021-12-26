package RECURSION;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {5,7,9,11,13,15,17,18,21};
        int target  = 23;
        int start = 0;
        int end = arr.length-1;
        int atIndex = Search(arr,start,end,target);
        System.out.println(atIndex);

    }

    static int Search(int[] arr,int start,int end, int target){

        int mid = start + (end-start)/2;
        if(start <= end){
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                return Search(arr, start, mid-1, target);
            else
                return Search(arr, mid+1, end, target);
        }else
            return -1;

    }
}
