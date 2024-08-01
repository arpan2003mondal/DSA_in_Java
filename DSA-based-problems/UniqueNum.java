package com.dsa;

public class UniqueNum {
    public static void main(String[] args) {
        int []arr = {2,3,3,4,2,6};
        System.out.println(getUnique(arr));
    }
    public static int getUnique(int []arr){
        int unique=0;
        // we take unique as 0 because any number xor with 0 is the number
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
