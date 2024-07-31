package com.arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int []nums = {0,1,2};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {

//       int redCount = 0;
//       int whiteCount = 0;
//       int blueCount = 0;
//        for (int col:nums
//             ) {
//            if (col == 0) {
//                redCount++;
//            }
//            else if (col == 1) {
//                whiteCount++;
//            }
//            else {
//                blueCount++;
//            }
//        }
////        System.out.println(redCount);
////        System.out.println(whiteCount);
////        System.out.println(blueCount);
//
//        int i = 0;
//        while (i< nums.length){
//            if (redCount!=0){
//                nums[i] = 0;
//                redCount--;
//            } else if (whiteCount != 0) {
//                nums[i]=1;
//                whiteCount--;
//            }
//            else {
//                nums[i]=2;
//                blueCount--;
//            }
//            i++;
//        }
//        System.out.println(Arrays.toString(nums));

        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while(mid<=end){
            switch (nums[mid]){
                case 0: swap(nums,start,mid);
                        mid++;start++;
                        break;
                case 1 :mid++;
                        break;
                case 2 : swap(nums,mid,end);

                         end--;
                         break;

            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
