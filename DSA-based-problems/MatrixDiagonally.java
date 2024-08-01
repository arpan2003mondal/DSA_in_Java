package com.gfg;

import java.util.Arrays;

public class MatrixDiagonally {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int []arr = matrixDiagonally(mat);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] arr = new int[n * n];
        int i = 0, j = 0;
        boolean isUp = true;

        // Traverse the matrix till all elements get traversed
        for (int k = 0; k < n * n; ) {
            // If isUp = true then traverse from downward
            // to upward
            if (isUp) {
                for (; i >= 0 && j < n; j++, i--) {
                    arr[k] = mat[i][j];
                    k++;
                }

                // Set i and j according to direction
                if (i < 0 && j <= n - 1)
                    i = 0;
                if (j == n) {
                    i = i + 2;
                    j--;
                }
            }
            // If isUp = 0 then traverse up to down
            else {
                for (; j >= 0 && i < n; i++, j--) {
                    arr[k] = mat[i][j];
                    k++;
                }

                // Set i and j according to direction
                if (j < 0 && i <= n - 1)
                    j = 0;
                if (i == n) {
                    j = j + 2;
                    i--;
                }
            }

            // Revert the isUp to change the direction
            isUp = !isUp;
        }
        return arr;
    }
}
