package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber1380 {
    public static void main(String[] args) {
    int [][]matrix={
            {3,7,8},
            {9,11,13},
            {15,16,17}
             };
        System.out.println(find(matrix));
    }
    public static List<Integer> find(int [][]matrix){
        int row;
        int col;
        List<Integer> num= new ArrayList<>();

        for(row=0;row< matrix.length;row++){
            // this loop traverses the matrix row  wise
            int min=matrix[row][0];
            int colIndex=0;  // this stores the column number of the minimum element
            for(col=1;col<matrix[0].length;col++){
                // this loop finds the minimum element in a particular row
                if(min>matrix[row][col]){
                    min=matrix[row][col];
                    colIndex=col;
                }
            }
            boolean isMax=true;
            for(int i=0;i<matrix.length;i++){
                if(matrix[row][colIndex]<matrix[i][colIndex]){
                    isMax=false;
                    break;
                }
            }

            if (isMax){
                num.add(min);
            }
        }
        return num;
    }
}
