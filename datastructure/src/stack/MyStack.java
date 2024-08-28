package stack;

public class MyStack<E> implements Stack<E> {

    private Node top;
    private int size;

    private class Node {
        private E element;
        private Node next;

        public Node(E element) {
            this.element = element;
        }
    }

    @Override
    public void push(E element) {
        Node node = new Node(element);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public void pop() {
        if (top != null) {
            Node pointer = top;
            top = pointer.next;
            // delete object from memory
            pointer.next = null;
            size--;
        }
    }

    @Override
    public E getElement() {
        if (top == null) {
            return null;
        }
        return top.element;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
