package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args){
        /*
        Queue
            - mutable
            - First In First Out

        PriorityQueue
            - Sorted
            - not allow Null value
        */
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(45);
        q.add(25);
        q.add(75);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
