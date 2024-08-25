package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(55);
        stack.push(555);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
