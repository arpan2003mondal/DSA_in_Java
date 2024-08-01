package com.dsa;

public class SearchInPeakArray {
    public static void main(String[] args) {
        int []mountainArr={1,2,4,6,7,9,6,5,3,2};
        int target=3;
        int peakPosition=peak(mountainArr);

        int findFirst=findNum(mountainArr,target,0,peakPosition);
        if(findFirst==-1){
            int findLast=findNum(mountainArr,target,peakPosition, mountainArr.length-1);
            System.out.println(findLast);

        }
        else{
            System.out.println(findFirst);
        }

    }
    public static int findNum(int []arr,int target,int start,int end){


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
                    return mid ;
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

                    return mid ; // if target is found then return its index

            }

        }
        // return -1 if target not found
        return -1;
    }

    public static int peak(int []arr){
       // System.out.println("In peak");
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid+1]>arr[mid]){
                // that means we are ascending part of the array
                // then peak element will be residing in right part
                // then set start=mid+1
                start=mid+1;

            }
            else if(arr[mid]>arr[mid+1]){
                // this means we are in decending part
                // the peak element will be this or resides in left array
                end=mid;
            }

        }
        //System.out.println(arr[start]);
        return start;
    }
}

