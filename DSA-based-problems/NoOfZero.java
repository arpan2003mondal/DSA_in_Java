package com.dsa;

public class NoOfZero {
    public static void main(String[] args) {
        int n=1208030;
        System.out.println(calcZero(n));
    }
    public static int calcZero(int n){
        return helper(n,0);
    }
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0)  {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
