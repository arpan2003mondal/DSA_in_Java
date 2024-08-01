package com.dsa;

public class OrderAgonsticBS {
    // this approach is used when we don't know in which order the array is sorted
    public static void main(String[] args) {
        int []arr1={8,12,16,23,30,45,54,78,87,91};
        int []arr2={91,87,78,54,45,30,23,16,12,8};
        int ans=agonsticBS(arr2,55 );
        System.out.println(ans);
    }

    private static int agonsticBS(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAscening=false; // this variable is set to false if array is in descending order
        if(arr[start]<arr[end])
            isAscening=true;

        if(isAscening) {
            // if array is in ascending this portion of code will run

            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1; // if target is greater than arr[mid]

            }
        }
        else{
            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] < target)
                    end=mid-1;
                else if (arr[mid]>target)
                    start= mid + 1;
                else
                    return mid + 1; // if target is found then return its index

            }

        }
        // return -1 if target not found
        return -1;
    }

}
