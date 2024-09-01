package useForPersonalPurposes;

import java.util.Scanner;

public class Cycle {
    Scanner scanner = new Scanner(System.in);

    public void cycle() {
        System.out.print("введите каличевство: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("введите текст: ");
        String text = scanner.nextLine();
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(int quantity) {
        System.out.print("введите текст: ");
        String text = scanner.nextLine();
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(String text) {
        System.out.print("введите каличевство: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(int quantity, String text) {
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }

    public void cycle(String text, int quantity) {
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": " + text + ", ");
        }
    }
}