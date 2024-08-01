package com.StackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(12);
        queue.insert(33);
        queue.insert(17);
        queue.insert(24);
        queue.insert(41);
        queue.insert(21);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
