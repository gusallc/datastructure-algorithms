package stack;

public interface Stack<E> {

    void push(E element);

    void pop();

    E getElement();

    int length();

    boolean isEmpty();
}
