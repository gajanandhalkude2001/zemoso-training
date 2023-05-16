package corejava.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String args[])
    {
        Queue<Integer> queue = new PriorityQueue<Integer>();//min heap
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(15);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        Queue<Integer> Rqueue = new PriorityQueue<Integer>(Comparator.reverseOrder());//max heap
        Rqueue.offer(10);
        Rqueue.offer(30);
        Rqueue.offer(20);
        Rqueue.offer(15);
        System.out.println(Rqueue);
        System.out.println(Rqueue.size());
        System.out.println(Rqueue.remove());
        System.out.println(Rqueue);

    }
}
