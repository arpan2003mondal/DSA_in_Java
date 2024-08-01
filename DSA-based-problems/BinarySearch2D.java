package com.dsa;

import java.util.Arrays;

public class BinarySearch2D {
    // basically this class does search in an array of matrix
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(searchIn2D(matrix,31)));
    }
    public static int[] searchIn2D(int [][]matrix,int target){
         int row=0;
         int col=matrix[0].length-1;
         while(row < matrix.length && col>=0) {
             if (matrix[row][col] == target) {
                 // target is found return the indices
                 return new int[]{row, col};
             } else if (target < matrix[row][col]) {
                 // target element is smaller than matrix number then skip the columns
                 col--;
             } else {
                 // target>matrix element then skip the row elements
                 row++;
             }
         }
    // if the element is not found
    return new int[]{-1,-1};
    }
}
