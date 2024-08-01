package com.dsa;

public class Find_i_th_bit {
    public static void main(String[] args) {
        int n=6;
//        System.out.println(findIthBit(n,3));
//
//        System.out.println(setIthBit(n,2));
//
//        System.out.println(resetBit(n,3));

        System.out.println("Position of the right most set bit is of "+ n + " is " + rightMostSetBit(n));
    }
    public static int findIthBit(int n,int k){
        return((n & (1 << (k - 1))) >> (k - 1));
        // (n & (1 << (k - 1))) this will give the i th bit
        // >> (k - 1) this will right shift the i th bit to the LSB and LSB is the answer
    }

    public static int setIthBit(int n,int k){
        return((n | (1 << (k - 1))));
    }

    public static int resetBit(int n, int k){
        return((n & ~(1 << (k - 1))));
    }

    public static int rightMostSetBit(int n){
        int count = 1;
        while(n > 0){
            if ((n & 1) == 1)
                break;
            else {
                n = n >> 1;
                count++;
            }
        }
        return count;
    }
}
