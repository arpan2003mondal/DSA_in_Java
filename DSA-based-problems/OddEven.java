package com.dsa;

public class OddEven {
    public static void main(String[] args) {
        int n=51;
        boolean ans = isOdd(n);
        if(ans==false){
            System.out.println(n+" is Even");
        }
        else {
            System.out.println(n+" is Odd");
        }
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
        // if we use and operator with any number with 1
        // if result is 1 then it is odd else even
    }
}
