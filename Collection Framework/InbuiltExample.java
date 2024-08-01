package com.StackQueue;

import java.util.*;

public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        System.out.println(stack.capacity());
//        stack.push(12);
//        stack.push(11);
//        stack.push(22);
//        stack.push(32);
//        stack.push(13);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(33);
//        queue.add(17);
//        queue.add(24);
//        queue.add(41);
//        queue.add(21);
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.add(11);
        deque.add(45);
        deque.addFirst(29);
        deque.addLast(54);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}
