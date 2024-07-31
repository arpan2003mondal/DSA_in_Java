package com.arrays;

public class Seive {
    // find prime in a given range in a better approach
    public static void main(String[] args) {
        int n = 500; // this stores the range
        boolean []prime = new boolean[n+1];
        seive(n,prime);
    }

    public static void seive(int n,boolean []primes){
        for(int i = 2; i <= Math.sqrt(n);i++){
            // this
            if(!primes[i]){
                for (int j = i*2;j <= n; j += i){
                    primes[j] = true;
                }
            }
        }
        System.out.println("Prime Numbers are: ");
        for (int i = 2;i <= n;i++){
            if (!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
