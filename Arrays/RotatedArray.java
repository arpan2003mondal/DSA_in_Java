package com.arrays;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8};
        int k = 3;

        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
//        int []rotated = new int[nums.length];
//
//        int idx = nums.length-k;
//
//        // coping the number from rotation point
//        int i ,j = idx;
//        for ( i = 0;i < k;i++){
//            rotated[i] = nums[j++];
//        }
//
//        // coping the number from 0 to rotation point
//      for ( i = 0 ;i < idx ;i++){
//          rotated[k] = nums[i];
//          k++;
//      }
//        System.out.println(Arrays.toString(rotated));

        int n = nums.length;

        k = k%n; // checking if k is greater than arr size

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


    }

    public static void reverse(int []arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end --;
        }
    }

}
