package Queues;

public interface BasicQueuingOperations<E> {
    void enQueue(E element);

    void deQueue();

    E peek();

    boolean isEmpty();

}
