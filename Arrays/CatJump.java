package com.arrays;

public class CatJump {
    public static void main(String[] args) {
        int []nums ={2,3,1,0,4};
        System.out.println(canJump(nums));

    }
    public static boolean canJump(int[] nums) {

        // initially your final position is the last index
        int finalIndex = nums.length-1;

        // start from the second last position
        for(int idx = nums.length-2;idx>=0;idx--){
            // check if we can go to the finalIndex from the current index
            // then update the final position flag
            if(idx+nums[idx] >= finalIndex){
                finalIndex = idx;
            }
        }

        // if we are at first position then
        // we can make the jump possible

        return finalIndex == 0;

    }
}
