package com.dsa;

public class ReverseNum {
    static int sum=0;
    public static void   rev(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
    public static void main(String[] args) {
        rev(1234);
        //System.out.println(sum);
        int n=121;
       // System.out.println("Reverse of "+n+" is "+calcRev(n));
        //System.out.println(rev2(1234,1000));
        System.out.println(palindrome(n));

    }
    public static boolean palindrome(int n){
        // palindrome if n is same of its reverse
        return n==calcRev(n);
    }
    public static int calcRev(int n){
        int noOfDigits= (int)(Math.log10(n))+1;
        // see the formula here we take 10 for decimal number
       int base = (int)Math.pow(10,noOfDigits-1);
        //System.out.println(base);
       return rev2(n,base);
    }
    public static int rev2(int n,int base){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return (rem*base)+rev2(n/10,base/10);
    }
}
