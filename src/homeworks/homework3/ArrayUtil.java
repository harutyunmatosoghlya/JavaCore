package homeworks.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtilTools arrayUtilTools = new ArrayUtilTools();
        arrayUtilTools.arrayCreate();
        arrayUtilTools.all();
        System.out.print("\nПервый элемент: " + arrayUtilTools.numbers[0]);
        System.out.print("\nПоследный элемент: " + arrayUtilTools.last());
        System.out.println("\nДлина массива: " + arrayUtilTools.lenght());
        System.out.println("Мельчайший элемент: " + arrayUtilTools.min());
        arrayUtilTools.middle();
        System.out.println("Количество четных элементов в массиве: " + arrayUtilTools.even());
        System.out.println("Количество нечетных элементов в массиве: " + arrayUtilTools.odd());
        System.out.println("Cумма всех элементов: " + arrayUtilTools.sum());
        System.out.print("Средняя арифметическая всех элементов: " + arrayUtilTools.average());
    }
}