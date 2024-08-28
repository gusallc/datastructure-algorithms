package Queues;

public class QueueTest {

    static Queue<String> queue;

    public static void main(String[] args) {
        enQueueTest();
        deQueueTest();
    }

    public static void enQueueTest() {
        queue = new Queue<>();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        //   A   <-  B <-  C
        // front <-    <- rear
        System.out.println("queue.getElement() = " + queue.peek());
    }

    public static void deQueueTest() {
        queue = new Queue<>();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        //   A   <-  B <-  C
        // front <-    <- rear
        queue.deQueue();
        //  B   <-  C
        // front <- rear
        System.out.println("queue.getElement() = " + queue.peek());
        System.out.println("queue.isEmpty() = " + queue.isEmpty()); // false
    }
}
