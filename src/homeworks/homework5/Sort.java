package homeworks.homework5;

import java.util.Random;

public class Sort {
//    int[] numbers = {4, 7, 1, 3, 9, 0, 2};

    int[] numbers = new int[new Random().nextInt(0, 20)];

    Sort() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(0, 20);
        }
    }

    void promotion() {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    void decrease() {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] >= numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
