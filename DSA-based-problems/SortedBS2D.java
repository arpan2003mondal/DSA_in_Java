package com.dsa;

import java.util.Arrays;

public class SortedBS2D {
    // this program searches element in an 2D matrix which is fully sorted like 1,2,3,4,5,6,7...
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(matrix,16 )));
    }

    public static int[] colSearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        //this function searches along with the column as normal binary search
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] search(int[][] matrix, int target) {
        // this function reduces the search space by eleminating the rows
        int row = matrix.length;
        int col = matrix[0].length;
        // if the matrix has only one row
        if (matrix.length == 1) {
            return colSearch(matrix, 0, 0, col - 1, target);
        }
        // if the matrix has more than one rows
        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;
        while (rowStart < rowEnd - 1) {
            // reduce the number of rows by compairing the middle element
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[rowMid][colMid] == target) {
                return new int[]{rowMid, colMid};
            } else if (target < matrix[rowMid][colMid]) {
                rowEnd = rowMid;
            } else {
                rowStart = rowMid;
            }
        }
        // the matrix has only two rows now
        // check if the middle elements are target
        if (matrix[rowStart][colMid] == target)
        {
            return new int[]{rowStart, colMid};
        }
        if (matrix[rowStart + 1][colMid] == target)
        {
            return new int[]{rowStart + 1, colMid};
        }

        // search in 1st half
        if (target < matrix[rowStart][colMid]) {
            return colSearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // search in 2nd half
        else if (target > matrix[rowStart][colMid] && target<=matrix[rowStart][col-1]) {
            return colSearch(matrix, rowStart, colMid + 1, col - 1, target);
        }
        //search in 3rd half
        else if (target < matrix[rowEnd][colMid]) {
            return colSearch(matrix, rowEnd, 0, colMid - 1, target);
        }
        if (target > matrix[rowEnd][colMid]){
            //search in 4th half
            return colSearch(matrix, rowEnd, colMid + 1, col - 1, target);
        }

//}
        return new int[]{-1,-1};
    }
}
