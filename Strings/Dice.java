package com.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
       // combination("",4);
        System.out.println(combinationlist("",4));
    }
    public static void combination(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i<= target && i<= 6 ;i++){
            combination(p+i,target-i);
        }
    }

    public static ArrayList<String> combinationlist(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1;i<= target && i<= 6 ;i++){
            ans.addAll(combinationlist(p+i,target-i));
        }
        return ans;
    }
}
