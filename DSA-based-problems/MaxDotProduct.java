package com.gfg;

import java.util.Arrays;

public class MaxDotProduct {
    // Given two arrays a and b of positive integers of size n and m where n >= m, the task is to maximize the dot product by inserting zeros in the second array but you cannot disturb the order of elements.
    //
    //Dot product of array a and b of size n is a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1].
    public static void main(String[] args) {

        int a[] = {6 ,3 ,6, 3, 8, 6, 3, 9};

        int b[] = {6 ,3 ,9 ,8 ,4 ,2};
        int n = a.length;
        int m = b.length;

        System.out.println(maxDotProduct(n,m,a,b));
    }

    public static int maxDotProduct(int n, int m, int a[], int b[])
    {
        // Your code goes here
        int []aCopy = a.clone();
        int []bCopy = new int[n];
        int noOfZero = n-m;

        // finding the min from a array and replacing min ele position with -1 in b arr

        for (int i = 0;i < noOfZero;i++){
            int min = 0;
            // finding the index of the minimum number
            for (int j = 1;j < n;j++) {
                if (aCopy[j] <= aCopy[min]) {
                    min = j;
                }
            }
                bCopy[min] = -1;
                aCopy[min] = Integer.MAX_VALUE;
        }

        int i = 0; int j = 0;
        while (i < n){

            if(bCopy[i] == -1){
                bCopy[i] = 0;
            }
            else {
                bCopy[i] = b[j];
                j++;
            }
            i++;
        }

        // calculating the sum by multiplying both i th index element of both array and adding to sum
        int sum = 0;
        for (i = 0;i < n;i++){
            int mul = a[i] * bCopy[i];

            sum = sum+mul;
        }

        System.out.println(Arrays.toString(aCopy));

        return sum;
    }
}
