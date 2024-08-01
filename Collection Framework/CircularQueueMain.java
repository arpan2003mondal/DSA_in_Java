package com.StackQueue;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        DynamicCircularQueue queue = new DynamicCircularQueue(5);
        queue.insert(12);
        queue.insert(33);
        queue.insert(17);
        queue.insert(24);
        queue.insert(41);

        queue.display();

        queue.remove();
        queue.remove();
        queue.display();

        queue.insert(121);
        queue.insert(111);
        queue.insert(111);
        queue.display();
    }
}
