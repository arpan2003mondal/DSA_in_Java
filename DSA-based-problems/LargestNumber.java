package com.gfg;

import java.util.Arrays;
import java.util.Comparator;

//   Given an array of strings arr[] of length n representing non-negative integers,
//        arrange them in a manner, such that, after concatanating them in order,
//        it results in the largest possible number. Since the result may be very large, return it as a string.
public class LargestNumber {
    public static void main(String[] args) {
        int n = 5;
        String arr[] = {"3", "30", "34", "5", "9"};
        System.out.println(printLargest(n,arr));
    }
   public static String printLargest(int n, String[] arr) {
       Arrays.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               String first = o1+o2;
               String second = o2+o1;
               return second.compareTo(first);
           }
       });
       String ans="";
       for(int u=0;u<n;u++){
           ans+=arr[u];
       }
       return ans;

    }
}
