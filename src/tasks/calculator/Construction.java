package tasks.calculator;

import java.util.Scanner;

public class Construction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число или \"exit\" для выхода:");
            if (scanner.hasNext("exit")) {
                break;
            }
            double number = scanner.nextDouble();
            System.out.println("Введите возаедение");
            if (scanner.hasNext("exit")) {
                break;
            }
            long construction = scanner.nextInt();
            double result = 1;
            for (long i = 1; i <= construction; i++) {
                result *= number;
            }
            System.out.println(number + " ^ " + construction + " = " + result);
            scanner.nextLine();
        }
    }
}