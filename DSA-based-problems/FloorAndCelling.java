package com.dsa;

public class FloorAndCelling {
    public static void main(String[] args) {
        int []arr1={8,12,16,23,30,45,54,78,87,91};
        int []arr2={91,87,78,54,45,30,23,16,12,8};
        int floor=findFloor(arr1,6); // floor= greatest element in array smaller or == target
        int celling=findCelling(arr1,98); // celling = smallest element in array greater or == target
        System.out.println("Floor is "+floor);
        System.out.println("Celling is "+celling);
    }
    static int findFloor(int[] arr, int target) {

        int start=0;
        int ans;  // ans stores the floor value
        int end=arr.length-1;
        boolean isAscening=false; // this variable is set to false if array is in descending order
        if(arr[start]<arr[end])
            isAscening=true;

        if(isAscening) {
            // if array is in ascending this portion of code will run
            if(target<arr[0])
                return -1;  // if target element is less than the smallest element then return -1
            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return target;
                else if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1; // if target is greater than arr[mid]

            }
            ans=arr[end];  // in case of floor end index will point to floor element in ascending list
        }
        else{
            if(target<arr[arr.length-1])
                return -1;   // if target is greater than the biggest element then return -1
            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] < target)
                    end=mid-1;
                else if (arr[mid]>target)
                    start= mid + 1;
                else
                    return target; // if target is found then return its index

            }
            ans=arr[start];  // in case of floor start index will point to floor element in descending list
        }

        return ans;
    }
    static int findCelling(int[] arr, int target) {

        int start=0;
        int ans;
        int end=arr.length-1;
        boolean isAscening=false; // this variable is set to false if array is in descending order
        if(arr[start]<arr[end])
            isAscening=true;

        if(isAscening) {
            // if array is in ascending this portion of code will run
            if(target>arr[arr.length-1])
                return -1;   // if target is greater than the biggest element then return -1
            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return target;
                else if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1; // if target is greater than arr[mid]

            }
            ans=arr[start];  // in case of floor start index will point to floor element in ascending list
        }
        else{
            if(target>arr[0])
                return -1;  // if target element is less than the smallest element then return -1
            while (start <= end) {
                //find the middle element
                // int mid=(start+end)/2;  --> this will not work if index is greater than int range
                int mid = start + (end - start) / 2;
                if (arr[mid] < target)
                    end=mid-1;
                else if (arr[mid]>target)
                    start= mid + 1;
                else
                    return arr[mid]; // if target is found then return it

            }
            ans=arr[end]; // in case of floor end index will point to floor element in descending list
        }

        return ans;
    }
}
