package com.strings;

import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        //dial("","12");
//        System.out.println(diallist("","12"));
//        System.out.println(dialcount("","12"));
        System.out.println(letterOriginal("",""));
    }

    public static void dial(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = (up.charAt(0)-'0'); // this converts 2 from string '2'

        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch = (char)('a'+i);
            dial(p+ch,up.substring(1));
        }
    }


    public static ArrayList<String> diallist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = (up.charAt(0)-'0'); // this converts 2 from string '2'
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch = (char)('a'+i);
            ans.addAll(diallist(p+ch,up.substring(1)));
        }
        return ans;
    }
    public static int dialcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = (up.charAt(0)-'0'); // this converts 2 from string '2'
        int count = 0;
        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch = (char)('a'+i);
            count = count +dialcount(p+ch,up.substring(1));
        }
        return count;
    }

    public static ArrayList<String> letterOriginal(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = (up.charAt(0) - '0'); // this converts 2 from string '2'
        ArrayList<String> ans = new ArrayList<>();
        if (digit == 1) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {

                char ch = (char) ('a' + i);
                ans.addAll(letterOriginal(p + ch, up.substring(1)));
            }

        } else if (digit == 8) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {

                char ch = (char) ('a' + i);
                ans.addAll(letterOriginal(p + ch, up.substring(1)));
            }

        } else if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i < (digit * 3) - 1; i++) {

                char ch = (char) ('a' + i);
                ans.addAll(letterOriginal(p + ch, up.substring(1)));
            }
        }
        else{
                for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {

                    char ch = (char) ('a' + i);
                    ans.addAll(letterOriginal(p + ch, up.substring(1)));
                }

            }
            return ans;
        }

    }
