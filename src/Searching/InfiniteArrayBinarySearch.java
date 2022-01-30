package Searching;

public class InfiniteArrayBinarySearch {

    public static void main(String[] args){

        int[] arr = {-10,-5,-3,-1,0,1,2,3,5,6,7,15,20,36,45,55,69,79,85,96,100};
        int target = 15;

        int ans = Search(arr, target);
        System.out.println(ans);

    }
    static int Search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(arr[end] < target){
//            int newS = end+1;
//            end = end + (end-start+1)*2;
//            start = newS;
            start = end+1;
            end = end*2+1;
        }
        if(arr[end] >= target) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
