package com.dsa;

import java.util.Arrays;



public class FirstAndLastIndex {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,8,8,8,10};
       int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

        }
    public static int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};  // index stores the position of target
        int start = searchIndex(nums, target, true);
        if (start != -1) {
            int end = searchIndex(nums, target, false);
            index[0] = start;
            index[1] = end;
        }

        return index;
    }
    public static int searchIndex(int []nums,int target,boolean isFirstOccurance){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else{
                ans=mid;
                if(isFirstOccurance){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }

        }
        return ans;
    }
}
