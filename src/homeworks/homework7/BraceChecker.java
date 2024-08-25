package homeworks.homework7;

import classwork.lesson12.Stack;

public class BraceChecker {
    Stack stack = new Stack();
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char c;
            Brace pop;
            c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(new Brace(c, i));
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == null) {
                        System.out.println("Error: closed '" + c + "' but don't opened at " + i);
                    } else {
                        if (pop.getBrace() != '(') {
                            System.out.println("Error: closed '" + c + "' but opened '" + pop.getBrace() + "' at " + i);
                        }
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == null) {
                        System.out.println("Error: closed '" + c + "' but don't opened at " + i);
                    } else {
                        if (pop.getBrace() != '[') {
                            System.out.println("Error: closed '" + c + "' but opened '" + pop.getBrace() + "' at " + i);
                        }
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == null) {
                        System.out.println("Error: closed '" + c + "' but don't opened at" + i);
                    } else {
                        if (pop.getBrace() != '{') {
                            System.out.println("Error: closed '" + c + "' but opened '" + pop.getBrace() + "' at " + i);
                        }
                    }
                    break;
            }

        }
        while (!stack.isEmpty()) {
            System.out.println("Error: opened '" + stack.pop().getBrace() + "' but don't closed at " + stack.pop().getIndex());
        }
    }
}
