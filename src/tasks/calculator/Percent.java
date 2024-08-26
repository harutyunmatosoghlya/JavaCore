package tasks.calculator;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число или \"exit\" для выхода:");
            if (scanner.hasNext("exit")) {
                break;
            }
            double number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Калькулятор не может рассчитать процент с отрицательным числом и с нолем.");
                scanner.nextLine();
                continue;
            } else
                System.out.println("Введите второе число:");
            if (scanner.hasNext("exit")) {
                break;
            }
            double number2 = scanner.nextDouble();
            if (number2 <= 0) {
                System.out.println("Калькулятор не может рассчитать процент с отрицательным числом и с нолем.");
                scanner.nextLine();
            } else {
                double answer1 = (number / 100) * number2;
                double answer2 = (number2 / number) * 100;
                System.out.println("Результаты:");
                System.out.println(number2 + " % от " + number + " = " + answer1);
                System.out.println("либо");
                System.out.println(number2 + " это " + answer2 + "% от " + number);
                scanner.nextLine();
            }
        }
    }
}