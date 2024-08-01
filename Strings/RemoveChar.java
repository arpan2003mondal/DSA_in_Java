package com.strings;

public class RemoveChar {
    // this class removes a particular character from a gievn stiring
    public static void main(String[] args) {
       // skip("","baccab");

        //System.out.println(skip("baccab",'b'));

        System.out.println(skipString("abcappleabxm,i like apple to eat","apple"));
    }

    public static void skip(String processed ,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed,unprocessed.substring(1));
        }
        else {
            skip(processed+ch,unprocessed.substring(1));
        }
    }

    public static String skip(String unprocessed,char key){
        if(unprocessed.isEmpty()){
            return " ";
        }
        char ch = unprocessed.charAt(0);

        if(ch == key){
            return skip(unprocessed.substring(1),key);
        }
        else {
            return ch + skip(unprocessed.substring(1),key);
        }
    }

    public static String skipString(String unprocessed,String key){
        if(unprocessed.isEmpty()){
            return " ";
        }
        //String  ch = unprocessed.charAt(0);

        if(unprocessed.startsWith(key)){
            return skipString(unprocessed.substring(key.length()),key);
        }
        else {
            return unprocessed.charAt(0) + skipString(unprocessed.substring(1),key);
        }
    }
}
