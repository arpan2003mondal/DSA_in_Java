package com.dsa;

public class MathsForDSA2 {
    public static void main(String[] args) {
        System.out.println(isPrime(51));
    }

    public static  boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            System.out.println(i);
            if(n % i == 0){
                return false;
            }
        }
        return  true;
    }

}
