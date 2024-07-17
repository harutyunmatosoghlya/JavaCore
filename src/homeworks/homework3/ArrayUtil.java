package homeworks.homework3;

import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {
        //        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int[] numbers = new int[new Random().nextInt(1, 40)];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(-20, 20);
        }
        System.out.print("Все элементы: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("\nПервый элемент: " + numbers[0] + "\n");
        System.out.println("Последний элемент: " + numbers[numbers.length - 1] + "\n");
        System.out.println("Длина массива: " + numbers.length + "\n");
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Мельчайший элемент: " + min + "\n");
        if (numbers.length <= 2) {
            System.out.println("В массиве мало элементов для среднего значения.\n");
        } else if (numbers.length % 2 == 1) {
            System.out.println("Среднее значение массива: " + numbers[numbers.length / 2] + "\n");
        } else {
            System.out.println("Среднее элемент массива: " + numbers[(numbers.length / 2) - 1]
                    + ", " + numbers[numbers.length / 2] + "\n");
        }
        int even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество четных элементов в массиве: " + even + "\n");
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Количество нечетных элементов в массиве: " + odd + "\n");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Cумма всех элементов: " + sum + "\n");
        double average = (double) sum / numbers.length;
        System.out.print("Средняя арифметическая всех элементов: " + average);
    }
}