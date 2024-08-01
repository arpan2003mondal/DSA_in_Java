package com.StackQueue;

public class CustomStack {
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int num) throws StackException{
        if(isFull()){
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = num;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek()throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot Peek as Stack is empty");
        }
        return data[ptr];
    }
    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return data.length-1 == ptr;
    }
}
