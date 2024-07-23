package homeworks.homework4;

import java.util.Random;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbs = {6, 6, 5, 7, 9, 5, 6, 7, 4, 5};
//        int[] numbs = new int[10];
//        for (int i = 0; i < numbs.length; i++) {
//            numbs[i] = new Random().nextInt(0, 10);
//        }
        System.out.print("массив: ");
        for (int numb : numbs) {
            System.out.print(numb + " ");
        }
        System.out.println();
        int n = 6;
        int quantity = 0;
        for (int numb : numbs) {
            if (numb == n) {
                quantity++;
            }
        }
        System.out.println("\nколичество " + n + " в массиве = " + quantity);
        int[] reNumbs = new int[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            reNumbs[i] = numbs[numbs.length - 1 - i];
        }
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = reNumbs[i];
        }
        int x = 0;
        int c = 0;
        System.out.print("\nперевернутый массив: ");
        for (int numb : numbs) {
            System.out.print(numb + " ");
        }
        System.out.println("\n");
        for (int numb : numbs) {
            for (int numb2 : numbs) {
                if (numb == numb2) {
                    x++;
                }
            }
            if (x > 1) {
                c++;
            }
            x = 0;
        }
        System.out.println("повтрорения: " + c);
        int y = 0;
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowelLetters = {'ա', 'ե', 'ի', 'ո', 'է', 'ը'};
        for (char aChar : chars) {
            for (char vowelLetter : vowelLetters) {
                if (aChar == vowelLetter) {
                    y++;
                }
            }
        }
        System.out.print("\nкаличевство гластных в массиве равно: " + y);
    }
}