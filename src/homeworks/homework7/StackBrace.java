package homeworks.homework7;

public class StackBrace {
    private Brace[] stack = new Brace[10];
    private int tos;

    public StackBrace() {
        tos = -1;
    }


    public void push(Brace item) {
        if (tos == 9) {
            System.out.println("stack if full");
        } else {
            stack[++tos] = item;
        }
    }

    public Brace pop() {
        if (tos < 0) {
            return null;
        } else {
            return stack[tos--];
        }
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
