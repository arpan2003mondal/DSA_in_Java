package com.dsa;

public class PowerOfTwo {
    // this program calculates if the given number is power of two or not
    public static void main(String[] args) {
        System.out.println(calc(9));
    }
    public static boolean calc(int n){
        // this function checks if n is power of 2
        
        return (n & (n-1)) == 0;
    }
}
