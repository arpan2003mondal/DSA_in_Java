package com.dsa;

public class RotatedBinarySearch {
    // this class finds in an rotated array ,this code  will not work if duplicate element is present
    public static void main(String[] args) {
        int []nums={3,9,2,2,2,2,2};
        int target=2;
        System.out.println(search(nums,target));
    }
    public static int search(int[]arr,int target){
        // this function finds the target element
        int pivotIndex=findPivotInDuplicate(arr);
        // the pivotIndex stores the index of the largest element in the rotated array
        int ans;
        System.out.println(pivotIndex);
        if(pivotIndex==-1){
            //then do normal binary search
            ans=findInRotated(arr,target,0, arr.length-1);
        }
        else if(target==arr[pivotIndex]){
            // target is the pivot element and return it
            ans=pivotIndex;
        }
        else if (target>=arr[0]) {
            // the do search in the first half of the array
            ans=findInRotated(arr,target,0,pivotIndex-1);
        }
        else{
            // the target element is present in second half
            ans=findInRotated(arr,target,pivotIndex+1,arr.length-1);
        }
        return ans;
    }
    public static int findInRotated(int []arr,int target,int start,int end){
        // normal binary search
        while(start<=end){
            //find the middle element
            // int mid=(start+end)/2;  --> this will not work if index is greater than int range
            int mid=(end+start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }

            else if(target<arr[mid])
                end=mid-1;
            else {
                return mid;
            }// if target is greater than arr[mid]

        }
        // return -1 if target not found
        return -1;
    }
    public static  int findPivotIndex(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }


public static int findPivotInDuplicate(int []arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        // if start element and middle element and end element are  same
        if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
            //skip the elements
            // cheke if start is the pivot elememt
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            start++;
            // check if end is pivot
            if (arr[start] < arr[start - 1]) {
                return start - 1;
            }
            end--;

        } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}
}

