package com.dsa;

public class SearchInInfinite {
    public static void main(String[] args) {
        int []arr={8,12,16,23,30,45,54,78,87,91,108,110,123,132,135,167};
        System.out.println(findInfiniteRange(arr,78));
    }

    public static int  findInfiniteRange(int []arr,int target){
        int start=0;
        int end=1;
//        int []index=new int[2];
        //boolean findRange=false;
        while(target>arr[end]){

                int temp=end+1;
                end=end+(end-start+1)*2;
                start=temp;

        }
        int  ans= binarySearchFunction(arr,target,start,end);
        return ans;
    }
  public static int binarySearchFunction(int []arr, int target,int start,int end){
        // function to find the element using binary search approach
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
