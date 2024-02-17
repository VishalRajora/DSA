package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(24);
        queue.add(242);
        queue.add(241);
        queue.add(242);
        queue.add(2444);
        queue.add(245);

        System.out.println("All items = " + queue);
        System.out.println("item Peek = " + queue.peek());
        System.out.println("item1 removed = " + queue.remove());
        System.out.println("All items After remove = " + queue);
        System.out.println("item peek after remove = " + queue.peek());
        System.out.println("item poll = " + queue.poll());
        System.out.println("All items after poll = " + queue);
        System.out.println("item peek after poll = " + queue.peek());
    }
}
