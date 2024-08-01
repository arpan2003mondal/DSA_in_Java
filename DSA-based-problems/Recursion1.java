package com.dsa;

public class Recursion1 {
    public static void main(String[] args) {
        //System.out.println(fibonacci(400));
//    int []arr={1,2,3,4,5,6,7,8};
//    for(int i=0;i<6;){
//        System.out.println("hello");
//        i=i+2;
//    }
//        System.out.println(search(arr,8,0, arr.length-1));
        System.out.println(fiboFormula(50));

    }
    static long fiboFormula(int n){
        // formula for calculating fibonacci in a single step
        return (long)(Math.pow(((1+Math.sqrt(5)) / 2),n)/Math.sqrt(5));
    }
    public static int fibonacci(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        } else if (target<arr[m]) {
            search(arr,target,s,m-1);
        }
        //else {
            return search(arr, target, m+1, e);
        //}
    }
}
