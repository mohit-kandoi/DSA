package Searching;

public class FirstAndLastOccurance {

    public static void main(String[] args){

        int[] nums = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = {-1, -1};
        ans[0] = FirstOccurance(nums, target);
        ans[1] = LastOccurannce(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int FirstOccurance(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }return ans;
    }
    static int LastOccurannce(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }return ans;
    }
}
