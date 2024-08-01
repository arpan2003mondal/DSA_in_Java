package com.StackQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        //System.out.println(stack.capacity());
        stack.push(12);
        stack.push(11);
        stack.push(22);
        stack.push(32);
        stack.push(13);
        stack.push(13);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
