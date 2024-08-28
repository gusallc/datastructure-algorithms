package stack;

public class MyStackTest {

    public static void main(String[] args) {

        Stack<String> stack = new MyStack<>();
        stack.push("A");
        System.out.println("stack.getElement() = " + stack.getElement());
        stack.push("B");
        System.out.println("stack.getElement() = " + stack.getElement());
        printStatus(stack);
    }

    private static void printStatus(Stack<String> stack) {
        while (!stack.isEmpty()) {
            stack.pop();
            System.out.println(" L=  " + stack.length() + "  " + stack.getElement());
        }
    }
}
