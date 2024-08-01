package com.dsa;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int base=5;
        int ans=0;
        int last;
        while(n>0){
            last = n & 1;
            // this will return the last digit
            n = n >> 1;
            // right shift will help to fetch last digit in next iteration
            ans += last * base;

            base = base * 5;

        }
        return ans;
    }

}
