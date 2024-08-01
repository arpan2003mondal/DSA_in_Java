package com.gfg;

import java.util.ArrayList;

public class SearchPattern {
    public static void main(String[] args) {
       String text = "geeksforgeeks";

        String pattern = "geek";
        System.out.println(search(pattern,text));


    }

    public static ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        char firstChar = pattern.charAt(0);
        ArrayList<Integer> list = new ArrayList<>();
        int pLen=pattern.length();
        for (int i = 0;i<=text.length()-pattern.length();i++){
            if(firstChar == text.charAt(i)) {
                String part = text.substring(i, i + pLen);
                if(pattern.equals(part)){
                    list.add(i+1);
                }
            }

        }
        return list;
    }
}
