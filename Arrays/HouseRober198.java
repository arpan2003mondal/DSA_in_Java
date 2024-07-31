package com.arrays;

public class HouseRober198 {
    public static void main(String[] args) {

        int []nums = {1,2,7,8,9};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums) {
        // if only 1 element then return it
        if(nums.length<2)
            return nums[0];
        // creating an array that can store max loot at each index
        int []dp = new int[nums.length];

        // memoize max loot at first 2 index
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        // copy rest of the indexes

        for(int i =2;i< nums.length;i++){
            // core logic
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

//    public static int rob2(int[] nums) {
//        // if only 1 element then return it
//        if(nums.length<2)
//            return nums[0];
//        // creating an array that can store max loot at each index
//       int loot1,loot2;
//
//        // memoize max loot at first 2 index
//        loot1 = nums[0];
//        loot2 = Math.max(nums[0],nums[1]);
//
//        // copy rest of the indexes
//
//        for(int i =2;i< nums.length;i++){
//            // core logic
//           if(loot1+nums[i] > loot2)
//               loot1 +=nums[i];
//           else
//               loot2+=nums[i-1];
//        }
//        return Math.max(loot2,loot1);
//    }
}
