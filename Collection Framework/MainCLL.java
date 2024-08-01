package com.LinkedList;

public class MainCLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(17);
        list.insertFirst(19);
        list.display();
        list.delete(13);
        list.display();
    }
}
