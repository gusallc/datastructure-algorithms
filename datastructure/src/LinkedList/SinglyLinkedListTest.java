package LinkedList;

class SinglyLinkedListTest {
    static SinglyLinkedList<String> singlyLinkedList;

    public static void main(String[] args) {
        insertStartAndGetMethodTest();
        insertLastTest();
        insertAfterTest();
        insertBeforeTest();
        deleteLastWithPositionCeroTest();
        deleteLastTest();
        deleteStartTest();
        deleteByIndexTest();
    }

    static void insertStartAndGetMethodTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
        System.out.println("singlyLinkedList.get(2) = " + singlyLinkedList.getElement(2));
        System.out.println("singlyLinkedList.get(3) = " + singlyLinkedList.getElement(3));
    }

    static void insertLastTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.insertLast("D");
        // C -> B -> A -> D
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
        System.out.println("singlyLinkedList.get(2) = " + singlyLinkedList.getElement(2));
        System.out.println("singlyLinkedList.get(3) = " + singlyLinkedList.getElement(3));
    }

    static void insertAfterTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.insertAfter(/* B */ 1, "D");
        // C -> B -> D -> A
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
        System.out.println("singlyLinkedList.get(2) = " + singlyLinkedList.getElement(2));
        System.out.println("singlyLinkedList.get(3) = " + singlyLinkedList.getElement(3));
    }

    static void insertBeforeTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.insertBefore(/* B */ 1, "D");
        // C -> D -> B -> A
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
        System.out.println("singlyLinkedList.get(2) = " + singlyLinkedList.getElement(2));
        System.out.println("singlyLinkedList.get(3) = " + singlyLinkedList.getElement(3));
    }

    static void deleteLastWithPositionCeroTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        // A
        singlyLinkedList.deleteLast();
        // -> null
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
    }

    static void deleteLastTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.deleteLast();
        // C -> B -> null
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
        System.out.println("singlyLinkedList.get(2) = " + singlyLinkedList.getElement(2));
    }

    static void deleteStartTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.deleteStart();
        // B -> A
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
    }

    static void deleteByIndexTest() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertStart("A");
        singlyLinkedList.insertStart("B");
        singlyLinkedList.insertStart("C");
        // C -> B -> A
        singlyLinkedList.deleteByIndex(1);
        // C -> A
        System.out.println("singlyLinkedList.get(0) = " + singlyLinkedList.getElement(0));
        System.out.println("singlyLinkedList.get(1) = " + singlyLinkedList.getElement(1));
    }

}