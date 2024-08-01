package com.dsa;

import java.util.Arrays;

public class CyclicSort {
    // this sorting technique is applied if numbers are given in range 1 to n continuously
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int []arr){
        int i=0;
        // every number will be placed at position : number-1 index after sorting
        while (i< arr.length){
            int correct=arr[i]-1;
            // this variable stores the index of the number present in i th position
            if(arr[i]==arr[correct]){
                // it means the number at i index is placed in right position
                // increase i
                i++;
            }
            else {
                // swap the number with the number's index value
                Sorting1.swap(arr,i,correct);
            }
        }
    }
}
