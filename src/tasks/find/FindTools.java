package tasks.find;

import java.util.Random;
import java.util.Scanner;

public class FindTools {
    int targetNumber;
    int guess;
    boolean isCorrect;
    private Scanner scanner;

    public FindTools() {
        this.targetNumber = generateRandomNumber();
        this.isCorrect = false;
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {
        while (!this.isCorrect) {
            this.guess = getUserGuess();
            this.isCorrect = checkGuess(this.guess, this.targetNumber);
        }
        scanner.close();
    }

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public int getUserGuess() {
        System.out.print("\u001B[35mВведите ваше предположение: \u001B[0m");
        return scanner.nextInt();
    }

    public boolean checkGuess(int guess, int target) {
        if (guess > target) {
            System.out.println("\u001B[34mСлишком много! Попробуйте еще раз.\u001B[0m");
            return false;
        } else if (guess < target) {
            System.out.println("\u001B[36mСлишком мало! Попробуйте еще раз.\u001B[0m");
            return false;
        } else {
            System.out.print("\u001B[32mПоздравляем! Вы угадали число.\u001B[0m");
            return true;
        }
    }
}
