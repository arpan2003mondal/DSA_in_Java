package com.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        //subString(" ","abc");

        System.out.println(subStringAscii(" ","abc"));
    }

    public static void subString(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subString(processed+ch,unprocessed.substring(1));
        subString(processed,unprocessed.substring(1));
    }

    public static ArrayList<String> subString2(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subString2(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = subString2(processed,unprocessed.substring(1));

        left.addAll(right);

        return left;
    }

    public static ArrayList<String> subStringAscii(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> first = subStringAscii(processed+ch,unprocessed.substring(1));
        ArrayList<String> second = subStringAscii(processed,unprocessed.substring(1));
        ArrayList<String> third = subStringAscii(processed + (ch+0),unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

}
