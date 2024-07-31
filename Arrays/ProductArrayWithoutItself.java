package com.arrays;

import java.util.Arrays;

public class ProductArrayWithoutItself {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {


        int n = nums.length;
        int []output = new int[n]; // stores the product

        int []suffix = new int[n];
        int []prefix = new int[n];
        int product = 1;

        // creating the prefix array

        prefix[0] = 1;
        for (int i = 1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }



        // creating the suffix array
        suffix[n-1] = 1;
        for (int i = n-2;i > -1;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        // calculating the output

        for (int i = 0;i<n;i++){
            output[i] = prefix[i]*suffix[i];
        }

        return output;
    }
}
