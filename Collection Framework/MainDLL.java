package com.LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(7);
        list.insertFirst(11);
        list.insertEnd(12);
        list.insertEnd(23);

        //list.insertIndex(22,4);
       list.insertAfterData(11,32);
        list.display();
        System.out.println("Size is "+list.size());
        System.out.println( list.deleteEnd()+" is deleted");
        System.out.println("Size is "+list.size());
        list.display();

    }
}
