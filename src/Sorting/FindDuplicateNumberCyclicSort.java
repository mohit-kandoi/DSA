package Sorting;
import java.util.Arrays;
public class FindDuplicateNumberCyclicSort {

    public static void main(String[] args){

        int[] nums = {3,4,2,1,5};
        int i = 0;
        while(i < nums.length){

            if(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

}
