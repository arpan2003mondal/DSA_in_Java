package com.gfg;

import java.util.Arrays;

public class RemoveDuplicates {
    // removes all the duplicate elements in a sorted array
    /* Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        int ans[] = new int[nums.length];

        ans=func(nums);

        System.out.println(Arrays.toString(ans));

    }
    public static int[] func(int []nums){
        int ans[] = new int[nums.length];

        int j = 0;
        ans[j] = nums[j];

        for(int i = 1; i < nums.length; i++){
            if(ans[j] != nums[i]){
                ans[j+1] = nums[i];
                j++;
            }
        }
        return ans;
    }
}
