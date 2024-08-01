package com.LinkedList;

public class DLL {
    Node head;
    Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev=node;
        }
        size++;
        head=node;
    }
    public void insertEnd(int value){
        if (head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.next = null;
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        node.prev = temp;
        temp.next = node;
        size++;
    }
    public void insertIndex(int value,int index){

        if(index == 0){
            insertFirst(index);
            return;
        }
        if (index == size){
            insertEnd(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for(int i = 1;i < index;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next=node;
        size++;

    }
    public void insertAfterData(int after,int data){
        Node node = new Node(data);
        Node temp = find(after);
        if(temp == null){
            System.out.println("Does not exits");
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null){
            temp.next.prev = node;
        }
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        size--;
        return val;
    }
    public int deleteEnd(){
        if(head.next == null){
            deleteFirst();
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        int val = temp.value;
        temp.prev.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i =  0;i<index;i++){
            temp =temp.next;
        }
        return temp;
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
    public void display(){
        if(head!=null){
            Node temp = head;
            Node last=null;
            while(temp != null){
                System.out.print(temp.value+"->");
                last = temp;
                temp = temp.next;
            }
            System.out.println("END");
            System.out.println("Print in Reverse");
            while(last != null){
                System.out.print(last.value+"->");
                last = last.prev;
            }
            System.out.println("Start");
        }
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
