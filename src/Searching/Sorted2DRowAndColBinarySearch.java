package Searching;
import java.util.Arrays;
public class Sorted2DRowAndColBinarySearch {

    public static void main(String[] args){

        int[][] matrix = {
                {1,5,9,13},
                {2,6,10,14},
                {3,7,11,15},
                {4,8,12,16}
        };

        int target = 17;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int matrix[][], int target){

        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
