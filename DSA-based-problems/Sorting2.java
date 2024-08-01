package com.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting2 {
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
//        arr = mergeSort(arr);

        //mergeSort2(arr,0, arr.length);
        //Arrays.sort(arr);

        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int []arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int mix[] = new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i< left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
            while(i< left.length){
                mix[k] = left[i];
                i++;k++;
            }

            while(j < right.length){
                mix[k]= right[j];
                j++;k++;
            }



        return mix;
    }

    public static void mergeSort2(int []arr,int start,int end){
        if(end-start == 1){
            return ;
        }
        int mid = (start+end)/2;

        mergeSort2(arr,start,mid);
        mergeSort2(arr,mid,end);

         merge2(arr,start,mid,end);
    }

    public static void merge2(int []arr,int start,int mid,int end ) {

        int mix[] = new int[end - start];
        int i=start;
        int j=mid;
        int k=0;

        while(i< mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< mid){
            mix[k] = arr[i];
            i++;k++;
        }

        while(j < end){
            mix[k]= arr[j];
            j++;k++;
        }

        for (int l=0;l< mix.length;l++){
            arr[start+l] = mix[l];
        }



    }

    public static void quickSort(int []arr,int low,int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while (arr[start]< pivot ){
                start++;
            }
            while(arr[end]>pivot){
                end --;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            }

            // now pivot is at it's right position

            quickSort(arr,low,end);
            quickSort(arr,start,high);

        }


    }
}
