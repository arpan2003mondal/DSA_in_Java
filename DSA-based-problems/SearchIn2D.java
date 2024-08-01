package com.dsa;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr= {    {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int []ans=search(arr,8);
        System.out.println(Arrays.toString(ans));


    }
    static int[] search(int [][]arr,int target){
        if(arr.length==0)
                return new int[]{-1,-1};
        for(int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }



}


