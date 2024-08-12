package homeworks.homework6;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i <= 10; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();
        System.out.println(dynamicArray.getByIndex(5));
        dynamicArray.print();
        dynamicArray.deleteByIndex(5);
        dynamicArray.print();
        dynamicArray.set(5, 5);
        dynamicArray.print();
        dynamicArray.add(5, 5);
        dynamicArray.print();
        System.out.println(dynamicArray.exists(5));
        dynamicArray.print();
        System.out.println(dynamicArray.getIndexByValue(5));
        dynamicArray.print();
    }
}