package com.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        int target = 2;
        System.out.println(rbs(arr,target,0, arr.length-1));
    }
    public static int rbs(int arr[],int key,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(key<=arr[mid] && key >= arr[s]){
                return rbs(arr,key,s,mid-1);
            }
            else {
                return rbs(arr,key,mid+1,e);
            }
        }
        if(key>=arr[mid] && key<=arr[e]){
            return rbs(arr,key,mid+1,e);
        }
        return rbs(arr,key,s,mid-1);
    }
}
