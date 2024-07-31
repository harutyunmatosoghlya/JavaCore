package homeworks.homework4;

import java.util.Random;

public class ArrayHomeworkTools {
//    int[] numbers = {6, 6, 5, 7, 9, 5, 6, 7, 4, 5};

    int[] numbers = new int[new Random().nextInt(1, 40)];

    void arrayCreate() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(-20, 20);
        }
    }

    char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ', 'օ'};
    char[] vowelLetters = {'ա', 'ե', 'ի', 'ո', 'է', 'ը'};

    void all() {
        System.out.print("Все элементы: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    void count() {
        int n = numbers[0];
        int count = 0;
        for (int number : numbers) {
            if (number == n) {
                count++;
            }
        }
        System.out.println("\nколичество " + n + " в массиве = " + count);
    }

    void count(int n) {
        int count = 0;
        for (int number : numbers) {
            if (number == n) {
                count++;
            }
        }
        System.out.println("\nколичество " + n + " в массиве = " + count);
    }

    void revers() {
        int stertIndex = 0;
        int endIndeex = numbers.length - 1;
        while (stertIndex < endIndeex) {
            int temp = numbers[stertIndex];
            numbers[stertIndex++] = numbers[endIndeex];
            numbers[endIndeex--] = temp;
        }
        System.out.print("Все перевернутые элементы: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    int countElements() {
        int doublicatecount = 0;
        int[] doubleheader = new int[numbers.length];
        int doubliceatearrayindex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    boolean existDuplicate = false;
                    for (int x : doubleheader) {
                        if (numbers[i] == x) {
                            existDuplicate = true;
                            break;
                        }
                    }
                    if (!existDuplicate) {
                        doublicatecount++;
                        doubleheader[doubliceatearrayindex++] = numbers[i];
                        break;
                    }
                }
            }
        }
        return doublicatecount;
    }

    int vowelLetters() {
        int y = 0;
        for (char aChar : chars) {
            for (char vowelLetter : vowelLetters) {
                if (aChar == vowelLetter) {
                    y++;
                }
            }
        }
        return y;
    }
}