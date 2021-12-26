package Arrays;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] matArr = new int[3][3];

        System.out.println("Enter elements in matrix: ");

        for (int i = 0; i < matArr.length; i++) {
            for (int j = 0; j < matArr[i].length; j++) {
                matArr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements in matrix: ");
        for (int i = 0; i < matArr.length; i++) {
            for (int j = 0; j < matArr[i].length; j++) {
                System.out.print(matArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
