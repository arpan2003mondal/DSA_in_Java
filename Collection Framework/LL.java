package com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void insertFirst(int value){
        Node node = new Node(value,head);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size+=1;
    }
    public void insertEnd(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node  = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertIndex(int val,int index){
        if(index == 0 ){
            insertFirst(val);
        }
        else if(index == size ){
            insertEnd(val);
        }else{
            Node temp = get(index-1);
//            for(int i =1;i<index;i++){
//                temp = temp.next;
//            }
            Node node = new Node(val,temp.next);
            temp.next = node;
        }
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }
    public int deleteEnd(){
        Node secondLast = get(size-2);
        int val = secondLast.next.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int deleteIndex(int index){
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0;i < index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
       if(head != null){
           Node temp = head;
           while(temp != null){
               System.out.print(temp.value+"->");
               temp = temp.next;
           }
           System.out.println("END");
       }
       }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
