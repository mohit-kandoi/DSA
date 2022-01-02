package Searching;

import java.util.Arrays;

public class FirstAndLastOccurance {

    public static void main(String[] args){

        int[] nums = {5,5,5,7,7,7,7,7,8,8,10};
        int target = 4;
//        int[] ans = {-1, -1};
//        ans[0] = FirstOccurance(nums, target);
//        ans[1] = LastOccurannce(nums, target);
//        System.out.println(ans[0]+" "+ans[1]);
        int[] result = firstAndlastTogether(nums, target);
        System.out.println(Arrays.toString(result));

    }
    // my approach:
    static int[] firstAndlastTogether(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int count = 0;
        int start = 0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if (target > nums[mid])
                s = mid+1;
            else if(target < nums[mid])
                e = mid-1;
            else{
                if(mid == 0){
                    while(nums[mid] == target){
                        mid++;
                    }
                    return new int[]{0, mid-1};
                }
                if(nums[mid-1] == target){
                    e = mid-1;
                }
                if(nums[mid-1] < target){
                    start = mid;
                    while(mid < nums.length && nums[mid] == target){
                        mid++;
                    }
                    return new int[]{start,mid-1};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // kunal's approach:
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
