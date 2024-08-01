package homeworks.homework4;

import java.util.Random;

public class ArrayHomework {
    public static void main(String[] args) {
        ArrayHomeworkTools arrayHomeworkTools = new ArrayHomeworkTools();
        arrayHomeworkTools.all();
        System.out.print("\nколичество повторенний в массиве введоного вами элемента = " + arrayHomeworkTools.count(5) + "\n");
        arrayHomeworkTools.revers();
        System.out.println("\nПовторения: " + arrayHomeworkTools.countElements());
        System.out.print("Гластные: " + arrayHomeworkTools.vowelLetters());
    }
}