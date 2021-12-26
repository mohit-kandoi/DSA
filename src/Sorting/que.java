package Sorting;

import java.util.ArrayList;

public class que {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i+1){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                list.add(index+1) ;
            }
        }
        System.out.println(list);
    }
}
