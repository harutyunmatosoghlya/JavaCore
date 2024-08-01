package homeworks.homework3;

import java.util.Random;

public class ArrayUtilTools {
    int[] numbers = new int[new Random().nextInt(1, 40)];

    ArrayUtilTools() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(-20, 20);
        }
    }

    void all() {
        System.out.print("Все элементы: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    int last() {
        return numbers[numbers.length - 1];
    }

    int lenght() {
        return numbers.length;
    }

    int min() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    void middle() {
        if (numbers.length <= 2) {
            System.out.print("В массиве мало элементов.\n");
        } else if (numbers.length % 2 == 1) {
            System.out.print("Средний элемент массива: " + numbers[numbers.length / 2] + "\n");
        } else {
            System.out.print("Средние элементы массива: " + numbers[(numbers.length / 2) - 1] + ", " + numbers[numbers.length / 2] + "\n");
        }
    }

    int even() {
        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int odd() {
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    int sum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    double average() {
        double average = (double) sum() / numbers.length;
        return average;
    }
}
