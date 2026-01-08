package academy.devdojo.javaoneforall.collection.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        for (String s : queue) {
            System.out.println(s);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
