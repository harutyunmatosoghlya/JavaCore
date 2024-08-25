package GPT.find;

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
        System.out.print("Введите ваше предположение: ");
        return scanner.nextInt();
    }

    public boolean checkGuess(int guess, int target) {
        if (guess > target) {
            System.out.println("Слишком много! Попробуйте еще раз.");
            return false;
        } else if (guess < target) {
            System.out.println("Слишком мало! Попробуйте еще раз.");
            return false;
        } else {
            System.out.println("Поздравляем! Вы угадали число.");
            return true;
        }
    }
}
