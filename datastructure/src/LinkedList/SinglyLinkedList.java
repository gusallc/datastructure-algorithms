package LinkedList;

public class SinglyLinkedList<E> {

    private Node head;
    private int size;

    private class Node {
        private final E element;
        private Node next;

        public Node(E element) {
            this.element = element;
        }
    }

    private boolean indexExist(int index) {
        return index < size;
    }

    public E getElement(int index) {
        Node indexFound = getNodeByIndex(index);
        return indexFound != null ? indexFound.element : null;
    }

    private Node getNodeByIndex(int index) {
        // validate index out of range
        if (!indexExist(index)) {
            return null;
        }
        Node pointer = head;
        int currentIndex = 0;
        while (currentIndex < index && pointer.next != null) {
            pointer = pointer.next;
            currentIndex++;
        }
        return pointer;
    }

    public void insertStart(E element) {
        Node node = new Node(element);
        // the head now becomes a queue
        node.next = head;
        // and the new node becomes a head
        head = node;
        size++;
    }

    public void insertLast(E element) {
        Node node = new Node(element);
        Node pointer = head;
        // validate that the last index is not null (A is the last)
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        // A(pointer).next is null
        pointer.next = node;
        size++;
    }

    public void insertAfter(int index, E element) {
        // Create node "D"
        Node node = new Node(element);
        if (head == null) {
            head = node;
            size++;
        } else {
            Node pointer = getNodeByIndex(index);
            if (pointer == null) {
                insertLast(element);
            } else {
                // C -> B -> A
                //           (right) D -> A
                node.next = pointer.next;
                // C -> B -> D (left)
                pointer.next = node;
                // C -> B -> D -> A
                size++;
            }
        }
    }

    public void insertBefore(int index, E element) {
        if (index == 0) {
            insertStart(element);
        } else {
            insertAfter(index - 1, element);
        }
    }

    public void deleteLast() {
        if (size == 1) {
            head = null;
        } else {
            // C -> B -> A
            Node pointer = getNodeByIndex(size - 2);
            // C -> B
            pointer.next = null;
            // C -> B -> null
            size--;
        }
    }

    public void deleteStart() {
        // store current head
        Node pointer = head;
        head = head.next;
        // delete object from memory
        pointer.next = null;
        size--;
    }

    public void deleteByIndex(int index) {
        if (index == 0) {
            deleteStart();
            return;
        }
        // C -> B -> A
        Node current = getNodeByIndex(index); // B
        Node pointerLeft = getNodeByIndex(index - 1); // C
        // store the following pointer so that the reference is not lost
        Node temp = current.next; // A
        pointerLeft.next = temp;
        //C -> A
        //Delete reference
        current.next = null;
        size--;
    }

}

