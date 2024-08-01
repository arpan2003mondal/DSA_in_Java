package com.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(6);

        map.put(1, "Smith");
        map.put(2, "jain");
        map.put(3, "Ruby");
        map.put(4, "Miller");
        map.put(1, "Sam");
        

        System.out.println(map);

        map.remove(3);


        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
