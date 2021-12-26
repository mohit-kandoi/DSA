package Searching;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,6},
                {98,77,58,46},
                {4,7,10,60},
                {81,57}
        };
        int target = 58;

        System.out.println(Search(arr, target));
    }
    static String Search(int[][] arr,int target){
        String ans = "not found";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    ans = "found at index "+ i+","+j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
