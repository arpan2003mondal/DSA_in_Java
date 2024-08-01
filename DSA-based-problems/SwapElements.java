package com.gfg;

import java.util.Arrays;

// Given an array arr of n positive integers. The task is to swap every ith element of the array with (i+2)th element.
public class SwapElements {
    public static void main(String[] args) {
        int n = 5;
         int []arr = {1,2,3,4,5};
         swapElements(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void swapElements(int[] arr, int n)
    {
        // Code here
        for (int i = 0;i< n-2;i++){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}
