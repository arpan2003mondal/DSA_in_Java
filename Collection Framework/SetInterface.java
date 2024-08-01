package com.CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

       // mySet.addAll(Arrays.asList(new Integer[]{1,2,3,4}));

        mySet.add(1);
        mySet.add(2);
        mySet.add(8);
        mySet.add(9);

        System.out.println(mySet);

        LinkedHashSet<String> ls = new LinkedHashSet<>();

        ls.add("Ravi");
        ls.add("Arpan");
        ls.add("Mana");
        ls.add("Ajay");
        ls.add("Ravi");
//        Iterator<String> i = ls.iterator();
//        while (i.hasNext())
//            System.out.println(i.hasNext());

        System.out.println(ls);

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Ravi");
        ts.add("Arpan");
        ts.add("Mana");
        ts.add("Ajay");
        ts.add("Ravi");

        System.out.println(ts);
    }
}
