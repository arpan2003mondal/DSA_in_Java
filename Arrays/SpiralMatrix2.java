package com.arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int [][]ans = generateMatrix(5);

        for (int arr[]: ans
             ) {
            for (int num: arr
                 ) {
                System.out.print(num+" ");
            }
        }
    }
    public static int[][] generateMatrix(int n) {

        int [][]matrix = new int[n][n];
        if(n==1){
            matrix[0][0] = 1;
            return matrix;
        }
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int num = 1;
        System.out.println("xxx");
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traversing the first row
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i]=num++;
            }
            rowStart++;

            // traversing the last col

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd]=num++;
            }
            // shink the traversed col
            colEnd--;

            // traverse the last row
            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i]=num++;
                }
            }
            // shink the traversed row
            rowEnd--;

            // traverse the first col
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart]=num++;
                }
            }
            // shink the first col
            colStart++;

            // now the

        }
        return matrix;
    }
}
