package com.dsa;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(27,9));
        System.out.println(lcm(20,15));
    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
