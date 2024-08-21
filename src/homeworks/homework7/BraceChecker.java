package homeworks.homework7;

import classwork.lesson12.Stack;

public class BraceChecker {
    Stack stack = new Stack();
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void chack() {

        for (int i = 0; i < text.length(); i++) {
            char c;
            char last;
            int pop;
            c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed '" + c + "' but don't opened at" + i);
                    } else {
                        last = (char) pop;
                        if (last != '(') {
                            System.out.println("Error: closed '" + c + "' but opened '" + last + "' at " + i);
                        }
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed '" + c + "' but don't opened at " + i);
                    } else {
                        last = (char) pop;
                        if (last != '[') {
                            System.out.println("Error: closed '" + c + "' but opened '" + last + "' at " + i);
                        }
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed '" + c + "' but don't opened at" + i);
                    } else {
                        last = (char) pop;
                        if (last != '{') {
                            System.out.println("Error: closed '" + c + "' but opened '" + last + "' at " + i);
                        }
                    }
                    break;
            }

        }
        while (!stack.isEmpty()) {
            System.out.println("Error: closed '" + (char) stack.pop() + "' but don't opened");
        }
    }
}
