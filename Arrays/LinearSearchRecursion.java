package com.arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[] ={54,22,8,22,77,13,22};
//        System.out.println(find(arr,22,0));
//        System.out.println(findIndex(arr,22,0));
//
//        System.out.println(findLast(arr,22, arr.length-1));
//        System.out.println(findIndexLast(arr,22, arr.length-1));

        findAllIndex(arr,22);

    }
    public static void findAllIndex(int arr[],int target){
//        findAllDuplicates(arr,target,0);
//        System.out.println(list);

        System.out.println(findAllDuplicates3(arr,22,0));
    }
    public static boolean find(int arr[],int target,int index){
        if(index == arr.length){
            // target is not found
            return false;
        }
        return arr[index]== target || find(arr,target,index+1);
    }

    public static int findIndex(int arr[],int target,int index){
        if(index == arr.length){
            // target is not found
            return -1;
        } else if (arr[index]== target) {
            return index;
        }else
            return findIndex(arr,target,index+1);
    }

    public static boolean findLast(int arr[],int target,int index){
        if(index == -1){
            // target is not found
            return false;
        }
        return arr[index]== target || findLast(arr,target,index-1);
    }

    public static int findIndexLast(int arr[],int target,int index){
        if(index == -1){
            // target is not found
            return -1;
        } else if (arr[index]== target) {
            return index;
        }
            return findIndexLast(arr,target,index-1);
    }

    // find all the indexes
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllDuplicates(int arr[],int target,int index){
        if(index == arr.length){
            // target is not found
            return ;
        } else if (arr[index]== target) {
            list.add(index);
        }
        findAllDuplicates(arr,target,index+1);
    }

    public static ArrayList findAllDuplicates2(int arr[],int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            // target is not found
            return list;
        } else if (arr[index]== target) {
            list.add(index);
        }
       return findAllDuplicates2(arr,target,index+1,list);
    }
    // creating arraylist inside function
    public static ArrayList findAllDuplicates3(int arr[],int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            // target is not found
            return list;
        } else if (arr[index]== target) {
            list.add(index);
        }
        ArrayList<Integer> ans=findAllDuplicates3(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
