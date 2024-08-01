package com.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={8,12,16,23,30,45,54,78,87,91};
        int ans=binarySearchFunction(arr,78 );
        System.out.println(ans);
        System.out.println(arr);
    }
     static  int binarySearchFunction(int []arr, int target){
        // function to find the element using binary search approach
        int start=0,end=arr.length-1;
        while(start<=end){
            //find the middle element
            // int mid=(start+end)/2;  --> this will not work if index is greater than int range
           int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid+1;
            else if(target<arr[mid])
                    end=mid-1;
            else
                start=mid+1; // if target is greater than arr[mid]

        }
        // return -1 if target not found
        return -1;
    }

}
