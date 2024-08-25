package homeworks.homework7;

import java.util.Scanner;

public class BraceCheckerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        BraceChecker bc = new BraceChecker(text);
        bc.check();
    }
}
