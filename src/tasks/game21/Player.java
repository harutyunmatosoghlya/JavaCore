package tasks.game21;

import java.util.Random;
import java.util.Scanner;

public record Player(String name, boolean isBot) {
    public int makeMove(int total) {
        if (!isBot) {
            return getPlayerMove();
        } else {
            return getBotMove(total);
        }
    }

    private int getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int move = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(name + ", ваш ход. Введите число (1, 2 или 3): ");
                move = Integer.parseInt(scanner.nextLine());
                if (move < 1 || move > 3) {
                    System.out.println("Некорректное число. Введите число (1, 2 или 3): ");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите целое число.");
            }
        }
        return move;
    }

    private int getBotMove(int total) {
        System.out.print(name + " думает");
        try {
            Thread.sleep(new Random().nextInt(500, 1500));
            for (int i = 4; i > 1; i--) {
                System.out.print(".");
                Thread.sleep(new Random().nextInt(500, 500 * i));
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка при ожидании.");
            Thread.currentThread().interrupt();
        }
        System.out.println();
        int move = (total + 4) % 4;
        if (move == 0) {
            move = 1;
        }
        if (new Random().nextBoolean()) {
            move = new Random().nextInt(1, 3);
        }
        System.out.println(name + " выбрал: " + move);
        return move;
    }
}