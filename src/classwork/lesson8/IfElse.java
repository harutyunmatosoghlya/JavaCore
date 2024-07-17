package classwork.lesson8;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите месяц: ");
            int month = scanner.nextInt();
            if (month == 12 || month == 1 || month == 2) {
                System.out.print("зима");
            } else if (month == 3 || month == 4 || month == 5) {
                System.out.print("осень");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.print("лето");
            } else if (month == 9 || month == 10 || month == 11) {
                System.out.print("осень");
            } else {
                System.out.print("Такого месяца не существует.");
        }
    }
}