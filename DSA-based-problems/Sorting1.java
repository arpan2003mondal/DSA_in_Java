package com.dsa;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Sorting1 {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int []arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[]arr){
        for(int i=0;i< arr.length;i++){
            // find the index of the maximum element and swap with its proper position
            int lastIndex= arr.length-1-i;
            int maxIndex=findMax(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    public static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int findMax(int[] arr,int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void bubbleSort(int []arr){
        // sorting function using bubble sort
        boolean swapped;
        for(int i=0;i< arr.length-1;i++){
            // run the inner loop till the last index of the array
            swapped=false;
            for(int j = 1;j<arr.length-i;j++){
                // run the loop till the i-1 index because after that index the array is sorted already
                if(arr[j]<arr[j-1]){
                    // swap the elements
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                // this means no swapping is made, the array is already sorted
                break;
            }
        }

    }
}
