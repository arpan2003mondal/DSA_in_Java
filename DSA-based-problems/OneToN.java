package com.dsa;

public class OneToN {
    // print 1 to n using recursion
    public static void main(String[] args) {
        //funBoth(5);
        int n=5;
        System.out.println("Factorial of "+ n +" is "+factorial(5));
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void funRev(int n){
        if(n==0){
            return;
        }

        funRev(n-1);
        System.out.println(n);
    }
    public static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
