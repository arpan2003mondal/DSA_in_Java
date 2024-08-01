package com.dsa;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(prod(1432));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
    public static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
