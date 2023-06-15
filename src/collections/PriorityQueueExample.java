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
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("carrot");

        PriorityQueue<Number> q1 = new PriorityQueue<>();
        q1.add(new Integer(6));
        q1.add(new Double(1.0));

        System.out.println(q1);


        q.add("apple");
        q.add("banana");
        System.out.println(q.poll()+" "+q.peek());
        //System.out.println(q);
        //q.remove();
        //System.out.println(q);
    }
}
