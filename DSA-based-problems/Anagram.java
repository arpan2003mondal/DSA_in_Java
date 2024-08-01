package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "ababababab";
        String p = "aab";
        System.out.println(search(s,p));

//        String str = "My name";
//        String str1 = str;
//        System.out.println(str);
//        System.out.println(str1);
//        str1 = "Java training";
//        System.out.println(str1);
//        String str1="aab";
//        String str2="aba";
//        System.out.println(str1.compareTo(str2));
    }

    public static ArrayList<Integer> search(String s, String p)
    {
        // your code here
        boolean isSameChar = false;
        if(sameChar(p)){
            isSameChar = true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int pLen=p.length();
        for (int i = 0;i<=s.length()-p.length();i++){
                String part = s.substring(i, i + pLen);
                if((isSameChar) ){
                    if (p.equals(part))
                         list.add(i);
                }
                else if(isAnagram(part,p)){
                    list.add(i);
                }
            }


        return list;
    }

    private static boolean sameChar(String p) {
        boolean bit = true;
        for(int i =0;i<p.length()-1;i++){
            if(p.charAt(0) == p.charAt(i+1)){
                bit = true;
            }
            else {
                bit = false;
                break;
            }
        }
        return bit;
    }

    private static boolean isAnagram(String part, String p) {
        char []arr1 = part.toCharArray();
        char []arr2 = p.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<p.length();i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram2(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
