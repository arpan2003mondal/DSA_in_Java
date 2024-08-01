package com.LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        head=null;
        tail = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head =node;
            tail =node;
            head.next=head;
            return;
        }
        node.next = head;
        tail.next=node;
        //tail = node;
        head=node;
        size+=1;
    }
    public void delete(int value){
        Node node= head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n =node.next;
            if (n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }
//    public void insertEnd(int value){
//        if (tail == null){
//            insertFirst(value);
//            return;
//        }
//        Node node  = new Node(value);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//    public void insertIndex(int val,int index){
//        if(index == 0 ){
//            insertFirst(val);
//        }
//        else if(index == size ){
//            insertEnd(val);
//        }else{
//            Node temp = get(index-1);
////            for(int i =1;i<index;i++){
////                temp = temp.next;
////            }
//            Node node = new Node(val,temp.next);
//            temp.next = node;
//        }
//        size++;
//    }
//    public int deleteFirst(){
//        int val = head.value;
//        head = head.next;
//        size--;
//        return val;
//    }
//    public int deleteEnd(){
//        LL.Node secondLast = get(size-2);
//        int val = secondLast.next.value;
//        tail = secondLast;
//        tail.next = null;
//        size--;
//        return val;
//    }
//    public int deleteIndex(int index){
//        LL.Node prev = get(index-1);
//        int val = prev.next.value;
//        prev.next = prev.next.next;
//        size--;
//        return val;
//    }
//    public LL.Node find(int value){
//        LL.Node node = head;
//        while(node != null){
//            if(node.value == value){
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }
//    public LL.Node get(int index){
//        LL.Node temp = head;
//        for(int i = 0;i < index;i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                    System.out.print(temp.value+"->");
                    temp = temp.next;
                }while (temp != head);
            }
            System.out.println("HEAD");
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
