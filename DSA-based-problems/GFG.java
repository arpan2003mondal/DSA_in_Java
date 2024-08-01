package com.dsa;

public class GFG {
    public static void main(String[] args) {
       System.out.println(prob1(11));
//
//        System.out.println(((int)Math.pow(10,9) +7));

//        test(7);
    }

    public static long prob1(int n){
        if(n == 1){
            return 1;
        }
       long ans = 0;

        for(int j = 1;j <= n;j++){

            long base = j*(j-1)/2 + 1;

            long x = base;
            for(int i=0;i<j-1;i++){

                base = base+1;
                x = x * base;
                if(x > 39435607){
                    x =x %((long)Math.pow(10,9) +7);
                }
            }
            ans = ans + x;
        }
        if(ans > 39435607){
            ans = ans %((long)Math.pow(10,9) +7);

        }
        return ans;
    }

    public static void test (int n){
        long base = n*(n-1)/2 + 1;

       long x = base;
        for(int i=0;i<n-1;i++){

            base = base+1;
            x = x * base;
        }
        System.out.println(x);
    }
}
