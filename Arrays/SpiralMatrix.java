package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
                };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        // program for traversing an 2D array in spiral order

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traversing the first row
            for (int i = colStart; i <= colEnd; i++) {
                ans.add(matrix[rowStart][i]);
            }
            rowStart++;

            // traversing the last col

            for (int i = rowStart; i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            // shink the traversed col
            colEnd--;

            // traverse the last row
            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            // shink the traversed row
            rowEnd--;

            // traverse the first col
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    ans.add(matrix[i][colStart]);
                }
            }
            // shink the first col
            colStart++;

            // now the

        }
        return ans;
    }
    }
