package com.gfg;

public class BitDifference {
    public static void main(String[] args) {
       // System.out.println(countBD(1,2));
        int n =3;
        int []arr = {1,3,5};
        System.out.println(sumBitDifferences(arr,n));
    }

    public static long sumBitDifferences(int[] arr, int n) {
        // code here
        long sum = 0;
        if(n == 0 || n == 1){
            return sum;
        }
//        boolean incrementCommonIndex = false;
//        int commonIndex = 0;
        for(int i = 0;i < n;i++) {
            int firstNum = arr[i];
            for (int j = 0; j < n; j++) {
                int secondNum = arr[j];
                if (firstNum != secondNum) {
                    // calculate bit difference and sum
                    int bitDifference = countBD(firstNum, secondNum);

                    sum += bitDifference;
                }
            }
        }

        return sum;
    }

    public static int countBD(int num1,int num2){

        int count = 0;
        int xor = num1^num2;

        while(xor!=0){
            if((xor & 1 )== 1){
                count++;
            }
            xor = xor>>1;
        }

        return count;

    }
}
