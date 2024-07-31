package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    // Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
    public static void main(String[] args) {
        int [][]matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
                };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;;
        int n = matrix[0].length;

        List<Integer> rowArr = new ArrayList<>();
        List<Integer> colArr = new ArrayList<>();

        int rowIndex = 0; int colIndex = 0;
        // finding which matrix[row][col] is equal to 0

        boolean firstCovered ;
        for (int i = 0;i < m;i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 0){
                    
                    rowArr.add(i);
                    colArr.add(j);
                }
            }
        }
        System.out.println(rowArr);
        System.out.println(colArr);


        // updating the values

        // updating the values row wise
        for (int i = 0;i<rowArr.size();i++){
            int upRow = rowArr.get(i);
            for( int j = 0;j<n;j++){
                matrix[upRow][j] = 0;
            }
        }

        // updating the values col wise
        for (int i = 0;i<colArr.size();i++){
            int upCol = colArr.get(i);
            for( int j = 0;j<m;j++){
                matrix[j][upCol] = 0;
            }
        }

    }

}
