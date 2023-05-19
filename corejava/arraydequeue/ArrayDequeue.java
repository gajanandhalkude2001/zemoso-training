package corejava.arraydequeue;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeue {
    public static void main(String args[])
    {
        ArrayDeque<Integer> arrayDequeue = new ArrayDeque<>();

        arrayDequeue.offer(15);
        arrayDequeue.offerFirst(20);
        arrayDequeue.offerLast(5);
        arrayDequeue.offer(75);
        arrayDequeue.offer(35);
        System.out.println(arrayDequeue);
        System.out.println(arrayDequeue.getFirst());
        System.out.println(arrayDequeue.removeFirstOccurrence(5));
        System.out.println(arrayDequeue.pollLast());

    }
}
