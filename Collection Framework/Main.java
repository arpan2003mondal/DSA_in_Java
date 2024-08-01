package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertEnd(7);
        list.insertEnd(2);
        list.insertIndex(4,2);
        list.display();

        System.out.println(list.size());

        System.out.println(list.deleteIndex(2)+" is deleted ");
        list.display();
        System.out.println(list.size());

      //  System.out.println(list.find(9));

    }
}
