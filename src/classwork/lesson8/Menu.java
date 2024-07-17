package classwork.lesson8;

public class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char chose;
        do {
            System.out.println("Спрвака:");
            System.out.println("         1. if");
            System.out.println("         2. switch");
            System.out.println("         3. while");
            System.out.println("         4. do-while");
            System.out.println("         5. for");
            System.out.println("Выберите нужный пункт:");
            chose = (char) System.in.read();
        } while (chose < '1' || chose > '5');
        System.out.println();
        switch (chose) {
            case '1':
                System.out.print("if:\n" +
                        "if(условия) оператор;\n" +
                        "else оператор;");
                break;
            case '2':
                System.out.print("switch:\n" +
                        "switch(выражение) {\n" +
                        "case константа:\n" +
                        "последовательность операторов\n" +
                        "break;\n" +
                        "/ / ...\n" +
                        "}");
                break;
            case '3':
                System.out.print("while:\n" +
                        "while(ycлoвиe) оператор;");
                break;
            case '4':
                System.out.print("do-while:\n" +
                        "do {\n" +
                        "оператор;\n" +
                        "while (условие);");
                break;
            case '5':
                System.out.print("for:\n" +
                        "for(инициaлизaция; условие; итерация)\n" +
                        "оператор;");
                break;
        }
    }
}
