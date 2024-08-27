package useForPersonalPurposes;

import java.util.Scanner;

public class Cycle {
    Scanner scanner = new Scanner(System.in);

    public void cycle() {
        System.out.print("введите каличевство: ");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.print("введите текст: ");
        String text = scanner.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(int count) {
        System.out.print("введите текст: ");
        String text = scanner.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(String text) {
        System.out.print("введите каличевство: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(int count, String text) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(String text, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }
}