package tasks.calculator;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число или \"exit\" для выхода:");
            if (scanner.hasNext("exit")) {
                break;
            }
            int number = scanner.nextInt();
            long factorial = 1;
            if (number > 20 || number <= -1) {
                System.out.println("Калькулятор не может рассчитать факториал больше «20» и отрицательные числа.");
                scanner.nextLine();
            } else {
                for (long i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Факториал числа " + number + " равен " + factorial);
                scanner.nextLine();
            }
        }
    }
}