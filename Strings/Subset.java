package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int []arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);

        // printing list of lists

//        for (List<Integer> list : ans ){
//            System.out.println(list);
//        }
        System.out.println(ans);
    }

    public static List<List<Integer>> subset(int []arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();

            for(int i = 0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
    public static List<List<Integer>> subsetDuplicate(int []arr){

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start= 0;
        int end =0;
        for(int i=0;i< arr.length;i++){
            int n = outer.size();
            start=0;
            // if curr and prev elements are same then start=end+1
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            for(int j = 0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

}
