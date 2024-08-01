package com.dsa;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        System.out.println(sb);

        // printing a to z using string builder
        StringBuilder alpha = new StringBuilder();

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            alpha.append(ch);
        }
        System.out.println(alpha);
//        StringBuilder str
//                = new StringBuilder("Hello");
//
//        str.append(" World!");
//
//        System.out.println(str);

    }
}
