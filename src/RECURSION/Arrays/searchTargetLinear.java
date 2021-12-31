package RECURSION.Arrays;

public class searchTargetLinear {

    public static void main(String[] args){
        int[] arr = {3,5,1,15,10,9};
        int target = 4;
        System.out.println(searchTarget(arr, target, 0));
    }
    static boolean searchTarget(int[] arr, int target, int index){
        if (arr[index] == target)
            return true;
        if (index == arr.length-1)
            return false;
        return searchTarget(arr, target, index+1);
    }
}
