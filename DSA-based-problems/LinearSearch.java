package com.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 45, 6, 1, 23, 8};
        int target = 1;
        System.out.println(linearSearch(arr, target));
        System.out.println(searchElement(arr, 15));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i + 1;
        }
        return -1;
    }

    static int searchElement(int[] arr, int target) {
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele == target)
                return target;
        }
        return Integer.MAX_VALUE;
    }
}