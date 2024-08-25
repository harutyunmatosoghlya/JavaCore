package stack;

public class Stack {
    private int[] stack = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }


    public void push(int item) {
        if (tos == stack.length-1) {
            extendsStack();
        }
        stack[++tos] = item;
    }

    private void extendsStack() {
        int[] longStack = new int[stack.length + 10];
        System.arraycopy(stack, 0, longStack, 0, tos);
        stack = longStack;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public int peek() {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stack[tos];
        }
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}