package com.arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,9,8};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int arr[],int index){
        // base condition return if index is at last position
        if(index== arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && sorted(arr,index+1);
    }
}
