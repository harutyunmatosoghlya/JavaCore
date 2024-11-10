package tasks.game21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game21 {
    private final List<Player> players = new ArrayList<>();
    private int total = 0;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 21. Вы и несколько ботов по очереди называете число от 1 до 3.");
        int targetNumber = chooseTargetNumber(scanner);
        boolean think = think(scanner);
        System.out.println("Кто назовет " + targetNumber + ", тот проиграет!");
        int botCount = chooseBotCount(scanner, targetNumber);
        players.add(new Player("Игрок", false));
        for (int i = 1; i <= botCount; i++) {
            players.add(new Player("Бот " + i, true));
        }
        int currentPlayerIndex = chooseStartingPlayer(scanner, botCount);
        while (total < targetNumber) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int move = currentPlayer.makeMove(total, think);
            total += move;
            System.out.println("Общая сумма: " + total);
            if (total >= targetNumber) {
                System.out.print(currentPlayer.name() + " проиграл! Общая сумма достигла " + targetNumber + ".");
                break;
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }

    private int chooseTargetNumber(Scanner scanner) {
        int target = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Выберите число, кратное 7, от 21 до 105: ");
                target = Integer.parseInt(scanner.nextLine());
                if (target >= 21 && target <= 105 && target % 7 == 0) {
                    validInput = true;
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, выберите число, кратное 7.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите целое число.");
            }
        }
        return target;
    }

    private int chooseBotCount(Scanner scanner, int targetNumber) {
        int maxBots = calculateMaxBots(targetNumber);
        int botCount = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите количество ботов (от 1 до " + maxBots + "): ");
                botCount = Integer.parseInt(scanner.nextLine());
                if (botCount < 1 || botCount > maxBots) {
                    System.out.println("Количество ботов должно быть от 1 до " + maxBots + ".");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите целое число.");
            }
        }
        return botCount;
    }

    private boolean think(Scanner scanner) {
        System.out.print("введите '1' для быстрой игры: ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine()) == 1;
            } catch (NumberFormatException e) {
                System.out.print("введите число: ");
            }
        }
    }

    private int chooseStartingPlayer(Scanner scanner, int botCount) {
        int startingPlayerIndex = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Выберите, с кого начинается игра (1 - Игрок");
                if (botCount == 1) {
                    System.out.print(", 2 - Бот 1");
                } else if (botCount == 2) {
                    System.out.print(", 2 - Бот 1, 3 - Бот 2");
                } else {
                    System.out.print(", 2 - Бот 1 ... " + (botCount + 1) + " - Бот " + botCount);
                }
                System.out.print("): ");
                startingPlayerIndex = Integer.parseInt(scanner.nextLine()) - 1;
                if (startingPlayerIndex < 0 || startingPlayerIndex > botCount) {
                    System.out.println("Некорректный выбор. Пожалуйста, выберите номер от 1 до " + (botCount + 1) + ".");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите целое число.");
            }
        }
        return startingPlayerIndex;
    }

    private int calculateMaxBots(int targetNumber) {
        int maxBots = (targetNumber - 1) / 3;
        return Math.min(maxBots, 20);
    }

    public static void main() {
        Game21 game = new Game21();
        game.startGame();
    }
}