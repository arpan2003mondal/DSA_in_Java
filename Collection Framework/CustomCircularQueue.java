package com.StackQueue;

public class CustomCircularQueue {
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomCircularQueue(int size) {
        this.data = new int[size] ;
    }

    public boolean insert(int item){
        if (isFull()){
            System.out.println("Queue is full ");
            return false;
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty..");
        }
        int removed = data[front];
        front++;
        front%= data.length;
        size--;
        return removed;
    }
    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty..");
        }
        int i = front;
        do {
            System.out.print(data[i]+"<- ");
            i++;
            i%= data.length;
        }while (i!=end);
        System.out.println("END");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return data.length == size;
    }
}
