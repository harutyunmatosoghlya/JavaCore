package useForPersonalPurposes;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите каличевство: ");
        short count = Short.parseShort(scanner.nextLine());
        System.out.print("введите текст: ");
        String text = scanner.nextLine();
        for (short i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }
}