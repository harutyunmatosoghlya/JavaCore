package homeworks.homework4;

import java.util.Random;

public class ArrayHomework {
    public static void main(String[] args) {
        ArrayHomeworkTools arrayHomeworkTools = new ArrayHomeworkTools();
//        int[] numbs = {6, 6, 5, 7, 9, 5, 6, 7, 4, 5};
//        int[] numbs = new int[10];
//        for (int i = 0; i < numbs.length; i++) {
//            numbs[i] = new Random().nextInt(0, 10);
//        }
        arrayHomeworkTools.arrayCreate();
        arrayHomeworkTools.all();
        arrayHomeworkTools.count();
        arrayHomeworkTools.count(5);
        arrayHomeworkTools.revers();
        System.out.println("\nПовторения: " + arrayHomeworkTools.countElements());
        System.out.print("Гластные: " + arrayHomeworkTools.vowelLetters());
    }
}