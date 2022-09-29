package Queues;

public class Queue<E> implements BasicQueuingOperations<E> {
    private class Node {
        private final E element;
        private Node next;

        private Node(E element) {
            this.element = element;
        }
    }

    private Node head;
    private Node last;

    @Override
    public void enQueue(E element) {
        Node newNode = new Node(element); // Iteration 1: B | Iteration 2: C
        if (isEmpty()) {
            head = newNode; // Iteration 0
        } else {
            last.next = newNode; // Iteration 1: last =A | Iteration 2: last=B, A <- B
            //Iteration 1: A <- B | Iteration 2: A <- B <- C
        }
        last = newNode;
        //Iteration 0:A, 2:B , 3:C
    }

    @Override
    public void deQueue() {
        if (!isEmpty()) {
            // A <- B <- C
            Node deleteHead = head;
            head = head.next;
            // B <- C
            //remove the reference to B
            deleteHead.next = null;
        }
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

}
