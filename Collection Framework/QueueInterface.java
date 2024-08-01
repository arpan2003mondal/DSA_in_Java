package com.CollectionFramework;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> q1 = new ArrayDeque<>(4);

        q1.offer("apple"); // offer is used to add items
        q1.offer("banana");
        q1.offer("mango");
        q1.offer("egg");
        q1.offer("egg");




        System.out.println("Queue = "+q1);
        System.out.println("Removed = "+q1.poll());  // poll is used to remove items

        // Double Ended Queue
        Deque<Integer> dq = new ArrayDeque<>(5);

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        dq.offerFirst(40);


        System.out.println("Deque = "+dq);

//        dq.pollFirst();
//        dq.pollLast();
        System.out.println("Deque = "+dq);

        PriorityQueue<Integer> pq = new PriorityQueue<>(dq);
        pq.offer(10);
        pq.offer(90);
        pq.offer(74);
        pq.offer(99);
        pq.offer(3);

        System.out.println("Priority Queue = "+pq);
        System.out.println("Peek Element = "+pq.poll());
        System.out.println("Priority Queue = "+pq);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(10);
        pq1.offer(90);
        pq1.offer(34);
        pq1.offer(99);
        pq1.offer(3);

        System.out.println("Priority Queue = "+pq1);
        System.out.println("Peek Element = "+pq1.poll());
        System.out.println("Priority Queue = "+pq1);




    }
}
