package com.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutation("","abc");

        ArrayList<String> list = permutationList("","abc");

        System.out.println(list);
        System.out.println(permutationcount("","abc"));

    }
    public static void permutation(String pro , String unpro){
        if(unpro.isEmpty()){
            System.out.print(pro+" ");
            return;
        }

        char ch = unpro.charAt(0);

        for (int i = 0;i<= pro.length();i++){
            String first = pro.substring(0,i);
            String second  = pro.substring(i,pro.length());
            permutation(first+ch+second,unpro.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String pro , String unpro){
        if(unpro.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(pro);
            return list;
        }

        char ch = unpro.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0;i<= pro.length();i++){
            String first = pro.substring(0,i);
            String second  = pro.substring(i,pro.length());
            ans.addAll(permutationList(first+ch+second,unpro.substring(1)));
        }
        return ans;
    }
    public static int permutationcount(String pro , String unpro){
        if(unpro.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unpro.charAt(0);

        for (int i = 0;i<= pro.length();i++){
            String first = pro.substring(0,i);
            String second  = pro.substring(i,pro.length());
            count = count+permutationcount(first+ch+second,unpro.substring(1));
        }
        return count;
    }
}
