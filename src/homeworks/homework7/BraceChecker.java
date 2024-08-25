package homeworks.homework7;

public class BraceChecker {
    StackBrace stackBrace = new StackBrace();
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
                    stackBrace.push(new Brace(c, i));
                    break;
                case ')':
                    pop = stackBrace.pop();
                    if (pop == null) {
                        System.out.println("Error: closed '" + c + "' but don't opened at " + i);
                    } else {
                        if (pop.getBrace() != '(') {
                            System.out.println("Error: closed '" + c + "' but opened '" + pop.getBrace() + "' at " + i);
                        }
                    }
                    break;
                case ']':
                    pop = stackBrace.pop();
                    if (pop == null) {
                        System.out.println("Error: closed '" + c + "' but don't opened at " + i);
                    } else {
                        if (pop.getBrace() != '[') {
                            System.out.println("Error: closed '" + c + "' but opened '" + pop.getBrace() + "' at " + i);
                        }
                    }
                    break;
                case '}':
                    pop = stackBrace.pop();
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
        while (!stackBrace.isEmpty()) {
            System.out.println("Error: opened '" + stackBrace.pop().getBrace() + "' but don't closed at " + stackBrace.pop().getIndex());
        }
    }
}
